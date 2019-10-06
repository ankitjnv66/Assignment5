package spring.assignment.Assignment5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplementation implements EmployeeServics {

	Map<Integer, Employee> empMap = new HashMap<>();

	public List<Employee> findAll() {
		List empList = new ArrayList();
		Set<Integer> set = empMap.keySet();
		for (Integer i : set) {
			empList.add(empMap.get(i));
		}
		return empList;
	}

	public Employee findById(int id) {
		Employee employee = null;
		if(isExist(id))
			employee = empMap.get(id);
		return employee;
	}
	
	public void saveEmployee(Employee emp) {
		int id = emp.getEmpId();
		empMap.put(id, emp);
	}

	public void updateEmpDetail(Employee employee) {
		int empId = employee.getEmpId();
		empMap.put(empId, employee);

	}

	public Employee deleteEmpDetail(int id) {
		Employee employee = null;
		if(isExist(id))
			employee = empMap.remove(id);
		
		return employee;
	}

	boolean isExist(int id) {
		return empMap.containsKey(id) ? true : false;
	}
}
