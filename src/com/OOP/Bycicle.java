package com.OOP;

public class Bycicle implements vehicle {
    int gear;
    int speed;

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
        System.out.println("speed: " + speed + " gear: " + gear);
    }

}
