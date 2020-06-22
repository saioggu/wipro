package com.wipro.languagebasics;

public class ex24 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		int min=a[0];
		int max=a[0];
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			else if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
