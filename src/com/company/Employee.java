package com.company;

public class Employee {

    private String name;

    private int workHoursPerDay;

    public Employee(String name, int workHoursPerDay) {
        this.name = name;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void askEmployerForSalary() {
        System.out.println("Give me my money!");
    }

    public void takeBreak() {
        System.out.println("Drink coffee");
    }

    public void work() {
        for (int i = 0; i < workHoursPerDay; i++) {
            System.out.println(i + " hours worked");
        }
        System.out.println(this.name + " finished their work");
    }
}
