package com.codingdojo.calculadora;

public class Calculadora {
	Double operandOne;
	Double operandTwo;
	String operation;
	Double result;
	
	public Calculadora() {
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}
	
	public void performOperation() {
		if(this.operation.equals("+")){
			this.result = this.operandOne + this.operandTwo;
		}
		else if(this.operation.equals("-")) {
			this.result = this.operandOne - this.operandTwo;
		}
		else {
			System.out.println(this.operation + " Operación no válida");
		}
	}
	
	public double getResults() {
		return this.result;
	}
}
