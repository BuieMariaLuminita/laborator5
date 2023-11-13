package com.company;
public class Car extends Vehicle {
    @Override
    public void speedUp() {
        int currentSpeed = getSpeed();
        setSpeed(currentSpeed + 10);
        System.out.println("Car: Speed increased by 10. Current speed: " + getSpeed());
    }
}
