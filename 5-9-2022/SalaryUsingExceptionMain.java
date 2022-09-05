package com.java;
import java.util.*;
public class SalaryUsingExceptionMain 
{
	public static void main(String[] args)
	{
	double salary;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Salary:");
	salary=sc.nextDouble();
	try
		{
			SalaryUsingException.validate(salary);
		}
	catch(InvalidSalException es)
	{
		System.out.println(es.getMessage());
	}
	}
}
