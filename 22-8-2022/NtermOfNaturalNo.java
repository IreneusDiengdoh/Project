/*Write a program in Java to display n terms of natural numbers and their sum.
*/
package com.java;
import java.util.*;
public class nterm 
{
	public static void main(String[] args)
	{
		int num,i,sum=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Number:");
		num=sc.nextInt();
	
		
		for(i=1;i<=num;i++)
		{
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("The Sum of 1st n Natural Numbers are: "+sum);
	}
}
