package OOP.task3_4.heirarchy;

import java.util.Objects;

public abstract class Stationary {

    private double price;
    private String name;

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }


    public Stationary() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    private boolean canEqual(Object other) {
        return other instanceof Stationary;
    }

    @Override
    public boolean equals(Object o) {
        final Stationary stationary;
        return o == this
                || o instanceof OOP.task2.Stationary
                && (stationary = (Stationary) o).canEqual(this)
                && Double.compare(this.price, price) == 0
                && Objects.equals(this.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

}
