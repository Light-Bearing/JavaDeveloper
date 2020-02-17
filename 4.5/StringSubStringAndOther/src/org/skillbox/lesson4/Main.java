package org.skillbox.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i <= 512; i++) {
            System.out.println("i: " + i + " char: " + (char) i);
        }
        for (int i = (int) 'А'; i <= (int) 'я'; i++) {
            System.out.println("i: " + i + " char: " + (char) i);
        };
		System.out.println("Введите ФИО:");
        String fio = (new BufferedReader(new InputStreamReader(System.in))).readLine().trim();
        int i = fio.indexOf(' ');
        int k = fio.lastIndexOf(' ');
        
        String surname = fio.substring(0, i);
        String name = fio.substring(i, k);
        String patronymic = fio.substring(k, fio.length());

        System.out.println("Фамилия: " + surname);
        System.out.println("Имя:" + name);
        System.out.println("Отчество:" + patronymic);

    }
}
