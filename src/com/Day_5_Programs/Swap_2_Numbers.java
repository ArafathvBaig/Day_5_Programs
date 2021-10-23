package com.Day_5_Programs;

import java.util.Scanner;

public class Swap_2_Numbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number-1: ");
		int n1=sc.nextInt();
		System.out.println("Enter the Number-2: ");
		int n2=sc.nextInt();
		System.out.println("BEFORE SWAP");
		System.out.println("Number-1: "+n1);
		System.out.println("Number-2: "+n2);
		int temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("AFTER SWAP");
		System.out.println("Number-1: "+n1);
		System.out.println("Number-2: "+n2);
	}
}
