package com.abstract_factory;

public class AbstractProgram {
    private Button button;
    private Checkbox checkbox;

    public AbstractProgram(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
