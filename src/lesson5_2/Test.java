package lesson5_2;

import lesson5_2.modul.NumberOfLaptop;
import lesson5_2.service.NumberOfLaptopService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Connection connection;
        String urlcon = "jdbc:mysql://localhost:3306/store_cms_plusplus";
        String usercon = "root";
        String passcon ="12345";
        List<NumberOfLaptop> numberOfLaptops = new ArrayList<>();
        try {
            connection = DriverManager.getConnection(urlcon,usercon,passcon);
            NumberOfLaptopService numberOfLaptopService = new NumberOfLaptopService(connection);
            numberOfLaptops = numberOfLaptopService.totalSoldLaptop(10,20);
            for (NumberOfLaptop i:numberOfLaptops) {
                System.out.println("Name "+ i.getName());
                System.out.println("So luong them vao: "+i.getQuantityincreased());
                System.out.println("So luong truoc khi them "+i.getSold_first());
                System.out.println("So luong hien tai :"+i.getSold_now());
                System.out.println("Thoi gian update: "+i.getLast_updated_timestamp());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
