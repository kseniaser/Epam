package OOP.task3_4.heirarchy;

import OOP.task3_4.heirarchy.enums.Format;

public abstract class Storage extends Stationary {

    private double price;
    private String name;
    private Format format;

    public Storage() {
        this.format = Format.A4;
        this.price = 10.0;
    }

    public Storage(double price, Format format) {
        this.price = price;
        this.format = format;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

}
