package org.skillbox.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Passport> passports = new ArrayList<>();
        for (; ; ) {
            System.out.println("Введите номер паспорта в формате \"XX XX XXXXXX\" \n" +
                    "или нажмите Enter для автоматической генрации серии.\n" +
                    "Если введете серию и номер паспорта вводённые ранее - увидете ФИО, которое к нему приписано.\n" +
                    "Введите List - для вывода списка паспортов" +
                    "Введитедло Exit для выхода из программы:");
            String serialCode = reader.readLine().trim();
            if (serialCode.equals("List")) {
                if (passports.size() > 0)
                    for (Passport passport : passports) {
                        passport.println();
                    }
                else System.out.println("Список паспортов пуст, пожалуйста введите данные");
            } else if (serialCode.equals("Exit")) {
                System.out.println("Вы действительно хотите заверишть работу программы? (Д/Н)");
                serialCode = reader.readLine().trim();
                if (serialCode.toUpperCase().equals("Д") || (serialCode.toUpperCase().equals("Y")))
                    break;
            } else if (serialCode.equals("")) {
                String serial = generateSerial(passports);
                System.out.println("Сгенерирован номер серии: " + serial);
                System.out.println("Введите нрмер паспорта в формате \"XXXXXX\" - где X - это цифра:");
                String number = reader.readLine().trim();
                if (Pattern.compile("\\d{6}$").matcher(number).matches()) {
                    String fio = getFio(reader);
                    passports.add(new Passport(serial, number, fio));
                } else {
                    System.out.println("Веден не правильный номер паспорта");
                }
            } else if (Pattern.compile("\\d{2}\\s\\d{2}\\s\\d{6}$").matcher(serialCode).matches()) {
                int existRegionNumber = existsRegionNum(Integer.parseInt(serialCode.substring(0, 2)));
                switch (existRegionNumber) {
                    case 0: {
                        String[] arr = Pattern.compile("\\s").split(serialCode, 0);
                        String serial = arr[0] + " " + arr[1];
                        String number = arr[2];
                        Integer index = findPassport(serial, number, passports);
                        if (index == null) {
                            String fio = getFio(reader);
                            passports.add(new Passport(serial, number, fio));
                        } else {
                            passports.get(index).println();
                        }
                    }
                    break;
                    case 1:
                        System.out.println("Не правильно введена серия паспорта");
                        break;
                    case 2:
                        System.out.println("Не существует региона на территории РФ с введенным ОКАТО");
                        break;
                }
            } else {
                System.out.println("Не правильный ввод серии и номера паспорта");
            }
        }
    }

    private static String getFio(BufferedReader reader) throws IOException {
        System.out.println("Введите ФИО владельца:");
        for (; ; ) {
            String str = reader.readLine().trim();
            if (Pattern.compile("^[А-ЯЁ&&[^ЪЬ]][а-яё]*([-][А-ЯЁ&&[^ЪЬ]][а-яё]*)?\\s[А-ЯЁ&&[^ЪЬ]][а-яё]*[\\s[А-ЯЁ&&[^ЪЬ]][а-яё]]*$").matcher(str).matches()) {
                return str;
            } else {
                System.out.println("Не правильно введено ФИО, повторите ввод:");
            }
        }
    }


    private static String generateSerial(ArrayList<Passport> passports) {
        String okato, num;
        Random random = new Random();
        for (; ; ) {
            int param = random.nextInt(100);
            if (existsRegionNum(param) == 0) {
                okato = digitToString(param);
                num = digitToString(random.nextInt(100));
                if (notMoreMillion(okato + " " + num, passports))
                    break;
            }

        }
        return okato + " " + num;
    }

    private static boolean notMoreMillion(String serial, ArrayList<Passport> passports) {
        int i = 0;
        for (Passport p : passports) {
            if (p.getSerial().equals(serial))
                i++;
        }
        return i < 1000000;
    }

    private static Integer findPassport(String serial, String number, ArrayList<Passport> passports) {
        int i = 0;
        while (i < passports.size()) {
            if (passports.get(i).getSerial().equals(serial) && passports.get(i).getNumber().equals(number))
                return i;
            i++;
        }
        return null;
    }

    private static String digitToString(Integer digit) {
        return digit < 10 ? "0" + digit : digit.toString();
    }

    private static int existsRegionNum(int firstTwoDigit) {
        final int[] notExistRegionNum = {2, 9, 13, 16, 21, 23, 31, 39, 43, 48, 51, 55, 59, 62, 72, 74};
        if (firstTwoDigit <= 0) {
            return 1;
        }
        for (int value : notExistRegionNum)
            if (value == firstTwoDigit) {
                return 2;
            }
        return 0;
    }
}
