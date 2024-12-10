package com.pantxi.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;



public class CalculatorTest {

    private Calculator ops;


    // Méthode exécutée avant chaque test
    @BeforeEach
    public void setUp() {
        // Initialisation des objets ou des valeurs communes à tous les tests
        ops = new Calculator();
        System.out.println("Initialisation avant chaque test");
    }

    // Méthode exécutée après chaque test
    @AfterEach
    public void tearDown() {
        // Nettoyage après chaque test (facultatif)
        System.out.println("Nettoyage après chaque test");
    }


    @Test
        void testAddClassic() {
         ops = new Calculator();
            assertEquals(5, ops.add(2, 3), "Addition de 2 et 3 devrait être 5");
            assertEquals(0, ops.add(-1, 1), "Addition de -1 et 1 devrait être 0");
        }


        @Test
        void testDivide() {
            ops = new Calculator();
            assertEquals(2, ops.divide(4, 2), "Division de 4 par 2 devrait être 2");
            assertThrows(ArithmeticException.class, () -> ops.divide(4, 0), "Division par zéro devrait lancer une exception");
        }

    // Test paramétré avec différentes valeurs
    @ParameterizedTest
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "-2, 2, 0",
            "0, 0, 0",
            "-1, -2, -3"
    })
    void testAdd(int opG, int opD, int expected) {
        assertEquals(expected,ops.add(opG, opD), "L'addition n'a pas donné le bon résultat");
    }


}

