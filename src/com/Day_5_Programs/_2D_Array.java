package com.Day_5_Programs;

import java.util.Scanner;

public class _2D_Array 
{
	 public static void main(String args[])
	 {
	       Scanner sc=new Scanner(System.in);
	       System.out.print("Enter 2D Array Rows : ");
	       int rows=sc.nextInt();
	       System.out.print("Enter 2D Array Columns : ");
	       int columns=sc.nextInt();
	       System.out.println("Enter 2D Array Elements : ");    
	       int array2D[][]=new int[rows][columns]; 
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	                array2D[i][j]=sc.nextInt();
	            }
	         }
	        System.out.print("\nData you entered : \n");
	        for(int i=0; i<rows;i++)
	         {            
	            for(int j=0; j<columns;j++)
	            {
	            	System.out.print(array2D[i][j]+" ");
				}
				System.out.println();
	         }
	    } 
}
