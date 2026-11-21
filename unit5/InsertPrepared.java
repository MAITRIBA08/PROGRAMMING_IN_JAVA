import java.sql.*;
import java.util.*;

class InsertPrepared {
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

            System.out.print("Enter Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            String sql = "INSERT INTO STUDENT VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, roll);
            ps.setString(2, name);
            ps.setString(3, city);
            ps.setInt(4, marks);

            int result = ps.executeUpdate();

            System.out.println(result + " Record Inserted Successfully");

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}