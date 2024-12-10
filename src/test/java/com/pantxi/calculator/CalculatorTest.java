package com.pantxi.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        void testAdd() {
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
    }


