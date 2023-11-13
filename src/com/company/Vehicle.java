package com.company;
public abstract class Vehicle {
    private int speed;


    public Vehicle() {
        this.speed = 0;

    }

    public abstract void speedUp();


    public int getSpeed() {
        return speed;
    }


    protected void setSpeed(int speed) {
        this.speed = speed;
    }


}
