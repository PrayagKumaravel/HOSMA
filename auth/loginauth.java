package auth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginauth {
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
