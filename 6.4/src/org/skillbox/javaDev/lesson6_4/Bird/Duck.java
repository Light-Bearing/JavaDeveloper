package org.skillbox.javaDev.lesson6_4.Bird;

public class Duck extends Flying {
    public void swim(){

    }

    public void catchFish(){

    }

    @Override
    public void eat() {
        catchFish();
        ingest();
        digest();
    }
}
