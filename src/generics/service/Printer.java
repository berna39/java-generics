package generics.service;

import java.io.Serializable;

import generics.models.Person;

public class Printer <T extends Person & Serializable> {

    // when setting a Class using generics, we should first extend Classes before Interfaces
    
    T person;

    public Printer(T student) {
        this.person = student;
    } 

    public void print() {
        System.out.println(person.toString());
    }

    public void printHello() {
        person.sayHello();
    }
}
