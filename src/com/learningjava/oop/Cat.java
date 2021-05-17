package com.learningjava.oop;

public class Cat extends Animal {
    Cat(String name) {
        setName(name);
    }

    public void printName() {
        System.out.println(getName());
    }
}
