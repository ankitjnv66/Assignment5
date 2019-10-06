package spring.assignment.Assignment5;

public class EmployeeNotFoundException extends RuntimeException {

	public EmployeeNotFoundException(int id) {
		super(String.format("Employee with id :- %s is not found!!", id));
	}
}
