package com.creational.builder.utility;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Manual(Type type, int seats, Engine engine, Transmission transmission) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "type=" + type +
                ", seats=" + seats +
                ", engine=" + engine +
                ", transmission=" + transmission +
                '}';
    }
}
