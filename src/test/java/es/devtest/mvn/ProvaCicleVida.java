package es.devtest.mvn;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@DisplayName("PROVA CICLE VIDA HECTOR")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProvaCicleVida {
    public ProvaCicleVida(){
        System.out.println("---Constructor---");
    }

    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll => setup(): Se ejecutara antes de empezar las pruebas");
    }
    @AfterAll
    static  void tear(){
        System.out.println("@AfterAll => tear(): Se ejecutara al FINAL de todas las pruebas ");
    }
    @BeforeEach
    void  setupThis(){
        System.out.println("@BeforeEach => setupThis(): Se ejecutara antes de cada prueba");
    }
    @AfterEach
    void  tearThis(){
        System.out.println("@AfterAll => tear(): Se ejecutara DESPUES de cada prueba");
    }

    @DisplayName("Primer test")
    @RepeatedTest(3)
    void testOne(){
        boolean isServerUp = Math.random()>0.5;

        assumeTrue(isServerUp, "Ignoring test one, server is down");

        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST ONE EXECUTAT=====");
    }
    @DisplayName("Segundo test")
    @RepeatedTest(value = 2, name = "--> {currentRepetition}/{totalRepetitions}")
    void testTwo(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWO EXECUTAT=====");
    }

    @DisplayName("Tercer test")
    @Test
    void testThree(){
        int resultadoEsperado = 3;
        assertNotEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST THREE EXECUTAT=====");
    }
    @DisplayName("Cuarto test")
    @RepeatedTest(3)
    void testFour(){
        int resultadoEsperado = 3;
        assertTrue(0.5 >= Math.random());

        System.out.println("====TEST FOUR EXECUTAT=====");
    }
    @DisplayName("Quinto test")
    @Test
    void testFive(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST FIVE EXECUTAT=====");
    }
    @DisplayName("Sexto test")
    @Test
    void testSix(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWO EXECUTAT=====");
    }
    @DisplayName("Septimo test")
    @Test
    void testSeven(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWO EXECUTAT=====");
    }
    @DisplayName("Octavo test")
    @Test
    void testEight(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWO EXECUTAT=====");
    }
    @DisplayName("Noveno test")
    @Test
    void testNine(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWO EXECUTAT=====");
    }
    @DisplayName("Decimo test")
    @Test
    void testTen(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWO EXECUTAT=====");
    }



}
