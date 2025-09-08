package com.oops.polymorphism;

class Features {
    static void add(int a, int b) {
        System.out.println(a+b);
    }

    // Method - Overriding
    static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }

    // Method - Overloading
    static void add(double a,double b) {
        System.out.println(a+b);
    }

    static void subtract(int a, int b) {
        System.out.println(a-b);
    }

    // Method - Overloading
    static void subtract(double a,double b) {
        System.out.println(a-b);
    }

    static void multiply(int a, int b) {
        System.out.println(a*b);
    }

    //Method - Overriding
    static void multiply(int a, int b, int c) {
        System.out.println(a*b*c);
    }

    //Method - Overriding

    // Method - Overloading
    static void multiply(double a,double b) {
        System.out.println(a*b);
    }

    static void divide(int a, int b) {
        System.out.println(a/b);
    }

    // Method - Overloading
    static void divide(double a,double b) {
        System.out.println(a/b);
    }
}



public class Calculator {
    public static void main(String[] args) {

        Features.add(20, 40);
        Features.add(5.5, 5.5);
        Features.add(20, 30, 40);
        Features.subtract(60,20);
        Features.subtract(25.5,12.8);
        Features.multiply(71,37);
        Features.multiply(12.6,8.6);
        Features.multiply(11,22,33);
        Features.divide(1245, 5);
        Features.divide(1235.22, 5.2);
    }

}


