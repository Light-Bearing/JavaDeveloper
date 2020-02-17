package org.skillbox.lesson1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateFormat dateFormat2 = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
        Date date = new Date();
//        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat2.format(date));
    }
}
