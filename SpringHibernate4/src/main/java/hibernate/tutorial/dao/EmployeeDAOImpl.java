package hibernate.tutorial.dao;

import hibernate.tutorial.domain.Employee;
import hibernate.tutorial.exception.EmployeeDuplicationException;
import hibernate.tutorial.exception.EmployeeNotFoundException;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/12/16.
 */

public class EmployeeDAOImpl implements IEmployeeDAO {


    @Override
    public void createEmployee(Employee employee) throws EmployeeDuplicationException {

    }

    @Override
    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {

    }

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
