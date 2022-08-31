/*Write a Java program that takes a year from user and print whether that year is a leap year or not*/
package com.java;
public class LeapYear 
{
	public static void main(String[] args)
	{
		int year=2016;
		if(year%4==0)
		{
			System.out.println(year+" Is A Leap Year");
		}
		else
		{
			System.out.println(year+" Is Not A Leap Year");
		}
	}
}
