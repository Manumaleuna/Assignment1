package com.OOP;

public class Bike implements vehicle{
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int increment) {
        speed = speed + increment;
    }

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;

    }
    public void printStates() {
        System.out.println("speed:" + speed + "gear:" + gear);
    }
}
