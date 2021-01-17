package lesson32;

import lesson32.modul.Laptop;
import lesson32.service.LaptopService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LaptopTest {
    public static void main(String[] args) {
        Connection connection=null;
        String urlconnect="jdbc:mysql://localhost:3306/store_cms_plusplus";
        String userconnect="root";
        String passconnect="12345";
        List<Laptop> laptopList = new ArrayList<>();
        try {
            connection= DriverManager.getConnection(urlconnect,userconnect,passconnect);
            LaptopService laptopService = new LaptopService(connection);
            laptopList=laptopService.xulycaulenh("7000000","9000000","","","4gb","","","asc","");
            for (Laptop lap:laptopList) {
                System.out.print( "Id: "+ lap.getId());
                System.out.print("Name: "+lap.getName());
                System.out.print("Url: "+lap.getUrl());
                System.out.print("Maker: "+lap.getMaker());
                System.out.print("Type: "+lap.getType());
                System.out.print("Ram: "+lap.getRam());
                System.out.print("Cpu: "+lap.getCpu());
                System.out.print("Sdd: "+lap.getSsd());
                System.out.print("Hdd: "+lap.getHdd());
                System.out.print("Price: "+lap.getPrice());
                System.out.print("Card: "+lap.getCard());
                System.out.print("Screen: "+lap.getScreen_resolution());
                System.out.print("Screen_size: "+lap.getScreen_size());
                System.out.print("Sold: "+lap.getSold());
                System.out.print("Create_timestamp: "+lap.getCreate_timestamp());
                System.out.print("last_update_timestamp: "+lap.getLast_update_timestamp());
                System.out.println();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
