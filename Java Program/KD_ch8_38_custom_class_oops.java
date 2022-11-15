package com.company;

class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is " +id);
        System.out.println("and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class KD_ch8_38_custom_class_oops {
    public static void main(String[] args) {
        System.out.println("This is a custom class");
        Employee kishan = new Employee(); // Instantiating a new employee object
        Employee bhavin = new Employee(); // Instantiating a new employee object

        // setting properties(Attributes)
        kishan.id=31;
        kishan.salary=12;
        kishan.name="kdvaghela";
        bhavin.id=31;
        bhavin.salary=19;
        bhavin.name="bdvaghela";

        kishan.printdetails();
        bhavin.printdetails();
        int salary= kishan.getSalary();
        System.out.println(salary);
//        System.out.println(kishan.id);
//        System.out.println(kishan.name);
    }
}
