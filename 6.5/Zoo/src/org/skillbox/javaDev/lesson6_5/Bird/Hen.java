package org.skillbox.javaDev.lesson6_5.Bird;

public class Hen extends Flightless {
    private void dubGrains() {

    }

    public Hen() {
        super(10 + 1500 * Math.random());
    }

    @Override
    public void eat() {
        dubGrains();
        ingest();
        digest();
    }

    @Override
    public void voice() {
        System.out.println("Ko-ko-ko!My Wight is " + getWeigth() + " gramms");
    }
}
