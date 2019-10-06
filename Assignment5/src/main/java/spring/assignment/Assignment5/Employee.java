package spring.assignment.Assignment5;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	int empId;
	String empName;
	String empMail;
	String empLocation;
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public Employee(int empId, String empName, String empMail, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMail = empMail;
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empLocation="
				+ empLocation + "]";
	}

}
