package com.wipro.inherit;

class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
	void erase() {
		System.out.println("Erasing Shape");
	}
}
class circle extends Shape{
	void draw()
	{
		System.out.println("Drawing circle");
	}
	void erase()
	{
		System.out.println("erasing circle");
	}
}
class triangle extends Shape{
	void draw()
	{
		System.out.println("Drawing triangle");
	}
	void erase()
	{
		System.out.println("erasing triangle");
	}
}
class square extends Shape{
	void draw()
	{
		System.out.println("Drawing square");
	}
	void erase()
	{
		System.out.println("erasing square");
	}
}

public class Shapetest {
  public static void main(String[] args) {
	Shape s=new Shape();
	Shape c=new circle();
	Shape t=new triangle();
	Shape S=new square();
	s.draw();
	s.erase();
	c.draw();
	c.erase();
     t.draw();
	t.erase();
	S.draw();
	S.erase();
}
}
