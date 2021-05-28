package net.greet;


import java.util.HashMap;


class Greet {

    HashMap<String, Integer> userList = new HashMap<>();
    public int getUserCount(String name){
        if(userList.containsKey(name)){
            return userList.get(name);
        }else{
            return 0;
        }
    }
    public void enterUser(String name){

        if(!(userList.containsKey(name))) {
            userList.put(name,1);
        }else {
            userList.put(name, userList.get(name) + 1);
        }
    }

     public String greetUser(String command, String name, String language) {
         String commands = "";
         String userName = name.toLowerCase();
         String lang = "";
         if (!(userList.containsKey(userName))) {
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
                 case "Counter":
                     counter();
                 case "Greeted":
                     greeted();

                 case "Exit":
                     exit();


                 default:
                     lang = ("Hi " + userName);
             }
         }
         System.out.println(lang);
         //help();

            return lang;





     }

    public String greeted(){
      //  System.out.println(this.userList);

            return this.userList.toString();

    }
    public int counter(){
        //counts how many people are on the list
        return userList.size();

    }
    public void clear(){
         // clears the whole list
         userList.clear();
    }
    public void clearUser(String name){
         //clears a user
         userList.remove(name);
    }
    public void exit(){
        System.exit(0);
    }
    public void help(){

        //calls all the methods
        System.out.println("Enter 'greet' [name] [language] to be greeted");
        System.out.println("Enter 'Greeted' to get greeted user ");
        System.out.println("Enter 'Greeted' [name] to get specific user counter");
        System.out.println("Enter Counter to get counter");
        System.out.println("Enter 'Clear' to clear list");
        System.out.println("Enter 'Clear' [name] to clear specific user");
        System.out.println("Enter 'Exit' to end program");


    }

}