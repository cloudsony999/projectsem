package net.guides.springboot2.springboot2jpacrudexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.guides.springboot2.springboot2jpacrudexample.model.Employee;
import net.guides.springboot2.springboot2jpacrudexample.repository.EmployeeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.setFirstName("rahul");
		e.setLastName("Nandy");
		e.setEmailId("rahul@rahul.com");
		employeeRepository.save(e);
		Employee e1 = new Employee();
		e1.setFirstName("pratik");
		e1.setLastName("patil");
		e1.setEmailId("patil@pratik.com");
		employeeRepository.save(e1);
		Employee e2 = new Employee();
		e2.setFirstName("Ishita");
		e2.setLastName("Nag");
		e2.setEmailId("ishita@biswas.com");
		employeeRepository.save(e2);
		System.out.println("-----------------all saved------------------");

	}
}
