package org.skillbox.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    private static String letter = "ABEKMHOPCTYX";

    public static void main(String[] args) throws IOException {

        ArrayList<String> baseGibddNumList = new ArrayList<>();
        TreeSet<String> baseGibddNumTreeSet = new TreeSet<>();
        HashSet<String> baseGibddNumHashSet = new HashSet<>();
        for (int i = 0; i < letter.length(); i++)
            for (int j = 1; j < 999; j++)
                for (int k = 1; k < 998; k++)
                    for (int l = 0; l < letter.length(); l++)
                        for (int m = 0; m < letter.length(); m++)
                            if (numIsBlat(letter.charAt(i), j, k, letter.charAt(l), letter.charAt(m))) {
                                String number;
                                number = letter.charAt(i) + getThreeDigit(j) + letter.charAt(l) + letter.charAt(m) + getThreeRegionDigit(k);
                                baseGibddNumList.add(number);
                                baseGibddNumHashSet.add(number);
                                baseGibddNumTreeSet.add(number);
                            }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Bведите номер госрег знака, в формате уXXXууXX или уXXXууXXX, где y - это буква, x - цифра");
            String number = ReplaceRusToEngLetters(reader.readLine().trim().toUpperCase());
            if (Pattern.compile("[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}\\d{2,3}$").matcher(number).matches()) {
                long timeBegin = System.currentTimeMillis();
                System.out.println(number + " блатной? " + baseGibddNumList.contains(number) + " (Обычный поиск: " + (System.currentTimeMillis() - timeBegin) + "мс)");
                Collections.sort(baseGibddNumList);
                timeBegin = System.currentTimeMillis();
                System.out.println(Collections.binarySearch(baseGibddNumList, number) >= 0 ? true : false + " (Бинарный поиск:" + (System.currentTimeMillis() - timeBegin) + "мс)");
                timeBegin = System.currentTimeMillis();
                System.out.println(baseGibddNumHashSet.contains(number) + " (HashSet:" + (System.currentTimeMillis() - timeBegin) + "мс)");
                timeBegin = System.currentTimeMillis();
                System.out.println(baseGibddNumTreeSet.contains(number) + " (TreeSet:" + (System.currentTimeMillis() - timeBegin) + "мс)");
            } else
                System.out.println("Hе правильно ввели номер. пожалуйста повторите");
        }
    }

    private static boolean numIsBlat(char firstLetter, int threeDigit, int regionDigit, char secondLetter, char threeLetter) {
        String digit = getThreeDigit(threeDigit);
        String region = getThreeRegionDigit(regionDigit);
        return (firstLetter == secondLetter && firstLetter == threeLetter) || (digit.charAt(0) == digit.charAt(2) && digit.charAt(1) == digit.charAt(2)) ||
                (digit.equals(region)) ||
                ((region.length() == 3) && (
                        digit.charAt(0) == region.charAt(2) &&
                        digit.charAt(1) == region.charAt(1) &&
                        digit.charAt(2) == region.charAt(0))) ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "AMP") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "TPK") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "EKX") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "XKX") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "AOO") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "BOO") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "MOO") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "COO") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "CMP") ||
                compareCharAndString(firstLetter, secondLetter, threeLetter, "KOO")

                ;
    }

    private static String ReplaceRusToEngLetters(String src) {
        String[] letterRus = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        String res = "";
        for (int i = 0; i < src.length(); ++i) {
            String add = src.substring(i, i + 1);
            for (int j = 0; j < letterRus.length; j++) {
                if (letterRus[j].equals(add)) {
                    add = String.valueOf(letter.charAt(j));
                    break;
                }
            }
            res += add;
        }
        return res;
    }

    private static boolean compareCharAndString(char i, char l, char m, String str) {
        return (i == str.charAt(0) && l == str.charAt(1) && m == str.charAt(2));
    }


    private static String getThreeRegionDigit(int digit) {
        return digit < 10 ? "0" + String.valueOf(digit) : String.valueOf(digit);
    }

    static private String getThreeDigit(int digit) {
        return digit < 100 ? "0" + getThreeRegionDigit(digit) : String.valueOf(digit);
    }

}


