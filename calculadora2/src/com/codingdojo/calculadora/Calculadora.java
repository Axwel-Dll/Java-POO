package com.codingdojo.calculadora;

import java.util.ArrayList;

class Calculadora {
	ArrayList<String> operators = new ArrayList<String>();
	ArrayList<Double> nums = new ArrayList<Double>();
	Double results;

	public Calculadora() {

	}

	public void performOperation(double dub) {
		nums.add(dub);
	}

	public void performOperation(int dub) {
		nums.add((double) dub);
	}

	public void performOperation(String str) {
		if (str != "=") {
			operators.add(str);
		} else {
			Double start = nums.get(nums.size() - 1);
			for (int i = operators.size() - 1; i >= 0; i--) {
				switch (operators.get(i)) {
				case "+":
					start = start + nums.get(i);
					break;
				case "-":
					start = start - nums.get(i);
					break;
				case "*":
					start = start * nums.get(i);
					break;
				case "/":
					start = start / nums.get(i);
					break;
				default:
					System.out.println("Operación no válida");
					break;
				}
			}
			this.results = start;
		}
	}

	public void getResults() {
		System.out.println(this.results);
	}
}