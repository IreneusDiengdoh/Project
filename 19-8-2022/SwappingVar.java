/*Write a Java program to swap two variables*/
package com.java;
public class SwappingVariables
{
	public static void main(String[] args)
	{
		int a=40,b=50;
		System.out.println("Before Swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("After Swapping");
		int swap=a;
		a=b;
		b=swap;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
