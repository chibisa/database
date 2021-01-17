package lesson3;


import lesson3.service.laptopservice;
import lesson3.modul.LapTop;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lesson31 {
  /*  public static Connection connectionTest(){
        Connection conn=null;
        String url = "jdbc:mysql://localhost:3306/store_cms_plusplus";
        String user="root";
        String password="12345";
        try {
            conn = DriverManager.getConnection(url,user,password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }*/

    public static void main(String[] args) {
        List<LapTop> lapTops= new ArrayList<>();
        float a ,b;
        //connectionTest();
        Connection conn=null;
        String urlconnect = "jdbc:mysql://localhost:3306/store_cms_plusplus";
        String user="root";
        String password="12345";
        try {
            conn = DriverManager.getConnection(urlconnect,user,password);
            laptopservice Laptopservice = new laptopservice(conn);
            lapTops=Laptopservice.showLaptop();
            for (LapTop lap:lapTops) {
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
            System.out.println("ban hay nhap vao khoang gia tri muon tim laptop : ");
            Scanner scanner = new Scanner(System.in);
            a=scanner.nextFloat();
            b=scanner.nextFloat();
            lapTops = Laptopservice.findLapTopprice(a,b);
            System.out.println("Laptop can tim trong khoang gia tu "+a+" toi "+b);
            for (LapTop lap:lapTops) {
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
            lapTops = Laptopservice.findhardandmaker("ssd is not null");
            System.out.println("hien thi nhung laptop co ssd");
            for (LapTop lap:lapTops) {
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
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }



    }
}