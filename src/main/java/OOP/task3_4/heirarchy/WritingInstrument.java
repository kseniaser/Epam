package OOP.task3_4.heirarchy;

import OOP.task3_4.heirarchy.enums.Color;

public abstract class WritingInstrument extends Stationary {

    private double price;
    private String name;
    private Color color;

    public WritingInstrument() {
        this.color = Color.BLACK;
        this.price = 10.0;
    }

    public WritingInstrument(double price, Color color) {
        this.price = price;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}


