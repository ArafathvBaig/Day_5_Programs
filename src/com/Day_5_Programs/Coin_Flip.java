package com.Day_5_Programs;

import java.util.Scanner;

public class Coin_Flip 
{
	public static void main(String[] args) 
	{
		int heads=0;
		int tails=0;
		int coinCheck;
		int n;
		int ph;
		int pl;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of times coin has to flip: ");
		n=sc.nextInt();	
		for(int i=1; i<=n; i++)
		{
			coinCheck = (int)(Math.random()*10)%2;
			System.out.println("Coin Check is: "+coinCheck);
			if(coinCheck<0.5)
			{
				System.out.println("Tails");
				tails=tails+1;
			}
			else
			{
				System.out.println("Heads");
				heads=heads+1;
			}
		}
		ph=((heads*100)/n);
		pl=((tails*100)/n);
		System.out.println("Number of Heads: "+heads);
		System.out.println("Number of Tails: "+tails);
		System.out.println("The Percentage of Heads is: "+ph);
		System.out.println("The Percentage of Tails is: "+pl);
	}
}
