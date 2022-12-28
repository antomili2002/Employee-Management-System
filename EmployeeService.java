package empmanagmentapplication;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	//speichere alle Daten der Mitarbeiter
	HashSet<Employee> employeeSet = new HashSet<Employee>();
	
	Employee emp1 = new Employee(100, "Lisa", 20, "Developer", "IT", 48000);
	Employee emp2 = new Employee(222, "Max", 34, "CFO", "Management", 155000);
	Employee emp3 = new Employee(345, "Chris", 41, "System Engenieer", "IT", 72000);
	Employee emp4 = new Employee(678, "Annalena", 23, "Social Marketing Manager", "Marketing", 35000);
	
	Scanner scanner = new Scanner(System.in);
	
	int id;
	String name;
	int age;
	String job;
	String department;
	double salary;
	boolean found = false;
	
	public EmployeeService() {
		employeeSet.add(emp1);
		employeeSet.add(emp2);
		employeeSet.add(emp3);
		employeeSet.add(emp4);
	}
	
	//view all employees
	public void viewAllEmps() {
		for(Employee emp: employeeSet) {
			System.out.println(emp);
		}
	}
	
	//view employee based on id
	public void viewEmp() {
		System.out.println("Enter ID: ");
		id = scanner.nextInt();
		
		for(Employee emp: employeeSet){
			if(emp.getID()==id) {
				System.out.println(emp);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee with this id is not available!");
		}
		
	}
	
	//update Employees
	public void updateEmployee() {
		System.out.println("Enter id: ");
		id = scanner.nextInt();
		int choice;
		for(Employee emp: employeeSet) {
			if(emp.getID()==id) {
				System.out.println("What do you want to update?: " +
									"\n1. name" +
									"\n2. age" +
									"\n3. job" +
									"\n4. department" +
									"\n5. salary");
				choice = scanner.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter name: ");
					name = scanner.next();
					emp.setName(name);
					break;
					
				case 2:
					System.out.println("Enter age: ");
					age = scanner.nextInt();
					emp.setAge(age);
					break;
					
				case 3:
					System.out.println("Enter job: ");
					job = scanner.next();
					emp.setJob(job);
					break;
					
				case 4:
					System.out.println("Enter department:");
					department = scanner.next();
					emp.setDepartment(department);
					break;
					
				case 5:
					System.out.println("Enter salary: ");
					salary = scanner.nextDouble();
					emp.setSalary(salary);
					break;
					
				default:
					System.out.println("Please enter a value between 1-5!");
					break;
				}
				System.out.println("Updated details of Employee: ");
				System.out.println(emp);
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee is not available");
		}
		else {
			System.out.println("Employee details updated succesfully");
		}
	}

	// add an Employee
	public void addEmployee() {
		System.out.println("Enter id: ");
		id = scanner.nextInt();
		System.out.println("Enter name: ");
		name = scanner.next();
		System.out.println("Enter age: ");
		age = scanner.nextInt();
		System.out.println("Enter job: ");
		job = scanner.next();
		System.out.println("Enter department: ");
		department = scanner.next();
		System.out.println("Enter salary: ");
		salary = scanner.nextDouble();
		
		Employee emp = new Employee(id, name, age, job, department, salary);
		
		employeeSet.add(emp);
		
		System.out.println(emp);
		System.out.println("Employee added succesfully");
	}
	
	//delete an Employee
	public void deleteEmployee() {
		System.out.println("Enter id: ");
		id = scanner.nextInt();
		Employee empdelete = null;
		for(Employee emp: employeeSet) {
			if(emp.getID()==id) {
				empdelete = emp;
				found = true;
			}
		}
		if(!found) {
			System.out.println("Employee is not available");
		}
		else {
			employeeSet.remove(empdelete);
			System.out.println("Employee deleted succesfully!");
		}
	}	
}
