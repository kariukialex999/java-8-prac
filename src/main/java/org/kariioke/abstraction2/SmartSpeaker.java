package org.kariioke.abstraction2;

public class SmartSpeaker extends SmartDevice{
    private int volume;

    SmartSpeaker(String name, boolean isOn, int volume) {
        super(name, isOn);
        this.volume = volume;
    }

    @Override
    void performAction() {
        System.out.println("Playing music on " + getName() + " at volume " + volume);
    }

    public int getVolume() {
        return volume;
    }
}
