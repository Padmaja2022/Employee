/*Author Padmaja
 * date 3\3\2022
 * description   writting a program for Employee class(Parent class)  with abstract class     
 * 1.create a class name Employee
 * 2.Attributes private String name,
     protected double salary; 
     protected SSN;
      static int ID;
     
 * 3.Constructors
 * 4. methods
 *5. getpay();
 */
public abstract class Employee {
	
	private String name;
	protected double salary;
	protected  String ssn;
	protected  final int employeeid;
	static  int nextid=1;
	//@Constructor
	public Employee(String name, double salary, String ssn) {
		super();
		this.name = name;
		this.salary = salary;
		this.ssn = ssn;
		this.employeeid =nextid;
		nextid++;
	}
	
	
/**
	 * @return the nextid
	 */
	public static int getNextid() {
		return nextid;
	}


/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}


	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}


	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}


public  abstract double getpay();


@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", ssn=" + ssn + "]";
}


}
