package org.skillbox.javaDev.lesson6_2;

public class Hen extends Flightless {
    public void dubGrains(){

    }

    @Override
    public void eat() {
        dubGrains();
        super.eat();
    }
}
