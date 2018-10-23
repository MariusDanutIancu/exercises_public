package com.kronos.java8;

import com.kronos.java8.math.MathOperation;
import com.kronos.java8.math.MathOps;
import com.kronos.java8.util.GreetingService;

/**
 * Format: parameter -> expression body
 * 
 * Lambda expressions are used primarily to define inline implementations of a functional interface.
 * functional interface - interface with a single method
 * 
 * Lambda expression eliminates the need of anonymous class 
 * and gives a very simple yet powerful functional programming capability to Java.
 * 
 * @author Marius Danut Iancu
 *
 */
public class LambdaTester {
	
	/**
	 * Math operations using lambda expressions
	 * 
	 */
	public void testLambdaMathOperations() {
		MathOps math = new MathOps();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// without type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		// print
		System.out.println("10 + 5 = " + math.operate(10, 5, addition));
		System.out.println("10 - 5 = " + math.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + math.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + math.operate(10, 5, division));
	}

	/**
	 * String operations using lambda expressions
	 * 
	 */
	public void testLambdaStringOperations() {
		// without parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// with parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		// print
		greetService1.sayMessage("Message 1");
		greetService2.sayMessage("Message 2");
	}
}
