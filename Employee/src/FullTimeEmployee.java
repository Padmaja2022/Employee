/*Author  Paadmaja
 * Date 3\3\2022
 * Description    wrtting program for Full time employ class (child class), constructors and Getters and setters and get pay method
 * 
 * 
 */
public class FullTimeEmployee extends Employee  {

	public FullTimeEmployee(String name, double salary, String ssn) {
		super(name, salary, ssn);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	public double CalculateBonus() {
		
		 double Bonus =this.salary*(15/100);
		return Bonus;
		
		
	}
@Override
public double getpay() {
	double pay = this.salary/26;
	return pay;
	
	
}

}
