package javaProStanislav.lesson21_31052023.junit.test1Example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void add(){
        int expectedResult = 15;
        int actualResult = calculator.add(5,10);

        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void mult(){

        int expectedResult = 100;
        int actualResult = calculator.mult(10,10);
        assertEquals(expectedResult,actualResult);
    }
}
