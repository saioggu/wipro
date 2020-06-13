package com.wipro.languagebasics;

public class ex15 {
	public static void main(String a[])
	{
		int n=Integer.parseInt(a[0]);
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		if(prime==true)
		{
			System.out.print("Prime");
		}
		else
		{
			System.out.print("Not prime");
		}
	}

}
