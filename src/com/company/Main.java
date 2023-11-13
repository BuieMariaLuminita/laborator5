package com.company;

public class Main {
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(); // Aceasta linie va genera eroare, deoarece clasa Vehicle este abstracta

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        car.speedUp();      // Va afișa: Car: Speed increased by 10. Current speed: 10
        bicycle.speedUp();  // Va afișa: Bicycle: Speed increased by 5. Current speed: 5
    }
}