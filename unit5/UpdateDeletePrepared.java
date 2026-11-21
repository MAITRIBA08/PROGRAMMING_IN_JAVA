import java.sql.*;
import java.util.*;

class UpdateDeletePrepared {
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

            System.out.println("1. Update Student Marks");
            System.out.println("2. Delete Student Record");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                System.out.print("Enter New Marks: ");
                int marks = sc.nextInt();

                String sql = "UPDATE STUDENT SET MARKS = ? WHERE ROLLNO = ?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, marks);
                ps.setInt(2, roll);

                int result = ps.executeUpdate();

                if (result > 0)
                    System.out.println("Record Updated Successfully");
                else
                    System.out.println("Record Not Found");
            }
            else if (choice == 2) {
                System.out.print("Enter Roll No to delete: ");
                int roll = sc.nextInt();

                String sql = "DELETE FROM STUDENT WHERE ROLLNO = ?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, roll);

                int result = ps.executeUpdate();

                if (result > 0)
                    System.out.println("Record Deleted Successfully");
                else
                    System.out.println("Record Not Found");
            }
            else {
                System.out.println("Invalid Choice");
            }

            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}