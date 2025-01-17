package es.devtest.mvn;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

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

    //El test no fallara si los dos valores son distintos
    @DisplayName("Tercer test")
    @Test
    void testThree(){
        int resultadoEsperado = 4;
        assertNotEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST THREE EXECUTAT=====");
    }

    //El test no fallara si, la comparacion es true
    @DisplayName("Cuarto test")
    @RepeatedTest(3)
    void testFour(){
        int resultadoEsperado = 3;
        assertTrue(0.5 >= Math.random());

        System.out.println("====TEST FOUR EXECUTAT=====");
    }

    //El test no fallara si, la comparacion es false
    @DisplayName("Quinto test")
    @RepeatedTest(3)
    void testFive(){
        int resultadoEsperado = 3;
        assertFalse(0.5 >= Math.random());

        System.out.println("====TEST FIVE EXECUTAT=====");
    }
    //El test no fallara si, el parametro no es null
    @DisplayName("Sexto test")
    @Test
    void testSix(){
        String resultadoEsperado = null;
        assertNull(resultadoEsperado);

        System.out.println("====TEST SIX EXECUTAT=====");
    }
    //El test no fallara si, el parametro es null
    @DisplayName("Septimo test")
    @Test
    void testSeven(){
        String resultadoEsperado = null;
        assertNotNull(resultadoEsperado);

        System.out.println("====TEST SEVEN EXECUTAT=====");
    }
    //El test fallara si los dos parametros son distintos
    @DisplayName("Octavo test")
    @Test
    void testEight(){
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST EIGHT EXECUTAT=====");
    }

    //Igual que el equals, pero tambien compara los tipos de datos
    @DisplayName("Noveno test")
    @Test
    void testNine(){
        int valorUno = 3;
        int valorDos = 3;
        assertSame(valorUno, valorDos);

        System.out.println("====TEST NINE EXECUTAT=====");
    }
    //Igual que el Notequals, pero tambien compara los tipos de datos
    @DisplayName("Decimo test")
    @Test
    void testTen(){
        String valorUno = "3";
        int valorDos = 3;
        assertNotSame(valorUno, valorDos, "Ha fallado");

        System.out.println("====TEST TEN EXECUTAT=====");
    }
    //Si la condicion es true, el test fallara
    @DisplayName("Onceavo test")
    @RepeatedTest(3)
    void testEleven(){
        boolean isServerDown = Math.random()>0.5;

        assumeFalse(isServerDown, "Ignoring test eleven, server is down");

        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST ELEVEN EXECUTAT=====");
    }

    //Si el primer parametro es true, realizara el segundo parametro (ejecutable)
    @DisplayName("Doceavo test")
    @RepeatedTest(3)
    void testTwelve(){
        boolean isServerUp = Math.random()>0.5;
        int resultadoEsperado = 3;
        assumingThat(isServerUp, esCorrecto());


        assertEquals(resultadoEsperado, 1 + 2);

        System.out.println("====TEST TWELVE EXECUTAT=====");
    }
    private static Executable esCorrecto(){
        System.out.println("Esta todo correcto");
        return new Executable() {
            @Override
            public void execute() throws Throwable {

            }
        };
    }
}
