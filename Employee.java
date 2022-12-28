package empmanagmentapplication;

public class Employee {
	
	private int id;
	private String name;
	private int age;
	private String job;
	private String department;
	private double salary;
	
	public Employee(int id, String name, int age, String job, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
		this.department = department;
		this.salary = salary;
	}
	
	// Getter-Methoden:
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return job;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	//Setter-Methoden:
	public int setID(int id) {
		return this.id = id;
	}
	
	public String setName(String name) {
		return this.name = name;
	}
	
	public int setAge(int age) {
		return this.age = age;
	}
	
	public String setJob(String job) {
		return this.job = job;
	}
	
	public String setDepartment(String department) {
		return this.department = department;
	}
	
	public double setSalary(double salary) {
		return this.salary = salary;
	}
	
	//override toString Methode:
	public String toString() {
		return "Employee {id: " + id + ", name: " + name + ", age: " + age + ", job: " + job + ", Department: " + department + ", salary: " + salary + " }";
	}
}
