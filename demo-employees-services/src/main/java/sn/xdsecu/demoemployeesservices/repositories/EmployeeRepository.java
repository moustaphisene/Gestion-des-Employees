package sn.xdsecu.demoemployeesservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.xdsecu.demoemployeesservices.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
