package es.devtest.mvn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {

    @Test
    void add() {
        MyCalculator myCalculator = new MyCalculator();

        int expectedResult = 10;
        int actualResult = myCalculator.add(5, 5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void sub() {
        MyCalculator myCalculator = new MyCalculator();

        int expectedResult = 0;
        int actualResult = myCalculator.sub(5, 5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void mult() {
        MyCalculator myCalculator = new MyCalculator();

        int expectedResult = 25;
        int actualResult = myCalculator.mult(5, 5);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void div() {
        MyCalculator myCalculator = new MyCalculator();

        int expectedResult = 1;
        int actualResult = myCalculator.div(5, 5);

        assertEquals(expectedResult, actualResult);
    }
}