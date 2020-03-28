package org.skillbox.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> medicalList = new HashSet<>();
        for (; ; ) {
            String comnand = reader.readLine().trim();
            if (comnand.equals("LIST")) {
                if (medicalList.size() > 0) {
                    System.out.println("Список медикаментов:");
                    for (String medical : medicalList)
                        System.out.println(medical);
                } else {
                    System.out.println("Список медикаментов пуст! Пожалуйста заполните егою");
                }
            } else {
                medicalList.add(comnand);
            }
        }
    }
}
