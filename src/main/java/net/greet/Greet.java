package net.greet;

import java.util.HashMap;

class Greet {

    HashMap<String, Integer> userList = new HashMap<>();

    public int getUserCount(String name) {

        String userName = name.toLowerCase();
        if (userList.containsKey(userName)) {
            System.out.println(userName + " has been greeted " + userList.get(userName) + " times");
            return userList.get(userName);
        } else {

            System.out.println("the Entered name is not on the list");
            return 0;
        }
    }
    public void enterUser(String name) {
        String userName = name.toLowerCase();
        if (!(userList.containsKey(userName))) {
            userList.put(userName, 1);
        } else {
            userList.put(userName, userList.get(userName) + 1);
        }
    }
    public void greetUser(String name, String language) {

    String userName = name.toLowerCase();
    String lang = "";

    enterUser(userName);
    switch (language) {
        case "isiXhosa":
            lang = ("Molo " + userName);
            break;
        case "Afrikaans":
            lang = ("Halo " + userName);
            break;
        case "English":
            lang = ("Hello " + userName);
            break;
        default:
            lang = ("Hi " + userName);

    }


    System.out.println(lang);

    }
    public String greeted() {
        //  System.out.println(this.userList);

        return this.userList.toString();
    }
    public int counter() {
        //counts how many people are on the list
        return userList.size();
    }
    public void clear() {
        // clears the whole list
        System.out.println("The List has been successfully Cleared");
        userList.clear();
    }
    public void clearUser(String name) {
        //clears a user
        String userName = name.toLowerCase();
        System.out.println(userName + " has been cleared from the list");
        userList.remove(userName);
    }
    public void exit() {
        System.exit(0);
    }
    public void help() {
        //calls all valid commands
        System.out.println("Enter 'greet' [name] [language] to be greeted");
        System.out.println("Enter 'greeted' to get greeted user ");
        System.out.println("Enter 'greeted' [name] to get specific user counter");
        System.out.println("Enter counter to get counter");
        System.out.println("Enter 'clear' to clear list");
        System.out.println("Enter 'clear' [name] to clear specific user");
        System.out.println("Enter 'exit' to end program");
    }
}
