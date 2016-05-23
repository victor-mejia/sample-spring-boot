package vams.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vams.model.Employee;
import vams.repository.EmployeeRepository;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee("Victor", "Mejia", "Principal Software Engineer"));
    }
}
