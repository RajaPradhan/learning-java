package com.learningjava.basics;

public class Basics {
    private static int num = 10;

    //    num = 20; // compilation error
    static void printNum() {
        System.out.println("num: " + num);
        num = 20;
        System.out.println("num: " + num);
    }

    public static void main(String[] args) {
        Test test = new Test("\nhello world!"); // no need to import the class
        System.out.println(test.getMessage());
        System.out.println(new Test("test demo")); // uses the overriden toString()

        printNum(); // must be a static method

        System.out.println(new Basics()); // OK

        System.out.println(new Sample()); // OK
    }
}

class Sample {

}
