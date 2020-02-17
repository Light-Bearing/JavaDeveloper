package org.skillbox.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> aircraftParking = new ArrayList<>();
        for (; ; ) {
            System.out.println("Введите команду, или бортовой номер самолета принадлежащего самолетам РФ");
            String command = reader.readLine().trim();
            if (command.equals("exitAll")) {
                for (int i = aircraftParking.size() - 1; i >= 0; i--) {
                    System.out.println(aircraftParking.get(i));
                }
                aircraftParking.clear();
            } else if (command.equals("exitLast")) {
                System.out.println(aircraftParking.get(aircraftParking.size() - 1));
                aircraftParking.remove(aircraftParking.size() - 1);
            } else if (aircraftParking.size() == 5) {
                System.out.println("Извините, но мест больше нет, найдите другую стоянку");
            } else {
                if (!Pattern.compile(command.charAt(1)=='A'?"RA-\\d{4}[0-9A-Z]":"RF-\\d{5}").matcher(command).matches())
                    System.out.println("В РФ нет самолетов с таким бортовым номером");
                else
                    aircraftParking.add(command);
            }
        }
    }
}
