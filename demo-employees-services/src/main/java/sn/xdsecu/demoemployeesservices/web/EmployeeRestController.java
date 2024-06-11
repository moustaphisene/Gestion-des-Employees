package sn.xdsecu.demoemployeesservices.web;


import org.hibernate.sql.Update;
import org.springframework.web.bind.annotation.*;
import sn.xdsecu.demoemployeesservices.entities.Employee;
import sn.xdsecu.demoemployeesservices.repositories.EmployeeRepository;

import java.util.List;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeRepository employeeRepository;

    public EmployeeRestController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return employeeRepository.findById(id).get();
    }

}
