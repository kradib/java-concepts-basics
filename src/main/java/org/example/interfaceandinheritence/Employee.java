package org.example.interfaceandinheritence;

public class Employee extends Person {

    //protected int id;
    //    protected int age;
    //    protected String name;
    //    protected int baseSalary;

    protected int baseSalary;
    public Employee(int id, int age, String name, int baseSalary) {
        super(id, age, name);
        this.baseSalary = baseSalary;
    }

    public int getPaid() {
        System.out.println("You got paid the base salary");
        return baseSalary;
    }
}
