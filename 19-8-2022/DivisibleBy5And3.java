/*Write a Java Program to check whether a number is divisibly by 5 as well as 3*/
package com.java;
public class DivisibleBy5and3 
{
	public static void main(String[] args)
	{
	int a=9;
	if(a%5==0)
	{
		System.out.println(a+" Is Divisible By 5 And Not By 3");
	}
	else if(a%3==0)
	{
		System.out.println(a+" Is Divisible By 3 And Not By 5");
	}
	else
	{
		System.out.println(a+ " Is Not Divisible By Neither 5 Nor 3");
	}
	}
}
