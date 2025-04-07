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


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}