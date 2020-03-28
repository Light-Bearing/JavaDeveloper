package org.skillbox.javaDev.lesson6_5.Bird;

public class CamelBird extends Flightless {
    public CamelBird() {
        super(350 + 150000 * Math.random());
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eat() {

    }

    @Override
    public void voice() {
        System.out.println("Kurli! Kurli! My weight is " + getWeigth() + " gramms");
    }

}
