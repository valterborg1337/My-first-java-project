package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = reader.nextLine();
        System.out.println("Hi " + name);
        System.out.println("How old are you?");
        int age = reader.nextInt();
        Boolean isadult = (age >= 18) ? true : false;
        if (isadult) {
            System.out.println("so you are over 18");
            
        } else if (!isadult) {
            System.out.println("So you are under 18");
        }


    }
}