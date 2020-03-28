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
        ArrayList<PassportData> pasportData = new ArrayList<>();
        int comand = -1;
        do {
            System.out.println("Выберете вариaнт выполнения программы:");
            System.out.println("1 - автоматическое заполнение полного номера паспорта. Вы вводите только ФИО");
            System.out.println("2 - автоматизированное выполнение программы. Вам будет предлагаться на выбор вводить каждый раз номер паспорта, или сгенерировать его");
            System.out.println("3 - ручной вариант выполнениz программы. Вы все будете вводить сами");


            String comandSTR = reader.readLine().trim();
            if (Pattern.compile("[123]").matcher(comandSTR).matches()) {
                comand = Integer.parseInt(comandSTR);
                String[] pasportNum = new String[3];
                String fio;
                switch (comand) {
                    case 1:
                        String countPasports;
                        do {
                            System.out.println("Введите количество записей паспортов:");
                            countPasports = reader.readLine().trim();
                        } while (!Pattern.compile("\\d+").matcher(countPasports).matches() && (Long.parseLong(countPasports) < 8199991800L));
                        Long count = Long.parseLong(countPasports);
                        for (int i = 0; i < count; i++) {
                            pasportNum = generatePasportNumber(reader, pasportData).trim().split("\\s");
                            fio = getFIO(reader, pasportNum[0] + " " + pasportNum[1] + " " + pasportNum[2]);
                            pasportData.add(new PassportData(Integer.parseInt(pasportNum[0]), Integer.parseInt(pasportNum[1]), Integer.parseInt(pasportNum[2]), fio));
                        }
                        break;
                    case 2:
                        System.out.println("команда End - завершает формирование базы паспортов и приступает к операции выдачи ФИО по номеру паспорта.");
                        pasportNum = askAboutHowDuing(reader, pasportData).trim().split("\\s");
                        fio = getFIO(reader);
                        pasportData.add(new PassportData(Integer.parseInt(pasportNum[0]), Integer.parseInt(pasportNum[1]), Integer.parseInt(pasportNum[2]), fio));
                        break;
                    case 3:
                        System.out.println("команда End - завершает формирование базы паспортов и приступает к операции выдачи ФИО по номеру паспорта.");
                        pasportNum = enterPasportNum(reader, pasportData).trim().split("\\s");
                        fio = getFIO(reader);
                        pasportData.add(new PassportData(Integer.parseInt(pasportNum[0]), Integer.parseInt(pasportNum[1]), Integer.parseInt(pasportNum[2]), fio));
                        break;
                }
            }
        }
        while (comand == -1);
    }

    private static String getFIO(BufferedReader reader, String NumPasport) throws IOException {
        String fio;
        do {
            System.out.println("Введите ФИО для паспорта №" + NumPasport + " :");
            fio = reader.readLine().trim();
        } while (!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(fio).matches());
        return fio;
    }

    private static String getFIO(BufferedReader reader) throws IOException {
        String fio;
        do {
            System.out.println("Введите ФИО:");
            fio = reader.readLine().trim();
        } while (!Pattern.compile("[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+\\s[А-ЯЁ&&[^ЪЬЫ]]{1}[а-яё]+$").matcher(fio).matches());
        return fio;
    }

    private static String enterPasportNum(BufferedReader reader, ArrayList<PassportData> pasportData) throws IOException {
        String pasportNum;
        do {
            System.out.println("Введите номер паспорта в формате XX XX YYYYYY, где XX XX — 4-значная серия паспорта и YYYYYY — 6-значный номер паспорта:");
            pasportNum = reader.readLine().trim();
        }
        while (!Pattern.compile("\\d{2}\\s\\d{2}\\s\\d{6}").matcher(pasportNum).matches() && PassportData.ExistsRegionNum(Integer.valueOf(pasportNum.substring(0, 2))));
        if (RepeatedSerial(pasportNum, pasportData))
            for (PassportData data : pasportData) {
                if (pasportData.equals(data))
                    System.out.println("Номер паспорта: " + data.getPasportNum() + " принадлежит: " + data.getFIO());

            }
        return pasportNum;
    }

    private static String askAboutHowDuing(BufferedReader reader, ArrayList<PassportData> pasportData) throws IOException {
        System.out.println("Введите \"1\" если вы хотите что бы номер паспорта был сгенерирован, если нет то введите что-то другое.");
        String comand = reader.readLine().trim();
        return comand.equals("1") ? generatePasportNumber(reader, pasportData) : enterPasportNum(reader, pasportData);
    }

    private static String generatePasportNumber(BufferedReader reader, ArrayList<PassportData> pasportData) throws IOException {
        String pasportNum;
        pasportNum = generateSerialRegion() + " " + generateSerialNumber() + " " + generatePasportNum();
        while (RepeatedSerial(pasportNum, pasportData)) ;
        return pasportNum;

    }

    private static String generatePasportNum() {
        return PassportData.DigitToString(generateNumper(1000000, 999999));
    }

    private static Integer generateNumper(int min, int max) {
        Random rnd = new Random(System.currentTimeMillis());
        int number = min + rnd.nextInt(max - min + 1);
        return number;
    }

    private static String generateSerialNumber() {
        return PassportData.DigitToString(generateNumper(0, 99));
    }

    private static String generateSerialRegion() {
        return PassportData.DigitToString(generateNumper(2, 99));
    }

    private static boolean RepeatedSerial(String pasportNum, ArrayList<PassportData> passportData) {
        for (PassportData passport : passportData) {
            if (passport.getPasportNum().equals(pasportNum))
                return true;
        }
        return false;
    }


}
