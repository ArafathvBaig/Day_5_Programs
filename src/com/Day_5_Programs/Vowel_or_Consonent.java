package com.Day_5_Programs;

import java.util.Scanner;

public class Vowel_or_Consonent 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Single Character: ");
		char c = sc.next().charAt(0);
		if(String.valueOf(c).length()>1)
		{
			System.out.println("Input is not a SIngle Character");
		}
		else
		{
			if(c== 'a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
			{
				System.out.println("The Number "+c+" is Vowel");
			}
			else
			{
				System.out.println("The Character "+c+" is Consonent");
			}
		}
	}
}
