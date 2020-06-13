package com.wipro.languagebasics;

public class ex8 {
	public static void main(String a[])
	{
		char c=a[0].charAt(0);
		if(((c>='a')&&(c<='z'))||((c>='A')&&(c<='Z')))
		{
			System.out.print("alphabet");
		}
		else if(c>='0'&&c<='9')
		{
			System.out.print("number");
		}
		else
		{
			System.out.print("special character");
		}
	}

}
