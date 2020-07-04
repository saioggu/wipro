package com.wipro.clobco;
class Box {
double width,height,depth;

 Box (double w,double h,double d)
{
	 width=w;
      height=h;
      depth=d;
}
 double volume()
 {
	 double vol;
	vol=width*height*depth;
	return vol;
	}
}
public class volu
{
	public static void main(String[] args) {
		
		Box obj = new Box(10,10,10);
		double v1=obj.volume();
		System.out.println("volume of the box = "+v1);
		
	}
}

