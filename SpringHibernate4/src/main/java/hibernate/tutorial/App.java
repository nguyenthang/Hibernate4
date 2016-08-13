package hibernate.tutorial;

import hibernate.tutorial.config.AppConfig;
import hibernate.tutorial.domain.Employee;
import hibernate.tutorial.exception.EmployeeDuplicationException;
import hibernate.tutorial.service.IEmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

/**
 * Created by thangnguyen-imac on 8/13/16.
 */
public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getEnvironment().addActiveProfile("dev");
        IEmployeeService employeeService = (IEmployeeService) context.getBean("employeeService");

        Employee employee = new Employee();

        employee.setId(1);
        employee.setFirstName("Thang");
        employee.setLastName("Nguyen");
        employee.setSalary("100");
        try {
            employeeService.createEmployee(employee);
        } catch (EmployeeDuplicationException e) {
            e.fillInStackTrace();
        }


        List<Employee> employeeList = employeeService.findAll();

        for (Employee employee1 : employeeList){
            System.out.println(employee1.getFirstName());
        }
        context.close();
    }
}
