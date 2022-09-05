//WAP to input the salary of an employee and if the salary is not in the range of 10000 to 20000 and Invalid Answer exception should be thrown
package com.java;
public class SalaryUsingException 
{
	static void validate(double sal) throws InvalidSalException
	{
		if(sal<10000 || sal>20000)
		{
			throw new InvalidSalException("Salary should be in the Range of 10000 to 20000");
		}
		else
		{
			System.out.println("Salary= "+sal);
		}
	
	}
}

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
