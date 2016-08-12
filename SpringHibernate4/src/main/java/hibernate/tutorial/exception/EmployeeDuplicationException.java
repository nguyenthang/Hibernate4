package hibernate.tutorial.exception;

/**
 * Created by thangnguyen-imac on 8/12/16.
 */
public class EmployeeDuplicationException extends Exception {

    public EmployeeDuplicationException(String message){
        super(message);
    }
}
