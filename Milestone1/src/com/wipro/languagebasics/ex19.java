package com.wipro.languagebasics;

public class ex19 {
	public static void main(String a[])
	{
		int n=Integer.parseInt(a[0]);
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");	
			}
			System.out.print("\n");
		}
	}

}
