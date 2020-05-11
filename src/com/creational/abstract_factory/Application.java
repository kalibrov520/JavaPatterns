package com.creational.abstract_factory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
