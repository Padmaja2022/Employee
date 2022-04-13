/*
 * Author  Paadmaja
 * Date 3\3\2022
 * Description    wrtting program for intren time employ class (child class), constructors and Getters and setters and get pay method
 * 
 * 
 * 
 */
public class InternEmployee extends Employee {	
	
	
	private int hours;
	private String University;
	private boolean isPaid;


	public InternEmployee(String name, double salary, String ssn) {
		super(name, salary, ssn);

}


	public InternEmployee(String name, double salary, String ssn, int hours, String university, boolean  ispaid) {
		super(name, salary, ssn);
		this.hours = hours;
		this.University = university;
		this.isPaid = ispaid;
	}


	/**
	 * @return the university
	 */
	public String getUniversity() {
		return University;
	}


	/**
	 * @param university the university to set
	 */
	public void setUniversity(String university) {
		University = university;
	}
	
@Override
public double getpay() {
	
	if(this.isPaid){
		double pay = this.salary*this.hours *2;	
		return pay;
	}
			
	else {
		return 0.00;
		
	}
	
	
	
}

	
	
	
}




