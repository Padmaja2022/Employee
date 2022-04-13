/*
 * Author  Paadmaja
 * Date 3\3\2022
 * Description    wrtting program for consultant employ class (child class), constructors and Getters and setters and get pay method
 * 
 * 
 * 
 */
public class ConsultantEmployee extends Employee {

	
	private int contractPeriodInMonths;

	public ConsultantEmployee(String name, double salary, String ssn, int contractPeriodInMonths) {
		super(name, salary, ssn);
		this.contractPeriodInMonths = contractPeriodInMonths;
	}

	/**
	 * @return the contractPeriodInMonths
	 */
	public int getContractPeriodInMonths() {
		return contractPeriodInMonths;
	}

	/**
	 * @param contractPeriodInMonths the contractPeriodInMonths to set
	 */
	public void setContractPeriodInMonths(int contractPeriodInMonths) {
		this.contractPeriodInMonths = contractPeriodInMonths;
	}
	
	
@Override
public double getpay() {
	double pay = this.salary* this.contractPeriodInMonths/2;
	return pay;
	
	
}
	
	
}
