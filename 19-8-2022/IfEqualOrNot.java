/*Write a Java program that takes four integers and prints equal if all four are equal, and not equal otherwise*/
package com.java;
public class IfEqualOrNot 
{
	public static void main(String[] args)
	{
		int a=5,b=5,c=5,d=45;
		if(a==b && a==c && a==d)
		{
			if(b==a & b==c & b==d)
			{
				if(c==a & c==b & c==d)
				{
					System.out.println("All Equal");
				}
			}		
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}
