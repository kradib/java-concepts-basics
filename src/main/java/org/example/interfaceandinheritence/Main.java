package org.example.interfaceandinheritence;

public class Main {




    public static void main(String[] args) {
        //student1 -> 1, "Amir"
        //student 2 -> 2, "X"

        Student student1 = new Student(1, "Amir");
        Student student2 = new Student(1, "X");

        //Tight coupling
        EvCar evCar = new EvCar();
        PetrolCar petrolCar = new PetrolCar();

        evCar.fuelUp(1, "Tesla");
        petrolCar.fuelUp(2, "Toyota");

        //Loose Coupling, I can vary how to create & what to create
        FuelUp fuelCar = new EvCar();
        fuelCar.fuelUp(1, "Tesla");
        fuelCar = new PetrolCar();
        fuelCar.fuelUp(1, "Tesla");

        Employee employee = new Manager(1, 30, "Amir", 30000, 10000);
        int totalSalary = employee.getPaid();
        System.out.println("Total salary: " + totalSalary);

        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student(1);
        System.out.println(s2);

        Student s3 = new Student(1, "Amir");
        System.out.println(s3);

        Student s4 = new Student( "Amir");
        System.out.println(s4);



    }
}
