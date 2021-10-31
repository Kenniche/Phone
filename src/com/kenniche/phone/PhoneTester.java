package com.kenniche.phone;

public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "T-Mobile","Cuack Cuack");
        IPhone iPhone10 = new IPhone("X", 100, "ATT", "Run Run");
        s9.displayInfo();
        System.out.println("Unlocked Method: " + s9.unlock());
        iPhone10.displayInfo();
        System.out.println("Unlocked Method: " + iPhone10.unlock());
    
        // Can not create the class Phone because it is abstract class				
        //Phone myPhone = new Phone();
    
    }   
}
