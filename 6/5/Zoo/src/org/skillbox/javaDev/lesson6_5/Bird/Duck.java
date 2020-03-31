package org.skillbox.javaDev.lesson6_5.Bird;

public class Duck extends Flying {
    public Duck() {
        super(10 + 3500 * Math.random());
    }


    public void swim() {

    }

    private void catchFish() {

    }

    @Override
    public void eat() {
        catchFish();
        ingest();
        digest();
    }

    @Override
    public void voice() {
        System.out.println("Krya! Krya! My weight is " + getWeigth() + " gramms");
    }
}
