package myapp;

import java.io.Console;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.ArrayList;
//import java.lang.*;
import java.util.Arrays;
import java.util.Collections;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello I am tired...");

        Console console = System.console();

        // String name = console.readLine("What is your name? ");

        // if (name.length() > 0) {

        //     System.out.println("Hello " + name + ", Please to meet you.");
        //     System.out.printf("Hello %s, Please to meet you.\n", name);

        // } else {

        //     System.err.println("You have not input your name!");

        // }

        // String hobby = console.readLine("What is your hobby? ");

        // hobby = hobby.trim().toLowerCase();

        // if (hobby.equals("swim")) {
        //     System.out.println("The nearest public swimming pool is in CLementi..");

        // } else if (hobby.equals("jog")) {
        //     System.out.println("How fast can you jog?");

        // } else if (hobby.equals("code")) {
        //     System.out.println("You are cool!");

        // } else {
        //     System.out.printf("What is this %s hobby of yours? ", hobby);
        // }

        // // String hobby = console.readLine("What is your favorite pasttime? ");

        // switch (hobby) {
        //     case "swim":
        //         System.out.println("Swimming is good for health!");
        //         break;
        //     case "jog":
        //         System.out.println("Jogging is a good exercise!");
        //         break;
        //     case "code":
        //         System.out.println("Coding is exciting and fun!");
        //         break;
        //     default:
        //         System.out.println("I cannot find your hobby!");
        // }


        // String input = console.readLine("Type a phrase: ");
        
        // for (int i = 0; i <= input.length(); i++) {
        //     System.out.println(input.substring(0, i));
        // }

        // int pos = 0;
        // while (input.length() >= pos) {
        //     System.out.println(input.substring(0, pos));
        //     pos++;
        // }

        // String [] todo = new String[5];

        // for (int i = 0; i < todo.length; i++) {
        //     String task = console.readLine("Enter task %d: ", i + 1);
        //     todo[i] = task;
        // }

        // for (int i = 0; i < todo.length; i++) {
        //     System.out.println(todo[i]);
        // }

        String arg = "No Argument";
        if (args.length > 0) {
            arg = args[0];
        }

        System.out.println(arg);

        // List <String> myList = new ArrayList<String>();
        // myList.add("Abby");
        // myList.add("Ben");
        // myList.add("Cory");
        // myList.add("Dylan");

        // myList.addAll(Arrays.asList("Elle", "Jane", "Hill", "Finn"));
        // Collections.sort(myList);
        
        //Another way to sort..
        // List<String> mySortedList = myList.stream().sorted().collect(Collectors.toList());
        // myList.clear(); //to remove all


        // System.out.println(myList);

        // for (String item: myList ) {
        //     System.out.printf("%s\n", item);
        // }

        //Stack
        //Stack<String> stack = new Stack<>();

        String data = "dog,cat,rabbit,pig,bird";
        Scanner scan = new Scanner(data).useDelimiter(",");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }


    }
}
