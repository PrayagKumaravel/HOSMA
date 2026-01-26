package error;

public class FailedConnectionError extends Exception{
    public FailedConnectionError(){
        System.out.println("Connection object failed");
    }
}
