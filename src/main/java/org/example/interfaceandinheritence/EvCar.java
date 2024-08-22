package org.example.interfaceandinheritence;

public class EvCar implements FuelUp {
    @Override
    public void fuelUp(int id, String name) {
        System.out.println("I am a Ev Car with id " + id + " name: " + name);
    }
}
