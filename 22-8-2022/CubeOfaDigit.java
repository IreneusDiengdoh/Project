/*Write a program in Java to display the cube of the number upto given an integer*/
package com.java;
import java.util.*;
public class CubeofAdigit 
{
	public static void main(String[] args)
	{
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Digit:");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
		sum=sum+(i*i*i);
		System.out.println("The Cube of " +i+ " is: " +sum);
		}
	}
}
