package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("The bus is coming");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("In the bus " + passengers);
    }

    @Override
    public float refuel(float fuel) {
        float fuelCoast = 1000;
        return fuelCoast;
    }
}
