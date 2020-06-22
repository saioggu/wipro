package com.wipro.languagebasics;

public class ex25
{
	public static void main(String a[])
	{
		int x =Integer.parseInt(a[0]);
		int ar[]= {1,2,3,4,5,6,7,8};
		int n=ar.length;
		int i,d=0;
		for( i=0;i<n;i++)
		{
			if(ar[i]==x)
			{
				d=1;
				break;
			}
			else
			{
				d=0;
			}
		}
		if(d==1)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("-1");
		}
		
		
		
	}

}
