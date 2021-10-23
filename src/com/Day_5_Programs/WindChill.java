package com.Day_5_Programs;

public class WindChill 
{
	public static void main(String[] args) 
	{
		//Note: the formula is not valid if t is larger than 50 in absolute value 
		//or  if v is larger than 120 or less than 3 
		//(you may assume that the values you get are in that range).
		double t= 40;
		double v= 50;
		double w;
		w=35.74+(0.6215*t)+(((0.4275*t)-35.75)*(Math.pow(v, 0.16)));
		System.out.println(+w);
	}
}
