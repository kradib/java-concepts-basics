package org.example.interfaceandinheritence;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
        this.name = "A";
    }

    public Student(String name) {
        this.id = 0;
        this.name = name;
    }

    public Student() {
        this.id = 0;
        this.name = "A";
    }

    @Override
    public String toString() {
        return "(Student: " + "id = " + id + ", name= " + name + ")";
    }

}
