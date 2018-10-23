package com.kronos.java8;

public class App 
{
    public static void main( String[] args )
    {
    	// Test simple lambda expressions (Source: https://www.tutorialspoint.com/java8/java8_lambda_expressions.htm)
    	LambdaTester lambdaTester = new LambdaTester();
    	lambdaTester.testLambdaMathOperations();
    	lambdaTester.testLambdaStringOperations();
    }
}
