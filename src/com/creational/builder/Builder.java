package com.creational.builder;

import com.creational.builder.utility.Engine;
import com.creational.builder.utility.Transmission;
import com.creational.builder.utility.Type;

public interface Builder<T extends Builder<T>> {
    T setType(Type type);
    T setSeats(int seats);
    T setEngine(Engine engine);
    T setTransmission(Transmission transmission);
}
