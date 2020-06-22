package com.wipro.languagebasics;

public class ex28 {
	public static void main(String[] args)
	{
		 int a[] = new int[] {11,2,3,4,5,6,7};
		 int temp;
		 int n=a.length;
	   for(int i=0;i<n;i++)
	   {
	   	for(int j=1;j<n-i;j++)
	   	{
	   		if(a[j-1]>a[j])
	   		{
	   			temp=a[j-1];
	   			a[j-1]=a[j];
	   			a[j]=temp;
	   		}
	   	}
	   	for(i=0;i<a.length;i++)
	   	{
	   		System.out.print(a[i]+"     ");
	   	}
	   

}}}