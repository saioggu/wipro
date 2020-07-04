package com.wipro.inherit;

public class Employee extends Person {
double salary;
int year;
String national_insurance_number;
void setName(String n)
{
	set(n);
}
void setanual_salary(double s) {
	salary=s;
}
void setyear_of_work(int y) {
	year=y;
}
void setnational_insurance_num(String i) {
	national_insurance_number=i;
}
void getEmployeedata()
{
	System.out.println("emp name :"+name);
	System.out.println("annual salary :"+salary);
	System.out.println("startedd working in the year:"+year);
	System.out.println("national insurancee num:"+national_insurance_number);
	
	
	
	
	
}
}
