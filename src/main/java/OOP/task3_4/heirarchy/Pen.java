package OOP.task3_4.heirarchy;

import OOP.task3_4.heirarchy.enums.Color;
import OOP.task3_4.heirarchy.enums.PenType;

import java.util.Objects;

public class Pen extends WritingInstrument {

    private double price;
    private String name = "Pen";
    private Color color;
    private PenType type;

    public final String name() {
        return name;
    }

    public final double price() {
        return price;
    }

    public Pen() {
        this.color = Color.BLACK;
        this.price = 10.0;
        this.type = PenType.GEL;
    }

    public Pen(double price, Color color, PenType type) {
        this.price = price;
        this.color = color;
        this.type = type;
    }

    public Pen(double price, Color color) {
        super(price, color);
    }

    public PenType getType() {
        return type;
    }

    public void setType(PenType type) {
        this.type = type;
    }

    private boolean canEqual(Object other) {
        return other instanceof Stationary;
    }

    @Override
    public boolean equals(Object o) {
        final Pen pen;
        return o == this
                || o instanceof Pen
                && (pen = (Pen) o).canEqual(this)
                && Double.compare(this.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

