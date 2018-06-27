package OOP.task3_4.heirarchy;

import OOP.task3_4.heirarchy.enums.Color;
import OOP.task3_4.heirarchy.enums.Format;

import java.util.Objects;

public class Paper extends Storage {

    private double price;
    private String name = "Paper";
    private Format format;
    private Color color;

    public final String name() {
        return name;
    }

    public final double price() {
        return price;
    }

    public Paper() {
        this.format = Format.A4;
        this.price = 10.0;
        this.color = Color.WHITE;
    }

    public Paper(Format format, double price, Color color) {
        this.color = color;
        this.price = price;
        this.format = format;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private boolean canEqual(Object other) {
        return other instanceof Stationary;
    }

    @Override
    public boolean equals(Object o) {
        final Paper paper;
        return o == this
                || o instanceof Paper
                && (paper = (Paper) o).canEqual(this)
                && Double.compare(this.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Paper{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", Format=" + format +
                ", color=" + color +
                '}';
    }
}



