package com.abstract_factory;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("Create LinuxButton");
    }
}
