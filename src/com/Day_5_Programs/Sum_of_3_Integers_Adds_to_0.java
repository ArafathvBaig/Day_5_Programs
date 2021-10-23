package com.Day_5_Programs;

import java.util.Scanner;

public class Sum_of_3_Integers_Adds_to_0
{
	public static void main(String[] args) 
	{
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter the Size of array: ");
		int size=inp.nextInt();
		int array[]=new int[size];
		int count=0;
		System.out.println("Enter the Element of array: ");
		for(int i=0;i<size;i++) 
		{
			array[i]=inp.nextInt();
		}
	    for (int i = 0; i < size; i++) 
	    {
	        for (int j = i + 1; j < size; j++)
	        {
	            for (int k = j + 1; k < size; k++) 
	            {
	                if (array[i] + array[j] + array[k] == 0) 
	                {
	                	count=count+1;
	                    System.out.println("Distinct Triplets : " + array[i] + "," + array[j] + " and " + array[k]);
	                }
	            }
	        }
	    }
	    System.out.println("No.of Distinct Triplets: "+count);
	}
}
