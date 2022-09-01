/*Wap to input an array having 5 strings and display them*/
package com.java;
import java.util.*;
public class Array2 
{
		public static void main(String[] args)
		{
			String a[]=new String[5];
			for(int i=0;i<5;i++)
			{
				Scanner sc=new Scanner(System.in);
				String str=sc.nextLine();
				a[i]=str;
			}
			for(int i=0;i<5;i++)
			{
				System.out.println("a["+i+"]="+a[i]);
			}
		}
}
