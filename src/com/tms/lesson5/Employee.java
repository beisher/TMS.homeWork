package com.tms.lesson5;

public abstract class Employee extends Person {
    public Employee(String firstName, String secondName) {
        super(firstName, secondName);
    }

    private POSITION position;
    private int experience;
    private int basSalary;
    private int fullSalary;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getBasSalary() {
        return basSalary;
    }

    public void setBasSalary(int basSalary) {
        this.basSalary = basSalary;
    }

    public int getFullSalary() {
        return fullSalary;
    }

    public Employee(String firstName, String secondName, int experience, int basSalary) {
        super(firstName, secondName);
        this.experience = experience;
        this.basSalary = basSalary;
    }

    public POSITION getPosition() {
        return position;
    }

    public void setPosition(POSITION position) {
        this.position = position;
    }

    public int FullSalaryCalculate() {
        this.fullSalary = basSalary * experience * position.getKf();
        return fullSalary;
    }

    public void setFullSalary(int fullSalary) {
        this.fullSalary = fullSalary;
    }

    public void printAllInfo() {
        System.out.println(fullSalary);
        System.out.println(position);
    }

    abstract void Position();
}