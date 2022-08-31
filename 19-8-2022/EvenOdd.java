/*Write a Java Program to find whether a number is even or odd using conditional operator*/
package com.java;
public class EvenOdd 
{
	public static void main(String[] args)
	{
		int a=16;
		if(a%2==0)
		{
			if(a%2!=0)
			{
				System.out.println(a+ " Is an Even Number");
			}
		}
		else
		{
			System.out.println(a+ " Is An Odd Number");
		}
	}
}
