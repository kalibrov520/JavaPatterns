package com.creational.factory_method;

public abstract class Dialog {
    public void renderWindows() {
        Button okButton = createButton();
        okButton.render();
    }

    // Фабричный метод. Классы расширяющие базовый могут создавать конкретные объекты.
    public abstract Button createButton();
}
