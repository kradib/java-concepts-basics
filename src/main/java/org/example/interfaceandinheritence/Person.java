package org.example.interfaceandinheritence;

public class Person {

    //properties
    protected int id;
    protected int age;
    protected String name;


    //parametrized constructor
    //you want tpo create an object for first time, use the constructor
    //cvonstructor creates in a new memory address
    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    //updation
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
