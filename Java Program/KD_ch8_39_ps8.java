package com.company;

class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
class cellphone{
    public void ringing(){
        System.out.println("Ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
    public void callfriends(){
        System.out.println("Call AJ...");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }

}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}
public class KD_ch8_39_ps8 {
    public static void main(String[] args) {
        // Question 1
        Employee1 kishan = new Employee1();
        kishan.setName("kdvaghela");
        kishan.salary=15000;
        System.out.println(kishan.getSalary());
        System.out.println(kishan.getName());

        // Question 2
        cellphone poco = new cellphone();
        poco.callfriends();
        poco.ringing();
        poco.vibrating();

        // Question 3
        Square sq = new Square();
        sq.side=3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Question 5
        Tommy p1 = new Tommy();
        p1.fire();
        p1.hit();
        p1.run();


    }
}
