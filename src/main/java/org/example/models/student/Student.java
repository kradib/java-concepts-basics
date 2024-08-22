package org.example.models.student;


//public: accessible from anywhere
//private: accessible within class
//package private: accessible with in package
//protected: during inheritance




public class Student {

    int id; // default access specifier-> private // No

    private String name; // No

    //static members are part of class , not of object
    public static int count =0; // is it accessible ? Yes

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

}
