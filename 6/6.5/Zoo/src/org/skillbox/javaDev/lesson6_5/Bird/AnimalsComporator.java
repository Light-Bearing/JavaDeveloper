package org.skillbox.javaDev.lesson6_5.Bird;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class AnimalsComporator implements Comparator<Animals> {

    @Override
    public int compare(Animals a1, Animals a2) {
        return (int) Math.round(a1.getWeigth() - a2.getWeigth());
    }

}
