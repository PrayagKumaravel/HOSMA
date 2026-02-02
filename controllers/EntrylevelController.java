package controllers;

import java.util.*;
import java.sql.*;

import auth.*;

public class EntrylevelController {
    public static void entry(Scanner pr,Connection con){
        System.out.print("Enter the mode of entry: ");
        String role=pr.next();
        String mailid=pr.next();
        String password=pr.next();
        loginauth.checkentry(mailid,role,password,con);
    }
    
}