package com.wipro.languagebasics;

public class ex23 {
	public static void main(String args[])
	{
		int sum=0;
		float average;
		int i,n;
		int a[]= {1,2,3,4,5,6,7,8,9};
		n=a.length;
		for(i=0;i<n;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
		average=sum/n;
		System.out.println(average);
	}

}
