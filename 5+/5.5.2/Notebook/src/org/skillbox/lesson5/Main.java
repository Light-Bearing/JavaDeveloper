package org.skillbox.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, String> notebook = new TreeMap<>();
        for (; ; ) {
            System.out.println("Введите номер　телефона или имя абонента, или команду LIST для вывода всех записей:");
            String command = reader.readLine().trim();
            if (command.equals("LIST")) {
                for (String name : notebook.keySet()) {
                    System.out.println("Имя: " + name + " - " + notebook.get(name));
                }
            } else if (!notebook.containsKey(command) && !notebook.containsValue(command.replaceAll("[^0-9]+", ""))) {
                if (Pattern.compile("[a-zA-ZА-Яа-я\\s]+").matcher(command).matches()) {
                    System.out.println("Введите номер телефона:");
                    notebook.put(command, reader.readLine().trim().replaceAll("[^0-9]+", ""));
                } else {
                    System.out.println("Введите имя абонента:");
                    notebook.put(reader.readLine().trim(), command.replaceAll("[^0-9]+", ""));
                }
            } else {
                if (notebook.containsKey(command))
                    System.out.println("Имя: " + command + " - " + notebook.get(command));
                else {
                    String phoneNumber = command.replaceAll("[^0-9]+", "");
                    if (notebook.containsValue(phoneNumber)) {
                        for (String name : notebook.keySet())
                            if (notebook.get(name).equals(phoneNumber))
                                System.out.println("Имя: " + name + " - " + command);

                    }
                }
            }
        }
    }
}
