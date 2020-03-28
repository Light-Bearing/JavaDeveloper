package com.LB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберете вариент выполнения программы:");
        System.out.println("1 - без заполнения:");
        System.out.println("С заполнением. Введите серию паспорта в формате: \"XX XX\":");
        String serialCode = reader.readLine().trim();
        Passports serialPassport = new String[10000];
        if (serialCode.equals("1")) {
            // Вариант 1 без ввода данных, просто генерация
            int k = 0;
            for (int i = 0; i < 100; i++)
                if (ExistsRegionNum(i))
                    for (int j = 0; j < 100; j++) {
                        serialPassport[k++] = DigitToString(i) + " " + DigitToString(j);
                    }
            for (String serial : serialPassport)
                if (serial != null)
                    System.out.println(serial);
        } else {
            // Вариант 2 c форматированным вводом данных, с учетом фората ввода, ввод прекращается при нарушении правил ввода
            boolean stopRead = false;
            int i = 0;
            while (!stopRead) {
                if (Pattern.compile("\\d{2}\\s\\d{2}$").matcher(serialCode).matches() &&
                        ExistsRegionNum(Integer.parseInt(serialCode.substring(0, 2))) &&
                        !RepeatedSerial(serialCode, serialPassport)) {
                    serialPassport[i++] = serialCode;
                    System.out.println("Введите серию паспорта в формате: \"XX XX\":");
                    serialCode = reader.readLine().trim();
                } else {
                    System.out.println("Не правильно введена серия паспорта");
                    stopRead = true;
                }
            }

        }
        for (String code : serialPassport)
            if (code != null)
                System.out.println(code);
    }

    private static boolean RepeatedSerial(String serialCode, String[] serialPassport) {
        for (String serialCodes : serialPassport) {
            if (serialCode.equals(serialCodes))
                return true;
        }
        return false;
    }

    public static String DigitToString(Integer digit) {
        return digit < 10 ? "0" + digit : digit.toString();
    }

    public static boolean ExistsRegionNum(int firstTwoDigit) {
        int[] dontExistRegionNum = {2, 9, 13, 16, 21, 23, 31, 39, 43, 48, 51, 55, 59, 62, 72, 74};
        if (firstTwoDigit <= 0) {
            System.out.println("Не правильно введена серия паспорта");
            return false;
        }
        for (int i = 0; i < dontExistRegionNum.length; i++)
            if (dontExistRegionNum[i] == firstTwoDigit) {
                System.out.println("Не существует региона на территории РФ с введенным ОКАТО");
                return false;
            }
        return true;
    }
}
