package org.skillbox.lesson5;

public class Main {

    public static void main(String[] args) {
        String[] rainbow = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Vailet"};
        //Ввариант №1
        for (int i = rainbow.length - 1; i >= 0; i--)
            System.out.println(rainbow[i]);
        //Ввариант №2
        for (int i = 0;i<rainbow.length/2;i++) {
            String     color = rainbow[rainbow.length - 1 - i];
            rainbow[rainbow.length - 1 - i] = rainbow[i];
            rainbow[i]=color;
        }
        for(String color: rainbow)
            System.out.println(color);
    }
}
