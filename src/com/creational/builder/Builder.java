package com.creational.builder;

import com.creational.builder.utility.Engine;
import com.creational.builder.utility.Transmission;
import com.creational.builder.utility.Type;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
}
