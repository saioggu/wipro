package com.wipro.languagebasics;

public class ex9 {
	public static void main(String a[])
	{
		char gender=a[0].charAt(0);
		int age=Integer.parseInt(a[1]);
		if(gender=='m')
		{
			if(age>=1 && age<=58)
			{
				System.out.print("the percentage of interest is 8.4%");
			}
			else
			{
				System.out.print("the percentage of interest is 10.5%");
			}
		}
		else if(gender=='f')
		{
			if(age>=1 && age<=58)
			{
				System.out.print("the percentage of interest is 8.2%");
			}
			else
			{
				System.out.print("the percentage of interest is 8.2%");
			}
		}
		
	}

}
