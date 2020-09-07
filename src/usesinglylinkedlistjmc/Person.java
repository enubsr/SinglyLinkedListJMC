/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usesinglylinkedlistjmc;

/**
 *
 * @author Enubs
 */

public class Person {
    private String lastname;
    private String firstname;
    private String middlename;
    private int age;
    private String address;

    //argument - data passed to a method
    //parameter - variable/object accept argument
    public Person(String lastname, String firstname,
            String middlename, int age, String address){
        this.lastname = lastname;
        this.firstname = firstname;
        this.middlename = middlename;
        this.age = age;
        this.address = address;
    }
    
    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    
}
