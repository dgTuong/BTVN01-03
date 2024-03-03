package com.tn;

public class Person {
    public String name;
    public String gender;
    public String date;
    public String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Person(){

    }
    public Person(String name, String gender, String date, String address) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }
    public void showInfo(){
        System.out.println(name);
        System.out.println(gender);
        System.out.println(date);
        System.out.println(address);
    }

}
