package com.wipro.Exception;
 import java.util.*;
public class ExceptionDemo {
  public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number of elements");
	int size=Integer.parseInt(s.nextLine());
	int index;
	int[] a=new int[size];
	try {
		System.out.println("Enter elements in array");
		for(int i=0;i<size;i++)
		{
			a[i]=Integer.parseInt(s.nextLine());
		}
		System.out.println("Enter the index of element");
		index=Integer.parseInt(s.nextLine());
		System.out.println("The array element at the index "+ index +" = "+a[index]);
		 System.out.println("The array element succesfully accessed");
	}
	catch(NumberFormatException e) {
		System.out.println("java.lang.NumberFormatException");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	}
}
}
