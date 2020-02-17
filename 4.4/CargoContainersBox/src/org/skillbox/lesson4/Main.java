package org.skillbox.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int COUNT_BOX_ON_CONTAINER = 27;
    public static final int COUNT_CONTAINER_ON_CAR = 12;

    public static void main(String[] args) {
        System.out.println("Введите количество ящиков:");
        try {
            int countBox = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
            double i = 0.;
            do {
                if (Math.ceil(i / COUNT_CONTAINER_ON_CAR / COUNT_BOX_ON_CONTAINER) == i / COUNT_CONTAINER_ON_CAR / COUNT_BOX_ON_CONTAINER)
                    System.out.println("Грузовик " + (int) (i / COUNT_CONTAINER_ON_CAR / COUNT_BOX_ON_CONTAINER + 1) + ":");
                if (Math.ceil(i / COUNT_BOX_ON_CONTAINER) == i / COUNT_BOX_ON_CONTAINER)
                    System.out.println("Контейнер " + (int) (i / COUNT_BOX_ON_CONTAINER + 1) + ":");
                System.out.println("Ящик " + (int) (i + 1));
                i++;
            }
            while (i < countBox);
            System.out.println("Для " + (int) i + " ящиков, необходимо: " + (int) Math.ceil(i / COUNT_BOX_ON_CONTAINER) + " контейнеров, которые помесяттся в: " + (int) Math.ceil(i / COUNT_BOX_ON_CONTAINER / COUNT_CONTAINER_ON_CAR) + " грузовиков ");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error:" + e.getLocalizedMessage());
        }
    }
}
