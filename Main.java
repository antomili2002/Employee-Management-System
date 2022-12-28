package empmanagmentapplication;

import java.util.Scanner;

public class Main {
	
	EmployeeService service = new EmployeeService();
	
	static boolean ordering = true;
	
	public static void menu() {
		System.out.println("******************Welcome to Employee Managment System******************\n" +
				 "Press a number (1-6) to take an action:" +
				"\n1. Add Employee" +
				"\n2. View Employee" +
				"\n3. Update Employee" +
				"\n4. Delete Employee" +
				"\n5. View all Employees" +
				"\n6. Exit" + 
				"\n");
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//erstelle Objeckt 
		EmployeeService service = new EmployeeService();
		
		do {
			menu();
			System.out.println("Enter your choice: ");
			int choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Add Employee: ");
				service.addEmployee();
				break;
				
			case 2:
				System.out.println("View Employee: ");
				service.viewEmp();
				break;
				
			case 3:
				System.out.println("Update Employee: ");
				service.updateEmployee();
				break;
				
			case 4:
				System.out.println("Delete Employee: ");
				service.deleteEmployee();
				break;
				
			case 5:
				System.out.println("View all Employees: ");
				service.viewAllEmps();
				break;
				
			case 6:
				System.out.println("Thank you for using this application!");
				System.exit(0);
				
			default:
				System.out.println("Please enter a value of 1-6!");
				break;
			}
		}while(ordering);
	}

}
