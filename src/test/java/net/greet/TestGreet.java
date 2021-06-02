package net.greet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGreet {
    @Test
    public void addUserToListTest(){
        Greet test = new Greet();
        test.greetUser("Chuma","venda");
        test.greetUser("Esihle", "English");
        assertEquals("{chuma=1, esihle=1}",test.greeted());
    }
//    @Test
//    public void greetUserTest(){
//        Greet test = new Greet();
//        test.greetUser("Chuma","English");
//        assertEquals("Hello chuma",test.greetUser("Chuma","English"));
//    }
    @Test
    public void counterTest(){
        Greet test = new Greet();
        test.greetUser("Chuma","English");
        test.greetUser("Esihle", "vb");
        test.greetUser("Musa", "isiXhosa");
        assertEquals(3,test.counter());
    }
    @Test
    public void specificCounterTest(){
        Greet test = new Greet();
        test.greetUser("Chuma","isiXhosa");
        test.greetUser("Chuma","English");
        test.greetUser("Musa","Afrikaans");
        test.greetUser("Chuma","");
        assertEquals(3,test.getUserCount("Chuma"));
    }
    @Test
    public void clearListTest(){
        Greet test = new Greet();
        test.greetUser("Chuma","English");
        test.greetUser("Sino","isiXhosa");
        test.greetUser("Unalo","English");
        test.clear();
        assertEquals("{}",test.greeted());
    }
    @Test
    public void ClearSpecificUser(){
        Greet test = new Greet();
        test.greetUser("Chuma","English");
        test.greetUser("Sino","English");
        test.greetUser("Unalo","English");
        test.clearUser("Unalo");
        assertEquals("{chuma=1, sino=1}",test.greeted());
        assertEquals(2,test.counter());
    }
//    @Test
//    public void checkDefaultTest(){
//        Greet test = new Greet();
//        test.greetUser("Chuma","");
//        assertEquals("Hi chuma",test.greetUser("Chuma",""));
//    }
    @Test
    public void  checkAddingUserAndCounter(){
        Greet test = new Greet();
        test.greetUser("Chuma", "English");
        test.greetUser("Musa", "isiXhosa");
        test.greetUser("Musa", "English");
        assertEquals("{chuma=1, musa=2}",test.greeted());
    }


}
