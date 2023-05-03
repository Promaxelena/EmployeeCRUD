package net.javaguides.Springbootrestfulwebservices.repository;

import net.javaguides.Springbootrestfulwebservices.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
