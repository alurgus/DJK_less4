package org.example;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    List<Employee> staffList = new ArrayList<>();
//    Employee employee1 = new Employee( 89219408080L,"John",12);

    public void addEmployee(Employee employee) {
        staffList.add(employee);
    }


    public List<Employee> getBySen(int seniority) {
        List<Employee> result = new ArrayList<>();
        for (Employee e : staffList) {
            if (e.getSeniority() == seniority) {
                result.add(e);
            }
        }
        return result;
    }

    public List<Long> findPhoneNum(String name) {
        List<Long> phones = new ArrayList<>();
        for (Employee e : staffList) {
            if (e.getName().equalsIgnoreCase(name)) {
                phones.add(e.getPhoneNumber());
            }
        }
        return phones;
    }

    public String name(int id) {
        StringBuilder person = new StringBuilder();
        for (Employee e : staffList) {
            if (id == e.getId()) {
                person.append("Name:").append(e.getName()).append("\n");
                person.append("Phone:").append(e.getPhoneNumber()).append("\n");
                person.append("Seniority:").append(e.getSeniority()).append("\n");
            }
        }
        return person.toString();
    }

    public void printString(){
        for (Employee e: staffList){
            System.out.println(e);
        }
    }

}
