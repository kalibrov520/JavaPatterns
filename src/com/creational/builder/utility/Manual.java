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

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        return info;
    }
}
