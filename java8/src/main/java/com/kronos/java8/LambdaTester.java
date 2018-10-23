package com.kronos.java8;

import java.util.Comparator;

import com.kronos.java8.math.MathOperation;
import com.kronos.java8.math.MathOps;
import com.kronos.java8.util.GreetingService;
import com.kronos.java8.util.SimpleInterface;

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

		// without type declaration ( we can leave those out because they are inferred from the method interface
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
	
	/**
	 * 
	 * 
	 */
	public void testLambdaComparator()
	{
		// test lambda expression
		// Comparator<String> stringComparatorLambda = (String o1, String o2) -> { return o1.compareTo(o2); };
		Comparator<String> stringComparatorLambda = (o1, o2) -> o1.compareTo(o2);
		
		// print
		System.out.println("hello compared to world = " + stringComparatorLambda.compare("hello", "world"));
	}
	
	/**
	 * 
	 * 
	 */
	public void testLambdaWithNoParameters()
	{
		// test lambda expression
		SimpleInterface simpleInterface = () -> System.out.println("Simple Interface"); 
		
		// call lambda expression
		simpleInterface.apply();
	}
}
