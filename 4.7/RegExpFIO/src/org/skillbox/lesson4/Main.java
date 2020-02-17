package org.skillbox.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите ФИО:");
        String fio = (new BufferedReader(new InputStreamReader(System.in))).readLine().trim();
        //String words[]=fio.replaceAll("[\\s]{2,}", " ").split("\\s");

        if (!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(fio).matches())
            System.out.println("Неверно введено Ф.И.О.");
        else {
            String[] words = fio.split("\\s");
            System.out.println("Фамилия: " + words[0]);
            System.out.println("Имя: " + words[1]);
            System.out.println("Отчество: " + words[2]);
        }
    }
}
