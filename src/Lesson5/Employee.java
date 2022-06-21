package Lesson5;

public class Employee {

    private String FIO;
    private String Position;
    private String Mail;
    private String Phone_number;
    private double salary;
    private int Age;

    public Employee(String FIO, String position, String mail, String phone_number, double salary, int age) {
        this.FIO = FIO;
        Position = position;
        Mail = mail;
        Phone_number = phone_number;
        this.salary = salary;
        Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void Info(){
        System.out.println(FIO + " " + Position + " " + Mail + " " + " " + Phone_number + " " + "зп " + salary + "р." + " " + "возраст " + Age);
    };
}
