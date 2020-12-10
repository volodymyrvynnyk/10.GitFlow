package com.company;

public class Employee {

    private String name;

    private int workHoursPerDay;

    public Employee(String name, int workHoursPerDay) {
        this.name = name;
        this.workHoursPerDay = workHoursPerDay;
    }

    public void takeBreak() {
        System.out.println("Drink coffee");
    }

    public void work() {
        for (int i = 0; i < workHoursPerDay; i++) {
            System.out.println(i + " hours worked");
        }
        System.out.println("Finished");
    }
}
