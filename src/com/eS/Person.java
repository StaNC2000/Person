package com.eS;

public class Person {

    String firstName;
    String lastName;
    int age;


    public String getFirstName (){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setAge(int age){
        if (age < 0 || age >100){
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }

    public boolean isTeen(){
        if (age > 12 && age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if (lastName.isEmpty()){
            return firstName;
        }
        else if (firstName.isEmpty()){
            return lastName;
        }
        else {
            return  firstName + " " + lastName;
        }
    }



    public static void main(String[] args) {
	// write your code here

        Person person = new Person();

        person.setFirstName("John");
        person.setLastName("Smith");
        person.setAge(34);
        System.out.println("fullName= " + person.getFullName());

    }
}
