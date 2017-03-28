package com.richard.shiftplanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Richard on 20/02/2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepo;

    private final ShiftRepository shiftRepo;

    @Autowired
    public DatabaseLoader(EmployeeRepository eRepo , ShiftRepository sRepo)
    {
        this.employeeRepo = eRepo;
        this.shiftRepo = sRepo;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.employeeRepo.save(new Employee( "Frodo", "Baggins", "ring bearer" , "wibble"));
        this.employeeRepo.save(new Employee("Bilbo", "Baggins", "Burglar" , "wibble"));
        this.employeeRepo.save(new Employee("Dave", "Dave", "DaveDave" , "wibble"));
        this.employeeRepo.save(new Employee("Frank", "Nstein", "Monster" , "wibble"));
        this.employeeRepo.save(new Employee("Graham", "Hill", "race car driver" , "wibble"));
        this.employeeRepo.save(new Employee("Kermit", "TheFrog", "Muppet" , "wibble"));
        this.employeeRepo.save(new Employee("James", "Hetfield", "Guitar player" , "wibble"));

        this.shiftRepo.save(new Shift( "Monday" , "Early"));
        this.shiftRepo.save(new Shift("Monday" , "late"));
        this.shiftRepo.save(new Shift( "Tuesday" , "Early"));
        this.shiftRepo.save(new Shift( "Tuesday" , "late"));
        this.shiftRepo.save(new Shift( "Wednesday" , "Early"));
        this.shiftRepo.save(new Shift( "Wednesday" , "late"));
        this.shiftRepo.save(new Shift( "Thursday" , "Early"));
        this.shiftRepo.save(new Shift("Thursday" , "late"));
        this.shiftRepo.save(new Shift("Friday" , "Early"));
        this.shiftRepo.save(new Shift("Friday" , "late"));
    }
}