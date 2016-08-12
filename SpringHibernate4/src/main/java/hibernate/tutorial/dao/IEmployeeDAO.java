package hibernate.tutorial.dao;

import hibernate.tutorial.domain.Employee;
import hibernate.tutorial.exception.EmployeeDuplicationException;
import hibernate.tutorial.exception.EmployeeNotFoundException;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/12/16.
 */
public interface IEmployeeDAO {

    /**
     * A method to create a new employee
     * @param employee
     */
    void createEmployee(Employee employee) throws EmployeeDuplicationException;

    void updateEmployee(Employee employee) throws EmployeeNotFoundException;

    Employee getEmployeeById(Integer id) throws EmployeeNotFoundException;

    List<Employee> findAll();


}
