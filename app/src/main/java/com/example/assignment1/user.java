package com.example.assignment1;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class user {
    private String username;
    private String password;
    private String email;
    private double age;
    private String gender;
    private List<String> workoutDay;
    private String experience;
    private double weight;
    private double height;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public user(String username, String password, String email, double age, String gender, String experience) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.experience = experience;

    }

    public user(String username, String password, String email, double age, List<String> workoutDay, String gender, String experience, double weight, double height) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.age = age;
        this.workoutDay = workoutDay;
        this.gender = gender;
        this.experience = experience;
        this.weight= weight;
        this.height=height;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<String> getWorkoutDay() {
        return workoutDay;
    }

    public void setWorkoutDay(List<String> workoutDay) {
        this.workoutDay = workoutDay;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
