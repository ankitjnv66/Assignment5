package spring.assignment.Assignment5;

import java.util.List;

public interface EmployeeServics {
	void saveEmployee(Employee emp);
	List<Employee> findAll();
	Employee findById(int id);
	void updateEmpDetail(Employee emp);
	Employee deleteEmpDetail(int id);
}
