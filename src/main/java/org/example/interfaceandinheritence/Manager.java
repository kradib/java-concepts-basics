package org.example.interfaceandinheritence;

public final class Manager extends Employee {

    private int bonusSalary;

    public Manager(int id, int age, String name, int baseSalary, int bonusSalary) {
        super(id, age, name, baseSalary);
        this.bonusSalary = bonusSalary;
    }

    @Override
    public int getPaid() {
        super.getPaid();
        System.out.println("Manager also got bonus of " + bonusSalary);
        return baseSalary + bonusSalary;
    }
}
