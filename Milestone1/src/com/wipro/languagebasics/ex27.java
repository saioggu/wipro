package com.wipro.languagebasics;

public class ex27 
{
	public static void main(String[] args) {
   	 int a[] = new int[] {1,2,3,4,7,13,6};
   	 int b[]=new int[a.length];
   	 int temp;
   	   b=a;
       for(int i=0;i<a.length;i++) {
       	for(int j=1;j<a.length-i;j++) {
       		if(a[j-1]>a[j])
       		{
       			temp=a[j-1];
       			a[j-1]=a[j];
       			a[j]=temp;
       		}
       	}
	}
       for(int i=0;i<a.length;i++) {
       	for(int j=1;j<a.length-i;j++) {
       		if(b[j-1]<b[j])
       		{
       			temp=b[j-1];
       			b[j-1]=b[j];
       			b[j]=temp;
       		}
       	}
	}
       System.out.println("1st max:"+a[0]);
       System.out.println("2nd max:"+a[1]);
       System.out.println("1st min:"+b[b.length-1]);
       System.out.println("2nd min:"+b[b.length-2]);

       
}
	

}
