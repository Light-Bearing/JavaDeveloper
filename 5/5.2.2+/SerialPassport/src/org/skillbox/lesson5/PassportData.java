package org.skillbox.lesson5;

import javax.print.attribute.standard.MediaSizeName;

public class PassportData {
    public static final int AUTO_ENTER = 0;
    public static final int MANUAL_ENTER = 1;

    private int serialRegion;
    private int serialYear;
    private int number;
    private String FIO;

    public PassportData(int region, int year, int number, String fio) {
        if (ExistsRegionNum(region))
            serialRegion = region;
        else
            serialRegion = -1;
        serialYear = year;
        this.number = number;
        FIO = fio;
    }

    public static String DigitToString(Integer digit) {
        return digit < 10 ? "0" + digit : digit.toString();
    }


    public static boolean ExistsRegionNum(int firstTwoDigit) {
        return ExistsRegionNum(firstTwoDigit, AUTO_ENTER);
    }

    public static boolean ExistsRegionNum(int firstTwoDigit, Integer workMode) {
        int[] dontExistRegionNum = {2, 9, 13, 16, 21, 23, 31, 39, 43, 48, 51, 55, 59, 62, 72, 74};
        if (firstTwoDigit <= 0) {
            if (workMode == MANUAL_ENTER)
                System.out.println("Не правильно введена серия паспорта");
            return false;
        }
        for (int num : dontExistRegionNum)
            if (num == firstTwoDigit) {
                if (workMode == MANUAL_ENTER)
                    System.out.println("Не существует региона на территории РФ с введенным ОКАТО");
                return false;
            }
        return true;
    }

    private String getSerialRegion() {
        return serialRegion > 0 ? DigitToString(serialRegion) : "";
    }

    private String getSerialYear() {
        return DigitToString(serialYear);
    }

    private int getNumber() {
        return number;
    }

    public String getFIO() {
        return FIO;
    }

    public String getPasportNum() {
        return getSerialRegion() + " " + getSerialYear() + " " + getNumber();
    }
}
