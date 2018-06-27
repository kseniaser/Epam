package OOP.task6;

public class NuclearSubmarine {

    private String name;
    private Engine engine;

    public NuclearSubmarine(String name) {
        this.name = name;
        engine = new Engine();
    }

    public void setSail(int time) {
        engine.start(time);
    }

    public void setFuel(int fuel) {
        engine.fuelling(fuel);
    }

    public void getFuel() {
        System.out.println(engine.fuel);
    }

    public void upload() {
        engine = new Engine();
        setFuel(100);
    }

    class Engine {
        private int fuel;

        private Engine() {
        }

        public void start(int time) {

            if (fuel == 0) {
                System.out.println("No fuel");
            }
            if (fuel < time) {
                System.out.println("Sailing time is " + fuel);
                System.out.println("No fuel");
                fuel = 0;
            }
            if (fuel >= time) {
                System.out.println("Sailing time is " + time);
                fuel -= time;
            }
        }

        private void fuelling(int fuel) {
            this.fuel = ((this.fuel + fuel) / 100 == 0) ? this.fuel + fuel : 100;
            System.out.println("Fueled");
        }

    }

}
