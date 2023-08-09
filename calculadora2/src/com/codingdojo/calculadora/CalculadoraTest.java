package com.codingdojo.calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculator = new Calculadora();

        calculator.performOperation(10.5);
        calculator.performOperation("+");
        calculator.performOperation(5.2);
        calculator.performOperation("*");
        calculator.performOperation(10);
        calculator.performOperation("=");
        calculator.getResults();
    }
}
