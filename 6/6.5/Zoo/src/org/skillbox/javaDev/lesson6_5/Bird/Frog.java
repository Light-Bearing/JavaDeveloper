package org.skillbox.javaDev.lesson6_5.Bird;

import java.util.Comparator;

public class Frog extends Animals {

    public Frog() {
        super(10 + 300 * Math.random());
    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public void voice() {
        System.out.println("Kva-kva! My weight is " + getWeigth() + " gramms");
    }

}
