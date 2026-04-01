package org.kariioke.abstraction2;

public abstract class SmartDevice {
    private String name;
    private boolean isOn;

    SmartDevice(String name, boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    abstract void performAction();

    void toggleAction() {
        this.isOn = !this.isOn;

        String state = isOn ? "ON" : "OFF";

        System.out.println(name + " is now " + state);
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }
}
