package org.example;

public class Employee {

    private int id;
    private long phoneNumber;
    private String name;
    private int seniority;

    public Employee( long phoneNumber,String name,int seniority) {
        this.id = EmployeeIdGenerator.getNextId();
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.seniority = seniority;
    }

    public Employee(String name) {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public int getSeniority() {
        return seniority;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }

}
