package ru.job4j.poly;

public class PolyVehicle {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Autobus();
        Vehicle[] transports = {airplane, train, bus};
        for (Vehicle t: transports) {
            t.move();
        }
    }
}
