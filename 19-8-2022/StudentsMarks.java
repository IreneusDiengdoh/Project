/*Write a Java Program to take marks of a student and then print his/her grade depending on the following conditions:
90 to 100 then grade is A+, 
80 to 90  then grade is A
70 to 80 then grade is B+
60 to 70 then grade is B
50 to 60 then grade is C
40 to 50 then grade is D
30 to 40 then grade is E
less than 30 then grade is F*/
package com.java;
public class StudentsMarks
{
	public static void main(String[] args)
	{
		int mark=89;
		if(mark>=90 || mark==100)
		{
			System.out.println("Grade A+");
		}
		else if(mark>=80 || mark==89)
		{
			System.out.println("Grade A");
		}
		else if(mark>=70 || mark==79)
		{
			System.out.println("Grade B+");
		}
		else if(mark>=60 || mark==69)
		{
			System.out.println("Grade B");
		}
		else if(mark>= 50 || mark==59)
		{
			System.out.println("Grade C");
		}
		else if(mark>=40 || mark==49)
		{
			System.out.println("Grade D");
		}
		else if(mark>=30 || mark==39)
		{
			System.out.println("Grade E");
		}
		else
		{
			System.out.println("Grade F");
		}
	}
}
