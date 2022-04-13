/*
 * Author  Paadmaja
 * Date 3\3\2022
 * Description    wrtting program for Part time employ class (child class), constructors and Getters and setters and get pay method
 * 
 * 
 * 
 */
public class PartTimeEmployee extends Employee{
private int hours ;

public PartTimeEmployee(String name, double salary, String ssn, int hours) {
	super(name, salary, ssn);
	this.hours = hours;
}

/**
 * @return the hours
 */
public int getHours() {
	return hours;
}

/**
 * @param hours the hours to set
 */
public void setHours(int hours) {
	this.hours = hours;
}

@Override
public double getpay() {
	double pay = this.salary* this.hours*2;
	return pay;
	
	
}


}
