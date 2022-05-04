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
}