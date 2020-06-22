package com.wipro.languagebasics;

public class ex30 {
	 public static void main(String[] args) {
         int l=args.length;
         int[][] a=new int[4][4];
         if(l<4)
         {
         	System.out.println("Please enter 4 integer numbers");
         }
         if(l==4) 
         {
 			int k=0;
        for (int i=0;i<2;i++)
 			{   
 				for(int j=0;j<2;j++)
 				{
 					int x=Integer.parseInt(args[k]);   
 					a[i][j]=x;
 					k++;
 				} 
 			}
      
        for (int i=1;i>=0;i--)
			{   
				for(int j=1;j>=0;j--)
				{
				
              System.out.print(a[i][j]+" ");      				
              }
				System.out.println();
			}
			} 
         
}

}
