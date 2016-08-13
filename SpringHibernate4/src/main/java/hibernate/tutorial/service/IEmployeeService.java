package hibernate.tutorial.service;

import hibernate.tutorial.domain.Employee;
import hibernate.tutorial.exception.EmployeeDuplicationException;
import hibernate.tutorial.exception.EmployeeNotFoundException;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */
public interface IEmployeeService {

    void createEmployee(Employee employee) throws EmployeeDuplicationException;

    void updateEmployee(Employee employee) throws EmployeeNotFoundException;

    Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;

    List<Employee> findAll();

}
