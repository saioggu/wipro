package com.wipro.languagebasics;

public class ex6 {
	public static void main(String a[])
	{
		int k= a.length;
		if(k==0)
		{
			System.out.print("No values");
		}
		else {
			System.out.print(a[0]);
			for(int i=1;i<k;i++)
			{
				System.out.print("," + a[i]);
			}
		}
	}
	
	

}

