package org.skillbox.javaDev.lesson6_4.Bird;

public class Hen extends Flightless {
    public void dubGrains(){

    }

    @Override
    public void eat() {
        dubGrains();
        ingest();
        digest();
    }
}
