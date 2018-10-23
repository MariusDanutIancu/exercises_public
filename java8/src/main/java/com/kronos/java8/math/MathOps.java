package com.kronos.java8.math;

/**
 * Used to execute math operations using lambda expressions
 * 
 * @author Marius Danut Iancu
 *
 */
public class MathOps
{
	
	public MathOps() { }

	public int operate(int a, int b, MathOperation mathOperation) 
	{
		return mathOperation.operation(a, b);
	}
}
