package spring.assignment.Assignment5;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Assignment5Application {

	@Autowired
	EmployeeServics empSvcs;
	
	private final Logger log = LoggerFactory.getLogger(Assignment5Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Assignment5Application.class, args);
	}
	
	@Bean
	CommandLineRunner commandLineRunner() {
		return args -> {
			Employee emp1 = new Employee(1, "xyz", "xyz@gmail.com", "BLR");
			Employee emp2 = new Employee(2, "abc", "abc@gmail.com", "BLR");
			Employee emp3 = new Employee(3, "pqr", "pqr@gmail.com", "BLR");
			empSvcs.saveEmployee(emp1);
			empSvcs.saveEmployee(emp2);
			empSvcs.saveEmployee(emp3);
			
			log.info("----------------------------------");
			List<Employee> list = new ArrayList<>();
			list = empSvcs.findAll();
			for(Employee emp : list) {
				log.info(""+emp);
				log.info("----------------------------------");
				
			}
		};
	}

}
