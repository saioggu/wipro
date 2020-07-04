package com.wipro.clobco;
import java.lang.Math;
 class Calculator {
static double pow1;
static double pow2;
static double powerInt(int num1,int num2)
{
	pow1=Math.pow(num1,num2);
	return pow1;
}
static double powerDouble(double num1,int num2)
{
	pow2=Math.pow(num1,num2);
	return pow2;
}
}
class Calc{
	public static void main(String[] args) {
		double power1=Calculator.powerInt(2,3);
		double power2=Calculator.powerDouble(8.0,2);
		System.out.println("power1 = "+power1);
		System.out.println("power2 = "+power2);
	}
}
