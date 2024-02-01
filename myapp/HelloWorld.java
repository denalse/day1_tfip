package myapp;

import java.io.Console;
//import java.lang.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello I am tired...");
        
        Console console = System.console();

        String name = console.readLine("What is your name? ");

        if (name.length() > 0) {
            
            System.out.println("Hello " + name + ", Please to meet you.");
            System.out.printf("Hello %s, Please to meet you.\n", name);

        } else {
            
            System.err.println("You have not input your name!");
        
        }

        String hobby = console.readLine("What is your hobby? ");

        hobby = hobby.trim().toLowerCase();
        
        if (hobby.equals("swim")) {
            System.out.println("The nearest public swimming pool is in CLementi..");
  
        } else if (hobby.equals("jog")) {
            System.out.println("How fast can you jog?");

        } else if (hobby.equals("code")) {
            System.out.println("You are cool!");
            
        } else {
            System.out.printf("What is this %s hobby of yours? I cannot find it!", hobby);
        }
    
    }
}
