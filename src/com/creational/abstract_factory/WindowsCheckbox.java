package com.creational.abstract_factory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Create WindowsCheckbox");
    }
}
