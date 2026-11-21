
import java.sql.*;
import java.util.Scanner;

class InsertData
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "sys as sysdba",
                "1234"
            );

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Roll No: ");
            int r = sc.nextInt();

            System.out.print("Enter Name: ");
            String n = sc.next();

            System.out.print("Enter City: ");
            String c = sc.next();

            System.out.print("Enter Marks: ");
            int m = sc.nextInt();

            Statement st = con.createStatement();

            String sql = "INSERT INTO STUDENT VALUES("
                + r + ",'" + n + "','" + c + "'," + m + ")";

            st.executeUpdate(sql);

            System.out.println("Record Inserted Successfully");

            st.close();
            con.close();
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
