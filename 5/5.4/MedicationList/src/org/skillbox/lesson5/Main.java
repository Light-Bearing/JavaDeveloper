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
            System.out.println("Введите название лекарства, или команду LIST для вывода списка лекарств:");
            String comnand = reader.readLine().trim();
            if (comnand.equals("LIST")) {
                if (medicalList.size()==0){
                    System.out.println("Список лекарств пуст");
                    continue;
                }
                for (String medical : medicalList)
                    System.out.println(medical);
            } else {
                medicalList.add(comnand);
            }
        }
    }
}
