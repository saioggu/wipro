package com.wipro.languagebasics;

public class ex33 {
	public static void main(String[] args) {
   	 int l=args.length;
  	  int []a=new int[l];
  	  int []b=new int[l];
		int k=0;
		for(int i=0;i<l;i++)
		{
			int x=Integer.parseInt(args[k]);
			a[i]=x;
			k++;
		}
		int j=0;
		for(int i=0;i<l;i++)
		{
			if(a[i]!=10) {
				b[j++]=a[i];
			}
		}
		for(int i=j;i<l;i++)
		{
			b[j]=0;
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(b[i]+" ");
                  if(i<l-1) {
                  	System.out.print(",");
                  }
		}
	}
}
