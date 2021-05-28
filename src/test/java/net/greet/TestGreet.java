package net.greet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestGreet {
    @Test
    public void addUserToListTest(){
        Greet test = new Greet();
        test.enterUser("Chuma");
        test.enterUser("Esihle");
        assertEquals("{Esihle=1, Chuma=1}",test.greeted());
    }
    @Test
    public void greetUserTest(){
        Greet test = new Greet();
        test.greetUser("greet","Chuma","English");
        assertEquals("Hello chuma",test.greetUser("greet","Chuma","English"));
    }
    @Test
    public void counterTest(){
        Greet test = new Greet();
        test.enterUser("Chuma");
        test.enterUser("Esihle");
        test.enterUser("Musa");
        assertEquals(3,test.counter());
    }
    @Test
    public void specificCounterTest(){
        Greet test = new Greet();
        test.enterUser("Chuma");
        test.enterUser("Chuma");
        test.enterUser("Musa");
        test.enterUser("Chuma");
        assertEquals(3,test.getUserCount("Chuma"));
    }
    @Test
    public void clearListTest(){
        Greet test = new Greet();
        test.enterUser("Chuma");
        test.enterUser("Sino");
        test.enterUser("Unalo");
        test.clear();
        assertEquals("{}",test.greeted());
    }
    @Test
    public void ClearSpecificUser(){
        Greet test = new Greet();
        test.enterUser("Chuma");
        test.enterUser("Sino");
        test.enterUser("Unalo");
        test.clearUser("Unalo");
        assertEquals("{Sino=1, Chuma=1}",test.greeted());
        assertEquals(2,test.counter());
    }
    @Test
    public void checkDefaultTest(){
        Greet test = new Greet();
        test.greetUser("greet","Chuma","");
        assertEquals("Hi chuma",test.greetUser("greet","Chuma",""));
    }


}
