import java.sql.*;

class QExam2019{
    public static void main(String[]args){
        String url="jdbc:mysql://localhost:3306/jbase";
        String uname="root";
        String pwd="Khatri@123";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c= DriverManager.getConnection(url,uname,pwd);
            Statement s= c.createStatement();
            String query="SELECT *FROM employee where salary>25000 ";
            ResultSet rs= s.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString(2)+" "+rs.getInt(1)+" "+rs.getString(3)+" "+rs.getString(4));
            }
            s.close();
            c.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}