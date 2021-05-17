package com.learningjava.oop;

public class Test {
    private static final double PI = 3.14; // must be initialized
    final String val = "abc";

    public static void main(String[] args) {
        Animal cat = new Cat("Lucy"); // Animal (superclass) is the reference type. Cat (subclass) is the object type
        System.out.println(cat.getName());
//      System.out.println(cat.printName()); // Compilation error: Cannot use methods not present in the reference type

        System.out.println("PI = " + PI);
        System.out.println("PI = " + Test.PI); // Ok
    }
}
