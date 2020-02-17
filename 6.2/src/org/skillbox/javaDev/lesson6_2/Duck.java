package org.skillbox.javaDev.lesson6_2;

public class Duck extends Flying {
    public void swim(){

    }

    public void catchFish(){

    }

    @Override
    public void eat() {
        catchFish();
        super.eat();
    }
}
