package Exercice4;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.firstName + this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	public void setSalary(int newSalary) {
		this.salary = newSalary;
	}
	
	public int getAnnualSalary() {
		return this.salary * 12;
	}
	
	public void raiseSalary(int percent) {
		this.salary = this.salary * percent;
	}
	
	public String toString() {
		   return "Employee[Id=" + this.id + " name=" + this.firstName + this.lastName + "salary = " + this.salary +"]";
		}
}
