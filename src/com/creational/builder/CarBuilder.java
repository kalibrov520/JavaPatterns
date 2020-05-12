package com.creational.builder;

import com.creational.builder.utility.Car;
import com.creational.builder.utility.Engine;
import com.creational.builder.utility.Transmission;
import com.creational.builder.utility.Type;

public class CarBuilder implements Builder<CarBuilder> {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public CarBuilder setType(Type type) {
        this.type = type;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Car build() {
        return new Car(this.type, this.seats, this.engine, this.transmission);
    }
}
