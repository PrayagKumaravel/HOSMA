import java.util.*;
import java.sql.*;
import db.*;
import controllers.EntrylevelController;

public class Main {
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        Connection con=dbconnect.connect();
        EntrylevelController.entry(pr,con);
        pr.close();
    }
}
