/*Write a program in Java to input 5 numbers from keyboard and find their sum and average*/
package com.java;
import java.util.*;
public class Sumof5no 
{
	public static void main(String[] args)
	{
		int a,b,c,d,e,sum=0,avg=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value:");
		a = sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 2nd value:");
		b = sc.nextInt();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter 3rd value:");
		c = sc.nextInt();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter 4th value:");
		d = sc.nextInt();
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter 5th value:");
		e = sc.nextInt();
		
		sum=a+b+c+d+e;
		System.out.println("Sum of 5 Digits: "+sum);
		avg=sum/5;
		System.out.println("Average sum: "+avg);
	}
}
