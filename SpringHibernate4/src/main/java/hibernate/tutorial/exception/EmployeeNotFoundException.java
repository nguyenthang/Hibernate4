package hibernate.tutorial.exception;

/**
 * Created by thangnguyen-imac on 8/12/16.
 */
public class EmployeeNotFoundException extends Exception {

    public EmployeeNotFoundException(String message){
        super(message);
    }

}
