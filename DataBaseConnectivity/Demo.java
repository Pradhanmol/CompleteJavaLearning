import java.sql.*;

class Demo{
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniversityStudentDetails", "root", "root");
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from student");
        while(rs.next()){
            System.out.println(rs.getString(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+" ");
        }
        con.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }

}