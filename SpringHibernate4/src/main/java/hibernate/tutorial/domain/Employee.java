package hibernate.tutorial.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by thangnguyen-imac on 8/12/16.
 */

@Entity
@Table(name = "TBL_EMP")
public class Employee implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    private String lastName;

    private String department;

    @Column(name = "SALARY", nullable = false)
    private String salary;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
