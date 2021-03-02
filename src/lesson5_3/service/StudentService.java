package lesson5_3.service;

import lesson5_3.modul.Student;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    Connection connection;
    public StudentService(Connection connection){
        this.connection = connection;
    }
    public int UpdateStudent(String DeptID, int sumStudent){
        List<Integer> listNoOfStudent = new ArrayList();
        int test=0;
        try {
            Statement statement = connection.createStatement();
            String sqlUpdate = "Update departments set NoOfStudents = "+ sumStudent +" where DeptID = "+DeptID;
            test =statement.executeUpdate(sqlUpdate);
            String sqlNoOfStudent="select NoOfStudents from departments";
            ResultSet noOfStudent=statement.executeQuery(sqlNoOfStudent);
            while(noOfStudent.next()){
                if (String.valueOf(noOfStudent.getInt("NoOfStudents"))== null){
                    String sqlUpdateNo="Update departments set NoOfStudents = 0";
                    statement.execute(sqlNoOfStudent);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return test;
    }
    public void AverageScoreStudent(){
        List<Student> idStudent = new ArrayList<>();
        String sqlidStudent = "select sum(Credits) as sumCredits,  StudentID, max(Mark) as maxMark,Credits" +
                " from results as r,courses as c where r.CourseID = c.CourseID group by StudentID";
        try {
            Statement statement = connection.createStatement();
            ResultSet rcidStudent = statement.executeQuery(sqlidStudent);
            while (rcidStudent.next()){
                String idStudents = rcidStudent.getString("StudentID");
                int sumCredits = rcidStudent.getInt("sumCredits");
                int maxMark = rcidStudent.getInt("maxMark");
                int credits = rcidStudent.getInt("Credits");
                Student student = new Student(idStudents,maxMark,credits,sumCredits);
                idStudent.add(student);
            }
            for (Student std:idStudent) {
                float avg = (std.getCredit()*std.getMaxMark())/std.getSumCredit();
               String sql = "Update students set AverageScore = "+avg +"where StudentID = '"+std.getStudentID()+"'";
                statement.executeUpdate(sql);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}

