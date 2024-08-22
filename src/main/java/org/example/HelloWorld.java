package org.example;

import org.example.models.student.Student;

import java.util.ArrayList;
import java.util.List;


public class HelloWorld {

    //public: access specifier, accessible from outside
    //static: property of a class, not of an object
    //void: no return
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Student s1 = new Student(1, "Pratham"); //
        Student.count++;
        Student s2 = new Student(2, "Nidip");
        Student.count++;

        System.out.println("total number of student: " + Student.count);


        //List<Integer> integerList = new List<>();

    }


}