package com.human.booster.calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(new CalculatorController().addition(2,3));
		System.out.println(new CalculatorController().multiplication(2,3));
		System.out.println(new CalculatorController().division(2,3));
		System.out.println(CalculatorController.subtraction(2,3));
	}

}
