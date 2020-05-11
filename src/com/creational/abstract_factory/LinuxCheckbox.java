package com.creational.abstract_factory;

public class LinuxCheckbox implements  Checkbox {
    @Override
    public void paint() {
        System.out.println("Create LinuxCheckbox");
    }
}
