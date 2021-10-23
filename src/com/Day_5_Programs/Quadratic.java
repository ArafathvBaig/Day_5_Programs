package com.Day_5_Programs;

import java.util.Scanner;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of a,b,c: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		double r1;
		double r2;
		double delta;
		delta = (b*b)-(4*a*c);
		r1 = (-b + Math.sqrt(delta))/(2*a);
		r2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("Root-1 is: "+r1);
		System.out.println("Root-2 is: "+r2);
	}
}
