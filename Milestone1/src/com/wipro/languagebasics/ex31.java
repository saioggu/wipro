package com.wipro.languagebasics;

public class ex31 {
	public static void main(String[] args) {
		int []a=new int[]{1,2,3};
		int []b=new int[]{4,5,6};
	    int []c=new int[10];
	   c[0]=a[1];
	   c[1]=b[1];
	   for(int i=0;i<2;i++)
	   {
		   System.out.print(c[i]);
		   if(i<1)
		   {
			   System.out.print(", ");
		   }
	   }
	}

}
