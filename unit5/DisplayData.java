import java.sql.*;
import java.util.*;

class DisplayData {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Properties p = new Properties();
            p.setProperty("user", "sys");
            p.setProperty("password", "maitri");
            p.setProperty("internal_logon", "sysdba");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", p);

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM STUDENT");

            System.out.println("RollNo\tName\tCity\tMarks");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("ROLLNO") + "\t" +
                    rs.getString("NAME") + "\t" +
                    rs.getString("CITY") + "\t" +
                    rs.getInt("MARKS"));
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}