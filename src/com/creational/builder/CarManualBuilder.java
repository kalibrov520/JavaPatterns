package com.creational.builder;

import com.creational.builder.utility.Engine;
import com.creational.builder.utility.Manual;
import com.creational.builder.utility.Transmission;
import com.creational.builder.utility.Type;

public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission);
    }
}
