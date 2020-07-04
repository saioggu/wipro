package com.wipro.overpoly;
class Fruit
{
	String name;
	String taste;
	String size;
	Fruit(String n,String t,String s){
		name=n;
		taste=t;
		size=s;
	}
	void eat() {
		System.out.println(name+" is "+taste);
	}
}
	class Apple extends Fruit 
	{
		Apple(String n,String t,String s){
			super(n,t,s);
		}
			void eat()
			{
				System.out.println(name+" is "+taste);
			}
		}
	class Orange extends Fruit 
	{
		Orange(String n,String t,String s){
			super(n,t,s);
		}
			void eat()
			{
				System.out.println(name+" is "+taste);
			}
		}
public class Fruittest {
public static void main(String[] args) {
	Apple a= new Apple("Apple","sweet","large");
	Orange o=new Orange("orange","sour","medium");
	a.eat();
	o.eat();
}
}
