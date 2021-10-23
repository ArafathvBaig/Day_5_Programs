package com.Day_5_Programs;

import java.util.Scanner;

public class Distance 
{
	public static void main(String[] args) 
	{
		double x1,y1,length;
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter the value of x1: ");
				x1=sc.nextDouble();
				System.out.println("Enter the value of y1: ");
				y1=sc.nextDouble();
				length=Math.sqrt(Math.pow((0-x1),2) + Math.pow((0-y1),2));
			    System.out.println("The length of ("+x1+", "+y1+") and origin (0, 0) is:");
			    System.out.println(+length);
	}
}
