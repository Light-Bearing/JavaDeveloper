package org.skillbox.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> listCarNumOwners = new HashMap<>();
        for (; ; ) {
            System.out.println("Введите номер автомобиля");
            String number = ReplaceRusToEngLetters(reader.readLine().trim().toUpperCase());
            if (Pattern.compile("[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}\\d{2,3}").matcher(number).matches()) {
                if (listCarNumOwners.keySet().contains(number)) {
                    System.out.println(listCarNumOwners.get(number));
                }else{
                    System.out.println("Введите имя владельца номера автомобиля");
                    listCarNumOwners.put(number,reader.readLine().trim());
                }
            }
        }
    }

    private static String ReplaceRusToEngLetters(String src) {
        String[] letter = {"A", "B", "E", "K", "M", "H", "O", "P", "C", "T", "Y", "X"};
        String[] letterRus = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String res = "";
        for (int i = 0; i < src.length(); ++i) {
            String add = src.substring(i, i + 1);
            for (int j = 0; j < letterRus.length; j++) {
                if (letterRus[j].equals(add)) {
                    add = letter[j];
                    break;
                }
            }
            res += add;
        }
        return res;
    }
}
