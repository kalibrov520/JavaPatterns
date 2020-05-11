package com.abstract_factory;

public class AbstractFactoryDemo {
    public static Application configureProgram() {
        Application program;
        GuiFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }
        program = new Application(factory);

        return program;
    }

    public static void main(String[] args) {
        configureProgram().paint();
    }
}
