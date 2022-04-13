import java.util.Scanner;

public class payroll1 {

	static	Employee[] employee = new Employee[6];
	private static final int IsPaid = 0; 


	public static void main (String[] args) {


		int count =0;
		int userchoice = 0;
		Scanner sc = new Scanner(System.in);
		
		int hours ;
		int index = 0 ;
		String SSN  ;
		double salary ;
		String name ;
		String University ;
		boolean IsPaid = false;
		int contractPeriodInMonths;
		

		do {
			printMenu();
			userchoice = sc.nextInt();
			
			

			printMenu();
			System.out.println("Enter the employee type");
			userchoice = sc.nextInt();

			if(userchoice == 1) { 

// fulltime employee
				System.out.println("What is the name of the Employee?"); 
				name = sc.nextLine();



				System.out.println("What is the SSN of the Employee?"); 
				SSN=sc.nextLine();

				System.out.println("What is the salary of the Employee:"); 
				salary=sc.nextDouble();

				employee [index] = new FullTimeEmployee(name, salary, SSN);
				index++;




			}else if(userchoice == 2) { //parttime

				System.out.println("What is the name of the Employee?"); 
				name =sc.nextLine();



				System.out.println("What is the SSN of the Employee?"); 
				SSN =sc.nextLine();

				System.out.println("What is the salary of the Employee:"); 
				salary=sc.nextDouble();

				System.out.println("Number of hours worked"); 
				hours=sc.nextInt();

				employee [index] = new PartTimeEmployee(name, salary, SSN, hours);
				index++;

				






				sc.nextLine();
			}else if(userchoice == 3) { //intern

				System.out.println("What is the name of the Employee?"); 
				name =sc.nextLine();



				System.out.println("What is the SSN of the Employee?"); 
				SSN=sc.nextLine();

				System.out.println("What is the salary of the Employee:"); 
				salary=sc.nextDouble();

				System.out.println(" enter the number of  hours employee worked"); 
				hours=sc.nextInt();

				System.out.println("Name of the University? "); 
				University=sc.nextLine();

				System.out.println("is Employee paid? "); 
                IsPaid = sc.nextBoolean();
				employee [index] = new InternEmployee(name, salary,SSN, hours,University, IsPaid);

				index++;


			}else if (userchoice == 4) {

				System.out.println("What is the name of the Employee?"); 
				name =sc.nextLine();



				System.out.println("What is the SSN of the Employee?"); 
				SSN=sc.nextLine();

				System.out.println("What is the salary of the Employee:"); 
				salary=sc.nextDouble();

				System.out.println(" enter the contractpPeriodInMonths employee worked"); 
				contractPeriodInMonths=sc.nextInt();



				employee [index] = new ConsultantEmployee(name, salary,SSN, contractPeriodInMonths);

				index++;
				
			}else {
					System.out.println("Invalid Choice number entered !!!.");
					break;
	
	
			}		
				
			} while(userchoice !=0 && count !=6);

			System.out.println("payroll for each employee in employees array is:");




			    for (int i = 0; i <=employee.length-1; i++) {
				System.out.println("Employee ID>: " + employee[i].employeeid + " and salary is: " + employee[i].getpay());
			}

			    sc.close();
			
	}
		
		public static void printMenu() {
			System.out.println("please enter the Employees:");
			String menu = "Employee types\n\t1.FullTim\n"   +"\t2.Parttime\n"+ "\t3.Intern\n "+ "\t4.Consultant\n"+ "\t0.Exit";
			System.out.println(menu);
		}
	}