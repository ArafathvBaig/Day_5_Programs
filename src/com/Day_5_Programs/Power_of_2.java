package com.Day_5_Programs;

import java.util.Scanner;

public class Power_of_2 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Power: ");
		n=sc.nextInt();	
		if((n>=0) && (n<31))
		{
			for(int i=1; i<=n; i++)
			{
				int temp=(int) Math.pow(2, i);
				System.out.println(+temp);
			}
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
}
