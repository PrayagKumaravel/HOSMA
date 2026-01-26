import java.util.*;

import db.*;

public class Main {
    public static void main(String[] args){
        Scanner pr=new Scanner(System.in);
        dbconnect.connect();
        pr.close();
    }
}
