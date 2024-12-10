package com.pantxi.calculator;
import java.util.HashSet;
import java.util.Set;

public class Calculator {

    // Méthode pour additionner deux nombres
    public   int add(int opG, int opD) {
        return opG + opD;
    }

    // Méthode pour diviser deux nombres
    public   int divide(int opG, int opD) {
        if (opD == 0) {
            throw new ArithmeticException("Division par zéro");
        }
        return opG / opD;
    }

    // Méthode qui retourne l'ensemble des chiffres composant le nombre
    public Set<Integer> ensembleChiffres(int pNombre) {
        Set<Integer> result = new HashSet<>();

        // On prend la valeur absolue de pNombre pour gérer les entiers négatifs
        String str = Integer.toString(Math.abs(pNombre));

        // On parcourt chaque caractère de la chaîne et on l'ajoute à l'ensemble
        for (char c : str.toCharArray()) {
            result.add(Character.getNumericValue(c));  // Ajout du chiffre comme entier
        }

        return result;
    }




}
