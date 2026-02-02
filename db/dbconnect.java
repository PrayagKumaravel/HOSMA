package db;

import java.io.FileInputStream;
import java.sql.*;
import java.util.*; // properties

import error.FailedConnectionError;

public class dbconnect {
    public static Connection connect(){
        try{
            Properties pro=new Properties();
            FileInputStream fis=new FileInputStream("application.properties");
            pro.load(fis);
            Connection con=DriverManager.getConnection(pro.getProperty("url"),pro.getProperty("user"),pro.getProperty("password"));
            if(con==null){
                throw new FailedConnectionError(con);
            }
            else{
                System.out.println(con+" connection object made sucessfully");
                return con;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
