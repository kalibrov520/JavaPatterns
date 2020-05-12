package com.creational.builder;

import com.creational.builder.utility.Engine;
import com.creational.builder.utility.Manual;
import com.creational.builder.utility.Transmission;
import com.creational.builder.utility.Type;

public class CarManualBuilder implements Builder<CarManualBuilder> {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public CarManualBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public CarManualBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarManualBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarManualBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Manual build() {
        return new Manual(type, seats, engine, transmission);
    }
}
