package org.kariioke.abstraction;

public abstract class Animal {

    abstract void makeSound();

    void sleep() {
        System.out.println("Zzz...");
    }
}