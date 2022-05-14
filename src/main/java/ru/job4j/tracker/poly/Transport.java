package ru.job4j.tracker.poly;

public interface Transport {
    void drive();

    void passengers(int passengers);

    float refuel(float fuel);
}
