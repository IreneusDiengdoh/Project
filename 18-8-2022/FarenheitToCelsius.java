/*Write a Java program to convert temperature from Fahrenheit to Celsius degree.*/
package com.java;
public class FarenheitToCelsius 
{
	public static void main(String[] args)
	{
		double f=65,c;
		c=((f-32)*5)/9;
		System.out.println("The Temperature In Celsiius= "+c);
	}
}
