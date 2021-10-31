package com.kenniche.phone;

public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s21 = new Galaxy("S21", 80, "Claro","Cuack Cuack");
        IPhone iPhone13 = new IPhone("XIII", 95, "MoviStar", "Run Run");
        s21.displayInfo();
        System.out.println("Unlocked Method: " + s21.unlock());
        iPhone13.displayInfo();
        System.out.println("Unlocked Method: " + iPhone13.unlock());
    
        // Can not create the class Phone because it is abstract class				
        //Phone myPhone = new Phone();
    
    }   
}
