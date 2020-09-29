package com.example.springbootthymeleaf.model;

import java.util.List;

public class User {
    private int id;
    private String name;
    private double grade;

    public User(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    /*
    * dummy method
    * */
    void dummy(List<Integer> arr){
        for(int i: arr){
            System.out.println(i);
        }
    }
}
