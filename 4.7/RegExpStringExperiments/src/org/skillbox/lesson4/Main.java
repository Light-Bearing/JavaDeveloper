package org.skillbox.lesson4;

public class Main {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int sum =0;
        String zp[] =text.replaceAll("[^0-9\\s]+","").trim().split("[^0-9]+");
        for (int i = 0; i < zp.length; i++) {
            sum+=Integer.parseInt(zp[i].trim());
        }
        System.out.println("Вася, Петя и Маша заработали: "+sum +" рублей.");
    }
}
