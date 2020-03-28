package org.skillbox.lesson4;

public class Main {

    public static void main(String[] args) {
        System.out.println(24.0 * 0.1);
        System.out.println(.3 + 0.3 + 0.3);
        System.out.println(0.0);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("0.0 > Double.MIN_VALUE: " + (0.0 > Double.MIN_VALUE));
        System.out.println("Math.ulp():" + Math.ulp(10.0));
    }
}
