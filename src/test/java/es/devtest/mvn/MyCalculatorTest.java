package es.devtest.mvn;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    private MyCalculator myCalculator;

    @BeforeEach
    void setUpMyCalculator(){
        myCalculator = new MyCalculator();
        System.out.println("MyCalculator created");
    }
    @AfterEach
    void tearDownMyCalculator(){
        myCalculator = null;
        System.out.println("MyCalculator=null");
    }

    @Test
    void add() {
        System.out.println("====TEST SUMA====");
        int expectedResult = 10;
        int actualResult = myCalculator.add(5, 5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sub() {
        System.out.println("====TEST RESTA====");
        int expectedResult = 0;
        int actualResult = myCalculator.sub(5, 5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void mult() {
        System.out.println("====TEST MULTIPLICACION====");
        int expectedResult = 25;
        int actualResult = myCalculator.mult(5, 5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div() {
        System.out.println("====TEST DIVISION====");
        int expectedResult = 1;
            int actualResult = myCalculator.div(5, 5);
            assertEquals(expectedResult, actualResult);
    }
    @Test
    void divByZero() {
        System.out.println("====TEST DIVISION POR 0====");
            ArithmeticException exception = assertThrows(ArithmeticException.class,() -> myCalculator.div(5,0));
            assertTrue(exception.getMessage().equals("/ by zero"));
    }
    @Test
    void addWhenNegativeThrowsException(){
        System.out.println("====TEST SUMA NEGATIVA====");
        int a = 5;
        int b = -5;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> myCalculator.add(a,b));
    }

    @Test
    void subWhenNegativeThrowsException(){
        System.out.println("====TEST RESTA NEGATIVA====");
        int a = 5;
        int b = -5;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> myCalculator.sub(a,b));
    }
    @Test
    void multWhenNegativeThrowsException(){
        System.out.println("====TEST MULTIPLICACION NEGATIVA====");
        int a = 5;
        int b = -5;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> myCalculator.mult(a,b));
    }
    @Test
    void divWhenNegativeThrowsException(){
        System.out.println("====TEST DIVISION NEGATIVA====");
        int a = 5;
        int b = -5;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,() -> myCalculator.div(a,b));
    }

}