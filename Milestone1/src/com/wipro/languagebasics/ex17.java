package com.wipro.languagebasics;

public class ex17 {
	public static void main(String a[])
	{
		int i,flag=0;
		int n=Integer.parseInt(a[0]);
		if(n==0||n==1)
		{
			System.out.print(n + " is neither prime nor composite");
		}
		else {
		for(i=2;i<=n/2;i++)
		if(n%i==0)
		{
			System.out.print(n + " is not a prime number");
			flag=1;
			break;
		}
		if(flag==0)
		{
			System.out.print(n + " is a prime number");
		}
	}}

}
