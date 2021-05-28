package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        Greet greet = new Greet();

    for(;;) {
            String command = myObj.next();
            String name = myObj.next();
            String language = myObj.next();
           // String counters = myObj.nextLine();

            greet.greeted();
            greet.enterUser(name);
            greet.getUserCount(name);
            if(command.equals("greet")){
                greet.greetUser(command,name, language);
            }
            if(command.equals("Counter")){
                System.out.println(greet.counter());
                greet.counter();
            }
            // gives me the user counter.
            System.out.println(greet.greeted());

            System.out.println(greet.getUserCount(name));


        }




    }

    }

