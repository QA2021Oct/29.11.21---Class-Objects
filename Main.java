package com.company;

import java.util.Scanner;

public class Main {
    // create Class called Laptop
    // properties: color, size, chargeType, keyboard.
    // functions: - turnOn -> System.out.println("turn On")
    //            - turnOff - System.out.println("turn Off")

    public static void main(String[] args) {
        // bk - show
        int x = 8;
        BankAccount bk = new BankAccount();
        bk.owner = "Danni";
        bk.balance = 9000.50;

        BankAccount bk2 = new BankAccount();
        bk2.owner = "Shelly";
        bk2.balance = 62;

        System.out.println("the owner is: " + bk.owner + ", balance is: " + bk.balance);
        bk.deposit();
        bk.withdraw();
        System.out.println("the owner is: " + bk2.owner + ", balance is: " + bk2.balance);

        if(bk.balance < 80){
            System.out.println("the man is poor");
        }

        Animal dog = new Animal();
        dog.age = 9;
        dog.name = "shoko";
        dog.type = "Dog";

    }

}
