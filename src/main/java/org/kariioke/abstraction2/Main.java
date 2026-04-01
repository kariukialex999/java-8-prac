package org.kariioke.abstraction2;

public class Main {
    static void main () {
        SmartLight smartLight = new SmartLight("Nexus", true, 90);
        System.out.println("smartlight is toggled on?: " + smartLight.isOn());
        smartLight.toggleAction();
        System.out.println("smartlight is toggled on?: " + smartLight.isOn());
        smartLight.performAction();
        System.out.println(" ");

        SmartSpeaker smartSpeaker = new SmartSpeaker("JBL", false, 40);
        smartSpeaker.performAction();
        System.out.println("smartspeaker is toggled on?: " + smartSpeaker.isOn());
        smartSpeaker.toggleAction();
        System.out.println("smartspeaker is toggled on?: " + smartSpeaker.isOn());
        smartSpeaker.performAction();
    }
}
