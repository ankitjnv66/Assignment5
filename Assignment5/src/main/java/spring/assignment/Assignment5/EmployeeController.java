package spring.assignment.Assignment5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeServics empSvcs;
	
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Employee> findAll() {
		return empSvcs.findAll();
	}
	
	@RequestMapping("/findEmp/{id}")
	@ResponseBody
	public Employee findEmpl(@PathVariable int id) {
		if(empSvcs.findById(id) !=null)
			return empSvcs.findById(id);
		throw new EmployeeNotFoundException(id);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public void updateEmpDetail(@RequestBody Employee employee) {
		empSvcs.updateEmpDetail(employee);
	}
	
	@RequestMapping("/deleteEmp/{id}")
	@ResponseBody
	public void deleteEmpDetail(@PathVariable int id) {
		if(empSvcs.deleteEmpDetail(id) == null)
			throw new EmployeeNotFoundException(id);
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public void save(@RequestBody Employee emp) {
		empSvcs.saveEmployee(emp);
	}
}
