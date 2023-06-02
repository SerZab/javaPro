package javaProStanislav.lesson21_31052023.junit.test2Example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {
    StringReverse stringReverse = new StringReverse();
    @Test
    public void reverseWord(){
        String testString = "ABBA sing song";
        String expected = "gnos gnis ABBA";
        String actual = stringReverse.reverseString(testString);
        assertEquals(expected,actual);
    }
}
