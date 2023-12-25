import java.sql.*;
import java.util.Scanner;
class DatabaseDemo{
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniversityStudentDetails", "root", "root");
        PreparedStatement stm = con.prepareStatement("insert into Student values (?,?, ?, ?)");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the student details below:");
        System.out.println("Enter student id ?");
        int id = sc.nextInt();
        System.out.println("Enter Student Name ?");
        String name = sc.next();
        System.out.println("Enter Student city name ?");
        String city = sc.next();
        System.out.println("Enter student department ?");
        int deptId = sc.nextInt();

        stm.setInt(1, id);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, deptId);

        stm.executeUpdate();
        stm.close();
        
        con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }

}