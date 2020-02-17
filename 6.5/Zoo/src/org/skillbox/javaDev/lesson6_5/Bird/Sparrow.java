package org.skillbox.javaDev.lesson6_5.Bird;

public class Sparrow extends Flying {
    public Sparrow() {
        super(10 + 300 * Math.random());
    }

    @Override
    public void eat() {

    }

    @Override
    public void voice() {
        System.out.println("Chirik! Chirik!  My weight is " + getWeigth() + " gramms");
    }
}
