package intro.task5;

public class Matrix {
    private int size;

    public Matrix(int size) {
        this.size = size;
    }

    private String buildMatrix() {
        String s ="";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                s += i == j ? "1" : "0";
            }
            s+="\n";
        }
        return s;
    }

    public void printMatrix(){
        System.out.print(buildMatrix());
    }
}
