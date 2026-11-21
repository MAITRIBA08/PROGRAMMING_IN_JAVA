import java.sql.*;
import java.util.*;

class DisplayPrepared {
    public static void main(String args[]) {
        try {
            Class.forName("oracle.jdbc.OracleDriver");

            Properties p = new Properties();
            p.setProperty("user", "sys");
            p.setProperty("password", "maitri");
            p.setProperty("internal_logon", "sysdba");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe", p);

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Roll No to display: ");
            int roll = sc.nextInt();

            String sql = "SELECT * FROM STUDENT WHERE ROLLNO = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Roll No: " + rs.getInt("ROLLNO"));
                System.out.println("Name: " + rs.getString("NAME"));
                System.out.println("City: " + rs.getString("CITY"));
                System.out.println("Marks: " + rs.getInt("MARKS"));
            }
            else {
                System.out.println("Record Not Found");
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}