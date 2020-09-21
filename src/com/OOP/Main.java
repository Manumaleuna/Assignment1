package com.OOP;

public class Main {

    public static void main(String[] args) {
        Bycicle bycicle = new Bycicle();
        bycicle.changeGear(3);
        bycicle.speedUp(5);
        bycicle.applyBrake(2);

        System.out.println("Bycicle present state");
        bycicle.printStates();

        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(2);
        bike.applyBrake(1);

        System.out.println("Bike present states");
        bycicle.printStates();

        Car car = new Car();
        car.changeGear(3);
        car.speedUp(7);
        car.applyBrake(1);

        System.out.println("Car present states");
        car.printStates();
    }
}
