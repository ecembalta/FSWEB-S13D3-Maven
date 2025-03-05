package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    double height;
    boolean isMarried;

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String gender, double height, boolean isMarried){
        this.gender = gender;
        this.height = height;
        this.isMarried = isMarried;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if(age>=13 && age<=19){
            return true;
        }else{
            return false;
        }
    }


}
