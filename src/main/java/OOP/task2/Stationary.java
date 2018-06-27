package OOP.task2;

import java.util.Objects;

public class Stationary {

    private Tool tool;
    private int number;
    private double price;

    public Stationary(Tool tool, int number, double price) {
        this.tool = tool;
        this.number = number;
        this.price = price;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalPrice() {
        return price * number;
    }

    @Override
    public boolean equals(Object o) {
        final Stationary stationary;
        return o == this
                || o instanceof Stationary
                && (stationary = (Stationary) o).canEqual(this)
                && this.tool == stationary.tool
                && this.number == stationary.number
                && Double.compare(this.price, stationary.price) == 0;
    }

    private boolean canEqual(Object other) {
        return other instanceof Stationary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tool, number, price);
    }

    @Override
    public String toString() {
        return "{" +
                "tool=" + tool +
                ", number=" + number +
                ", price=" + price +
                '}';
    }
}


enum Tool {
    ERASER,
    PEN,
    PAPER,
    NOTEBOOK,
    FOLDER
}
