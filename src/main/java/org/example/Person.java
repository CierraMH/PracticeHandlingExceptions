package org.example;

public class Person {

    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        if (name == null || name.equals("") || name.length() > 40) {
            throw new IllegalArgumentException("Error! Please fix / provide a valid name");
        }
        if(age < 0 || age > 120){
            throw new IllegalArgumentException("Error! Age should not be negative or over 120");
        }
        

    }
}
