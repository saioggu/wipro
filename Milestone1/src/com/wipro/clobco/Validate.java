package com.wipro.clobco;

 class Patient {
	 double w ,h;
	String name;
	double B;
    Patient(double width,double height)
    {
   	 w=width;
   	 h=height;
    }
    double computeBMI()
    {
   	B=(w/(h*h));
   	return B;
    }
}

class Validate {
	public static void main(String[] args) {
		Patient obj=new Patient(100,1.28);
		double k=obj.computeBMI();
		System.out.println("BMI = "+k);
	}

}
