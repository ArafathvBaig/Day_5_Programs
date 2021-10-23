package com.Day_5_Programs;

import java.util.Scanner;

public class Largest_Among_3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number-1: ");
		int n1=sc.nextInt();
		System.out.println("Enter the Number-2: ");
		int n2=sc.nextInt();
		System.out.println("Enter the Number-3: ");
		int n3=sc.nextInt();
		System.out.println("Number1: "+n1);
		System.out.println("Number2: "+n2);
		System.out.println("Number3: "+n3);
		if((n1>n2) && (n1>n3))
		{
			System.out.println(+n1+" is Greater than "+n2+" and "+n3);
		}
		else if((n2>n1) && (n2>n3))
		{
			System.out.println(+n2+" is Greater than "+n1+" and "+n3);
		}
		else
		{
			System.out.println(+n3+" is Greater than "+n1+" and "+n2);
		}
	}
}
