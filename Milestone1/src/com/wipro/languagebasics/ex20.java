package com.wipro.languagebasics;

public class ex20 {
	public static void main(String a[])
	{
		int n=Integer.parseInt(a[0]);
		int rev=0;
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
			
		}
		System.out.print(rev);
	}

}
