package hibernate.tutorial.dao;

import hibernate.tutorial.domain.Employee;
import hibernate.tutorial.exception.EmployeeDuplicationException;
import hibernate.tutorial.exception.EmployeeNotFoundException;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/12/16.
 */

@Repository(value = "employeeDAO")
public class EmployeeDAOImpl extends AbstractDAO implements IEmployeeDAO {


    @Override
    public void createEmployee(Employee employee) throws EmployeeDuplicationException {
        persist(employee);
    }

    @Override
    public void updateEmployee(Employee employee) throws EmployeeNotFoundException {
        this.getSession().update(employee);
    }

    @Override
    public Employee getEmployeeById(Integer id) throws EmployeeNotFoundException {
        Criteria criteria = getSession().createCriteria(Employee.class);
        criteria.add(Restrictions.eq("id", id));
        return (Employee) criteria.uniqueResult();
    }

    @Override
    public List<Employee> findAll() {
        Criteria criteria = getSession().createCriteria(Employee.class);
        return criteria.list();
    }
}
