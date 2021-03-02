package lesson5_1;

import lesson5_1.sevice.LaptopInsertService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) {
        String urlcon = "jdbc:mysql://localhost:3306/store_cms_plusplus";
        String usercon = "root";
        String passcon ="12345";
        try {
            Connection connection = DriverManager.getConnection(urlcon,usercon,passcon);
            LaptopInsertService laptopInsertService = new LaptopInsertService(connection);
            int rs=laptopInsertService.InsertLaptop("hoan","url","maker", "type",
                    "ram","cpu","ssd","hdd",5089.5f,"card",
                    "screen_resolution",100f,75,
                    "create_timestamp","last_update_timestamp");
            if (rs == 1) System.out.println("Ban da them vao thanh cong");
            else System.out.println("that bai roi, thu lai nhe");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
