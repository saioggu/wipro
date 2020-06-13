package com.wipro.languagebasics;

public class ex21 {
	public static void main(String a[])
	{
		int j=Integer.parseInt(a[0]);
		int n=j;
		int rev=0;
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		if(j==rev)
		{
			System.out.print(j + " is a palindrome");
		}
		else
		{
			System.out.print(j + " is not a palindrome");
		}
	}

}
