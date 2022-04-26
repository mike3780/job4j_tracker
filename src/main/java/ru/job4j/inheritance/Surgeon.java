package ru.job4j.inheritance;

public class Surgeon extends Doctor{
    private int practice;

    public Surgeon(String name, String surname, String education,
                   String birthday, String specialization, int practice) {
        super(name, surname, education, birthday, specialization);
        this.practice = practice;
    }

    public void surgery() {

    }
}
