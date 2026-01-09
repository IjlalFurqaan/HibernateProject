package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(101);
        s1.setsName("John Doe");
        s1.setsAge(20);

        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Student Name: " + s1.getsName());
        System.out.println("Student Age: " + s1.getsAge());
    }
}
