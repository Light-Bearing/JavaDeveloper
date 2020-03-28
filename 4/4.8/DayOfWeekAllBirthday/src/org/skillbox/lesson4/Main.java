package org.skillbox.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Введите дату своего дня рождения в формате ДД.ММ.ГГГГ:");
        String numbers[] = (new BufferedReader(new InputStreamReader(System.in))).readLine().trim().split("\\.");
        int[] dateBirtday = new int[3];
        for (int i = 0; i < 3; i++) {
            dateBirtday[i] = Integer.parseInt(numbers[i]);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1987, Calendar.FEBRUARY, 21);
        calendar.set(dateBirtday[2], dateBirtday[1] - 1, dateBirtday[0]);
        int i = 0;
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy - EE", Locale.ENGLISH);
        Date date = calendar.getTime();
        while (!date.after(new Date())) {
            System.out.println(i + " " + format.format(date));
            calendar.add(Calendar.YEAR, 1);
            i++;
            date = calendar.getTime();
        }
    }
}
