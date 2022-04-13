
import java.util.*;

/*Author  Paadmaja
 * Date 3\3\2022
 * Description    wrtting program for payroll  class , constructors Attributes creating objects and implementing in main method.
 * 
 * 
 * 
 * 
 */


public class Payroll {

	private static final boolean IsPaid  = false;     
	static	Employee[] employee = new Employee[2];

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int count =0;
		int userchoice = 0;



		// do while loop
		do {

			


			System.out.println("What is the name of the Employee?");
			String name = sc.nextLine();

					
			sc.nextLine();
			System.out.println("What is the SSN of the Employee?");
			String SSN =sc.nextLine();
			sc.nextLine();
					
			System.out.println("What is the salary of the Employee:");
			double salary =sc.nextDouble();
					

			printMenu();
			System.out.println("Enter the employee type"); 
			userchoice = sc.nextInt();

			if (userchoice ==1) { 
				//Creating object  for child class
				FullTimeEmployee ft_employee = new FullTimeEmployee(name, salary, SSN);

				employee[count]= ft_employee; count ++;

			} else if(userchoice ==2) { 
				System.out.println("enter the hours of Employee");
				int hours = sc.nextInt();

				//Creating object  for child class
				PartTimeEmployee ptemployee = new PartTimeEmployee(name, salary, SSN, hours);
				System.out.println("employee name"); 
				employee[count]= ptemployee;
				count++; //
				sc.nextLine();
			} else if (userchoice==3) {

				System.out.println("enter the name of university");
				String University =sc.nextLine();


				System.out.println("enter the is salary paid?");
				boolean IsPaid =sc.nextBoolean();


				int hours = 0; 
				//Creating object  for child class
				InternEmployee inemployee = new InternEmployee(name, salary,SSN, hours, University, IsPaid);

				employee[count]=inemployee;
				count ++;
			} else if(userchoice == 4) {

				System.out.println("enter the time of contract"); 
				int contractPeriodInMonths =sc.nextInt();

				ConsultantEmployee conemployee = new ConsultantEmployee(name, salary,SSN,contractPeriodInMonths); 					
				employee[count]=conemployee;
				count ++;
			} /*else if (userchoice ==0) {
				//System.out.println("Invalid Choice number entered !!!.");
				break;
				*/
 else  {
	System.out.println("Invalid Choice number entered !!!.");
	break;
}

	

		} while(userchoice !=0 && count!=2);

		System.out.println("payroll for each employee in employees array is:");
// for loop
	if (employee.length!=0 ) {
		
	
		for (int i = 0; i <=employee.length-1; i++) {
			System.out.println("Employee ID>: " + employee[i].employeeid + " and salary is: " + employee[i].getpay());
		}
	}else {
		System.out.println("No employee is entered:" );
	}
		sc.close();

	}
// method for printMenu
	public static void printMenu() {
		System.out.println("please enter the Employees:");
		String menu = "Employee types\n\t1.FullTime\n"   +"\t2.Parttime\n"+ "\t3.Intern\n "+ "\t4.Consultant\n"+ "\t0.Exit";
		System.out.println(menu);
	}












}
