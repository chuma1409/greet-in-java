package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner myObj = new Scanner(System.in);
            Greet greet = new Greet();
            greet.help();
            while (true) {
                String command = "";
                String names = "";
                String languages = "";
                String input = myObj.nextLine();
                String[] arr = input.split(" ");
                //  System.out.println(arr[0]);
                if (arr.length == 1) {
                    command = arr[0];
                }
                if (arr.length == 2) {
                    command = arr[0];
                    names = arr[1];
                }
                if (arr.length == 3) {
                    command = arr[0];
                    names = arr[1];
                    languages = arr[2];
                }
                if (command.equals("greet") && !names.equals("") && !languages.equals("")) {
                    greet.greetUser(names, languages);

                } else if (command.equals("counter") && names.equals("") && languages.equals("")) {
                    System.out.print(greet.counter());
                } else if (command.equals("greeted") && names.equals("") && languages.equals("")) {
                    System.out.println(greet.greeted());
                } else if (command.equals("greeted") && !names.equals("") && languages.equals("")) {
                    greet.getUserCount(names);
                } else if (command.equals("clear") && names.equals("") && languages.equals("")) {
                    greet.clear();
                } else if (command.equals("clear") && !names.equals("") && languages.equals("")) {
                    greet.clearUser(names);
                } else if (command.equals("help") && names.equals("") && languages.equals("")) {
                    greet.help();
                } else if (command.equals("exit") && names.equals("") && languages.equals("")) {
                    greet.exit();
                }


            }

    }
}