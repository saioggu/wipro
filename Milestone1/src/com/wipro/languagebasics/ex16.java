package com.wipro.languagebasics;

public class ex16 {
	public static void main(String a[])
	{
		int i =0;
	       int num =0;
	       String  primeNumbers = "";

	       for (i = 10; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println(primeNumbers);
	}

}
