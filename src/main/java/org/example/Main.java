package org.example;


//Создать справочник сотрудников
//Необходимо:
//Создать класс справочник сотрудников, который содержит внутри
//Коллекцию сотрудников –каждый сотрудник должен иметь следующие атрибуты:
//Табельный номер
//Номер телефона
//Имя
//Стаж
//Добавить метод, который ищет сотрудника по стажу (может список)
//Добавить метод, который возвращает номер телефона сотрудника по имени (может список)
//Добавить метод, который ищет сотрудника по табельному номеру
//Добавить метод добавления нового сотрудника в справочник


import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.addEmployee(new Employee( 89219408080L,"John",12));
        staff.addEmployee(new Employee( 89224458080L,"Bill",11));
        staff.addEmployee(new Employee( 89112308080L,"Nick",15));
        staff.addEmployee(new Employee( 89034458080L,"Bill",12));



        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println(staff.toString());
        System.out.println(staff.getBySen(12).toString());
        System.out.println(staff.findPhoneNum("Bill").toString());
        System.out.println(staff.name(96));
        staff.printString();


    }
}