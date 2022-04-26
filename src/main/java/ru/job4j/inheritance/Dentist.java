package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int practice;

    public Dentist(String name, String surname, String education,
                   String birthday, String specialization, int practice) {
        super(name, surname, education, birthday, specialization);
        this.practice = practice;
    }

    public void putDentalFilling() {

    }
}
