package myapp;

import java.io.Console;
import java.lang.*;

public class HelloWorld {
    
    public static void main(String[] args) {
        System.out.println("Hello I am tired...");
        
        Console console = System.console();

        String name = console.readLine("What is your name?");
    
        System.out.println("Hello " + name + ", Please to meet you.");
        System.out.printf("Hello %s + , Please to meet you.", name);
    }
}
