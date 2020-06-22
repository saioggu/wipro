package com.wipro.languagebasics;

public class ex32 {
	  public static void main(String[] args) {
    	  int l=args.length;
    	  int []a=new int[l];
		int k=0,c=0;
		for(int i=0;i<l;i++)
		{
			int x=Integer.parseInt(args[k]);
			a[i]=x;
			k++;
		}
		for(int i=0;i<l;i++)
		{
			if(a[i]==1||a[i]==4)
			{
				c++;
			}
		}
		if(c==l)
		{
			System.out.println("true");
		}
		else
		
			System.out.println("false");
		}

}
