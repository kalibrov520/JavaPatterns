package com.creational.builder;

import com.creational.builder.utility.*;

public class Demo {
    public static void main(String[] args) {
//        Director director = new Director();
//
//        CarBuilder builder = new CarBuilder();
//        director.constructSportsCar(builder);
//
//        Car car = builder.build();
//        System.out.println("Car built:\n" + car.getType());
//
//        CarManualBuilder manualBuilder = new CarManualBuilder();
//        director.constructSportsCar(manualBuilder);
//
//        Manual carManual = manualBuilder.getResult();
//        System.out.println("\nCar manual built:\n" + carManual.toString());

        Car car = new CarBuilder().setType(Type.SPORTS_CAR)
                .setSeats(2)
                .setEngine(new Engine(2.0, 4.0))
                .setTransmission(Transmission.AUTOMATIC).build();

        System.out.println(car);

        Manual manual = new CarManualBuilder().setType(Type.CITY_CAR)
                .setSeats(4).setEngine(new Engine(1, 2))
                .setTransmission(Transmission.SEMI_AUTOMATIC).build();

        System.out.println(manual);

    }
}
