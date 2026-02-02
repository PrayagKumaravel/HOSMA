package controllers;

import java.util.*;
import java.sql.*;

public class EntrylevelController {
    public static void entry(Scanner pr,Connection con){
        System.out.print("Enter the mode of entry: ");
        String role=pr.next();
        String mailid=pr.next();
        String password=pr.next();
        checkentry(mailid,role,password,con);
    }
    public static boolean checkentry(String mailid,String role,String password,Connection con){
        String query="select * from authentication where mailid=? and role=? and password=?";
        try{
            PreparedStatement st=con.prepareStatement(query);
            st.setString(0, mailid);
            st.setString(1,role);
            st.setString(2, password);
            try{
                ResultSet rs=st.executeQuery();
                if(rs.next()){
                    System.out.println("Entry exist");
                    return true;
                }
                else{
                    System.out.println("Entry doesn't exist");
                    return false;
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}