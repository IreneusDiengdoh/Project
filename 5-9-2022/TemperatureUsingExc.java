/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the temperature (in Celsius) given by the user passed  is too hot or too cold.

If temperature > 35, throw exception “TooHot”.

 If temperature <5, throw exception “TooCold”.

Otherwise, print “Normal” and convert it to Farenheit*/
package com.java;
public class TemperatureUsingException
{
	public static void checktemp(double temp) throws TooHotException, TooColdException
	{
		double fah=0;
		if(temp>32)
		{
			throw new TooHotException("Too Hot");
		}
		else if(temp<5)
		{
			throw new TooColdException("Too Cold");
		}
		else
		{
			fah=((temp*9)/5)+32;
			System.out.println("Normal And The Temperature In Farenheit= "+fah);
		}
	}
}
