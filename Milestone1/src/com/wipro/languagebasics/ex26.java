package com.wipro.languagebasics;

public class ex26 {
	public static void main(String[] args) 
	{
 	   int a[]= {67,87,89,95,43};
 	   String str =null;
        for(int i:a)
        {
            str = Character.toString((char)i);
            System.out.print(str+" ");
        }
	}

}
