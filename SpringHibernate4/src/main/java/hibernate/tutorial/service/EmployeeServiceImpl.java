package hibernate.tutorial.service;

import hibernate.tutorial.dao.IEmployeeDAO;
import hibernate.tutorial.domain.Employee;
import hibernate.tutorial.exception.EmployeeDuplicationException;
import hibernate.tutorial.exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */
@Service(value = "employeeService")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Override
    public void createEmployee(Employee employee) throws EmployeeDuplicationException {
        employeeDAO.createEmployee(employee);
    }

    @Override
    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        employeeDAO.updateEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
        return employeeDAO.getEmployeeById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
