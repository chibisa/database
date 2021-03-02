package lesson5_3;

import lesson5_3.service.StudentService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/manage_student";
        String user="root";
        String pass="12345";
        Connection connection = null;
        int flag;
        try {
            connection = DriverManager.getConnection(url,user,pass);
            StudentService studentService = new StudentService(connection);
            flag=studentService.UpdateStudent("'CE'",50);
            if(flag==1) System.out.println("Ban da cap nhat thanh cong");
            else System.out.println("Thoi thi co gang thu lai nhe");
            studentService.AverageScoreStudent();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
