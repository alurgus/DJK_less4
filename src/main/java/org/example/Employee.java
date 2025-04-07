package org.example;

public class Employee {

    private int id;
    private Long phoneNumber;
    private String name;
    private int seniority;

    public Employee(Long phoneNumber, String name, int seniority) {
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
        return String.format("id: %d , name: %s , phone: %d , sen.: %d", id, name, phoneNumber, seniority);
    }

}

