package com.comarch.szkolenia.funkcyjny.strumienie;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int salary;
    private String position;

    public Employee(int id, String name, String surname, int salary, String position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
