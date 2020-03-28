package org.skillbox.javaDev.lesson6_5.Bird;

abstract public class Animals implements Vertebrata {
    private double weigth;

    Animals(double weigth) {
        this.weigth = weigth;
    }

    double getWeigth() {
        return weigth;
    }
}
