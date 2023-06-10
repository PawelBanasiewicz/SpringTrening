package banasiewicz.pawel.cruddemo.dao;

import banasiewicz.pawel.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee employee);

    void deleteById(int theId);

}
