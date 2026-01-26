package error;

import java.sql.*;

public class FailedConnectionError extends Exception{
    public FailedConnectionError(Connection con){
        System.out.println(con+" Connection object failed");
    }
}