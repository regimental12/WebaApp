package com.richard.shiftplanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 20/02/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee(null, "Frodo", "Baggins", "ring bearer"));
        this.repository.save(new Employee(null ,"Bilbo", "Baggins", "Burglar"));
        this.repository.save(new Employee(null ,"Dave", "Dave", "DaveDave"));
        this.repository.save(new Employee(null ,"Frank", "Nstein", "Monster"));
        this.repository.save(new Employee(null ,"Graham", "Hill", "race car driver"));
        this.repository.save(new Employee(null ,"Kermit", "TheFrog", "Muppet"));
        this.repository.save(new Employee(null ,"James", "Hetfield", "Guitar player"));
    }
}