package org.skillbox.javaDev.lesson6_5;

import org.skillbox.javaDev.lesson6_5.Bird.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Loader {

    public static void main(String[] args) throws IOException {
        System.out.println("Напишите количество животных:");
        ArrayList<Animals> animals = new ArrayList<>();
        int countAnumal = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        for (int i = 0; i < countAnumal; i++) {
            addAnimals(animals);
        }
        Collections.sort(animals, new AnimalsComporator());
        for (Vertebrata animal : animals) {
            animal.voice();
        }
    }

    private static void addAnimals(ArrayList<Animals> animals) {
        Random random = new Random();
        switch (random.nextInt(5)) {
            case 0:
                animals.add(new Hen());
                break;
            case 1:
                animals.add(new Duck());
                break;
            case 2:
                animals.add(new CamelBird());
                break;
            case 3:
                animals.add(new Sparrow());
                break;
            case 4:
                animals.add(new Frog());
                break;
        }

    }


}
