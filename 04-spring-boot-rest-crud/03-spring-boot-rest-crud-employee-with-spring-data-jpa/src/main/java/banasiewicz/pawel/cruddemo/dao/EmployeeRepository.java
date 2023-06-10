package banasiewicz.pawel.cruddemo.dao;

import banasiewicz.pawel.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
