package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        Greet greet = new Greet();

    for(;;) {

            String name = myObj.next();
            String language = myObj.next();
           // String counters = myObj.nextLine();
            greet.greetUser(name, language);
            greet.greeted();
            greet.enterUser(name);
            greet.getUserCount(name);
            // gives me the user counter.
            System.out.println(greet.greeted());
            System.out.println(greet.counter());
            System.out.println(greet.getUserCount(name));

          //  System.out.println("Enter 'Exit' to stop");
        }


    }



    }

