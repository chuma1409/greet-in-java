package net.greet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        Greet greet = new Greet();

        while(true) {
            String command = "";
            String names = "";
            String languages = "";
            String input = myObj.nextLine();
            String arr[] = input.split(" ");
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
            if (command.equals("greet") && names != "" && languages != "") {
                greet.greetUser(names, languages);
            } else if (command.equals("counter") && names == "" && languages == "") {
                System.out.print(greet.counter());
            } else if(command.equals("counter") && names != "" && languages == ""){
                greet.getUserCount(names);
            }else if(command.equals("greeted") && names=="" && languages==""){
                greet.greeted();
            } else if(command.equals("greeted") && names!="" && languages==""){
                greet.getUserCount(names);
            } else if(command.equals("clear") && names=="" && languages==""){
                greet.clear();
            } else if(command.equals("clear") && names!="" && languages==""){
                greet.clearUser(names);
            }
            //String name = myObj.next();
          //  String numParams[] = name.split(" ");
            //String language = myObj.next();
//            greet.greeted();
           // greet.greetUser(names, languages);
//            greet.getUserCount(names);
//            greet.counter();
           // System.out.println(greet.greetUser(name, language));
            //System.out.println(greet.counter());
           // System.out.println(greet.greeted());
            //System.out.println(greet.getUserCount(name));
        }
    }
}