package org.kariioke.abstraction2;

public class SmartLight extends SmartDevice{
    public int brightness;

    SmartLight(String name, boolean isOn, int brightness) {
        super(name, isOn);
        this.brightness = brightness;
    }

    @Override
    void performAction() {
        System.out.println("Illuminating " + getName() + " Smart Light" + " at " + brightness + "% brightness");
    }

    public int getBrightness() {
        return brightness;
    }
}
