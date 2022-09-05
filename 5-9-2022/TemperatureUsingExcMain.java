package com.java;
import java.util.*;
public class TemperatureUsingExceptionMain 
{
		public static void main(String[] args) throws TooColdException, TooHotException
		{
		double temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature:");
		temp=sc.nextDouble();
		try
			{
			 TemperatureUsingException.checktemp(temp);
			}
		catch(TooHotException th)
		{
			System.out.println(th.getMessage());
		}	
		
		catch(TooColdException tc)
		{
			System.out.println(tc.getMessage());
		}
	}
}	
