package com.wipro.inherit;

 class Animal {
     void aeat()
     {
    	 System.out.println("Animal eat");
     }
     void sleep()
     {
    	 System.out.println("Animal sleep");
     }
}
 class Bird extends Animal{
	 void eat()
     {
    	 System.out.println("Bird eat");
     }
     void sleep()
     {
    	 System.out.println("Bird sleep");
     }
     void fly()
     {
    	 System.out.println("Bird fly");
     }
    
 }
 class test{
	 public static void main(String[] args) {
		Animal obj=new Animal();
		Bird obj1=new Bird();
		obj.aeat();
		obj.sleep();
		obj1.aeat();
		obj1.fly();
		}
 }
 
