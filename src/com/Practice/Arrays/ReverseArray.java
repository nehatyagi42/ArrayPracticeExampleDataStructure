package com.Practice.Arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main (String [ ] args)
	{
	Scanner sc= new Scanner (System.in);
	System.out.println ("enter the size");
	int length= sc.nextInt ();
	int arr [ ] =new int [length];

	System.out.println ("enter the "+length+" elements");
	for (int i = 0; i < arr.length; i++)
	{
	arr[i] =sc.nextInt ();
	}
System.out.println("Before reverse of An Array");
	for (int i = 0; i < arr.length; i++)
	{
	System.out.println ("arr ["+i+"] ---->"+arr[i]);
	}
	for (int i = 0; i < arr.length/2; i++)
	{
	   int t=arr[i];
	   arr[i]=arr[arr.length-1-i];
	   arr[arr.length-1-i]=t;
	}
	System.out.println("After reverse of An Array");

	for (int i = 0; i < arr.length; i++)
	{
	System.out.println ("arr ["+i+"] ---->"+arr[i]);
	}
	}
}
