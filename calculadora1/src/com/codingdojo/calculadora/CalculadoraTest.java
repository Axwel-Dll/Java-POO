package com.codingdojo.calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		calc.setOperandOne(10.5);
		calc.setOperation("+");
		calc.setOperandTwo(5.2);
		calc.performOperation();
		System.out.println(calc.getResults());
				
		Calculadora calc2 = new Calculadora();
		calc2.setOperandOne(10.5);
		calc2.setOperation("-");
		calc2.setOperandTwo(5.2);
		calc2.performOperation();
		System.out.println(calc2.getResults());
		
	}
}
