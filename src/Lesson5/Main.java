package Lesson5;

public class Main {
    public static void main(String[] args) {

        Employee Employee1 = new Employee("Иванов И.П.", "Начальник","cucumber@mail.ru","89991346755",10000.0,41);
        Employee Employee2 = new Employee("Петров И.П.", "Рукоблуд","cucumber@mail.ru","89991346755",1000.0,40);
        Employee Employee3 = new Employee("Сидоров И.П.", "Бариста","cucumber@mail.ru","89991346755",1000.0,39);
        Employee Employee4 = new Employee("Голубков И.П.", "Водитель","cucumber@mail.ru","89991346755",1000.0,27);
        Employee Employee5 = new Employee("Грозный И.В.", "Царь","1533@mail.ru","87771533572",100000.0,100);



        Employee[] employees = {Employee1, Employee2, Employee3, Employee4, Employee5};
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getAge() > 40)
            employees[i].Info();
        };

    }
}
