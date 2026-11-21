import java.sql.*;
import java.util.*;

class DeleteData {
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

            System.out.print("Enter Roll No to delete: ");
            int roll = sc.nextInt();

            Statement st = con.createStatement();

            String sql = "DELETE FROM STUDENT WHERE ROLLNO = " + roll;

            int result = st.executeUpdate(sql);

            if (result > 0)
                System.out.println("Record Deleted Successfully");
            else
                System.out.println("Record Not Found");

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}