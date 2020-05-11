package com.abstract_factory;

public class AbstractDemo {
    public static AbstractProgram configureProgram() {
        AbstractProgram program;
        GuiFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new LinuxFactory();
        }
        program = new AbstractProgram(factory);

        return program;
    }
}
