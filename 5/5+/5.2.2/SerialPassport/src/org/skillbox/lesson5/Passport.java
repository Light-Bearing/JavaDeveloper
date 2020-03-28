package org.skillbox.lesson5;

public class Passport {
    private String serial;
    private String number;
    private String fio;

    public Passport(String serial, String number, String fio) {
        this.serial = serial;
        this.number = number;
        this.fio = fio;
    }


    public String getSerial() {
        return serial;
    }


    public String getNumber() {
        return number;
    }

    public String getFio() {
        return fio;
    }


    @Override
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        } else {
            if (anObject instanceof Passport) {
                Passport passport = (Passport) anObject;
                return this.serial.equals(passport.getSerial()) && this.number.equals(passport.getNumber()) && this.fio.equals(this.getFio());
            }
            return false;
        }
    }

    public void println() {
        System.out.println(serial + " " + number + ": " + fio);
    }
}
