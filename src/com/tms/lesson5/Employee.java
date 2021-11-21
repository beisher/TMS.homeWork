package com.tms.lesson5;

public abstract class Employee extends Person {
    public Employee(String firstName, String secondName) {
        super(firstName, secondName);
    }

    private POSITION position;
    private int experience;
    private int basSalary;
    private int fullSalary;

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
        System.out.println("FullSalary : " + fullSalary);
        return 0;
    }

    public void setFullSalary(int fullSalary) {
        this.fullSalary = fullSalary;
    }

    abstract void Position();
}