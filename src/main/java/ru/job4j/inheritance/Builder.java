package ru.job4j.inheritance;

public class Builder extends Engineer{

    private String direction;

    public Builder(String name, String surname, String education,
                   String birthday, String specialization, String direction) {
        super(name, surname, education, birthday, specialization);
        this.direction = direction;
    }

    public void build() {

    }
}
