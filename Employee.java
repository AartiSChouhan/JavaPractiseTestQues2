package ques2;

public class Employee {

	// Declare variables
	private String firstName;
	private String lastName;

	// Default Constructor
	public Employee() {
		firstName = "Aarti";
		lastName = "Chouhan";
	}

	// Parameterized Constructor
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// ToString Method
	@Override
	public String toString() {
		return " Full Name :" + firstName + " " + lastName + "";
	}

}
