package OOP.task1;

import java.util.Objects;

public class Pen {

    private String color;
    private Type type;

    public Pen() {
        this.color = "BLACK";
        this.type = Type.GEL;
    }

    public Pen(String color) {
        this.color = color;
    }

    public Pen(String color, Type type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        final Pen pen;
        return o == this
                || o instanceof Pen
                && (pen = (Pen) o).canEqual(this)
                && this.type == pen.type
                && Objects.equals(color, pen.color);
    }

    private boolean canEqual(Object other) {
        return other instanceof Pen;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Pen is {" +
                "color='" + this.color + '\'' +
                ", type=" + this.type.name() +
                '}';
    }
}

enum Type {
    GEL,
    BALLPOINT,
    ROLLERBALL,
    STYLUS;

    @Override
    public String toString() {
        return name();
    }
}
