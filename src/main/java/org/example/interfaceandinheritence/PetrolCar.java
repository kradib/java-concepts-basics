package org.example.interfaceandinheritence;


public class PetrolCar implements FuelUp {

    @Override
    public void fuelUp(int id, String name) {
        System.out.println("I am a Petrol Car with id " + id + " name: " + name);
    }
}
