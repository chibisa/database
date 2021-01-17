package lesson3.service;

import lesson3.modul.LapTop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class laptopservice {
    Connection connection;

    public laptopservice(Connection conn) {
        this.connection = conn;
    }
    public List<LapTop> showLaptop(){
        List<LapTop> showlaptops = new ArrayList<>();
        String sql = "select * from laptop";
        try {

            Statement stmt= connection.createStatement();
            ResultSet res= stmt.executeQuery(sql);
            while(res.next()){
                int id = res.getInt("id");
                String name =res.getString("name");
                String url= res.getString("url");
                String maker= res.getString("maker");
                String type= res.getString("type");
                String ram = res.getString("ram");
                String cpu= res.getString("cpu");
                String ssd = res.getString("ssd");
                String hdd = res.getString("hdd");
                float price = res.getFloat("price");
                String card = res.getString("card");
                String screen_resolution = res.getString("screen_resolution");
                float screen_size = res.getFloat("screen_size");
                int sold= res.getInt("sold");
                String create_timestamp = res.getString("create_timestamp");
                String last_update_timestamp = res.getString("last_update_timestamp");
                LapTop laps= new LapTop(id,name,url,maker,type,ram,cpu,ssd,hdd,price,card,screen_resolution,screen_size,sold,create_timestamp,last_update_timestamp);
                showlaptops.add(laps);
            }
        stmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return showlaptops;
    }
    public List<LapTop> findLapTopprice(float a, float b){
        List<LapTop> laptops = new ArrayList<>();
        String sql = "Select * from laptop where price between "+a+" and "+b;
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                int id = res.getInt("id");
                String name =res.getString("name");
                String url= res.getString("url");
                String maker= res.getString("maker");
                String type= res.getString("type");
                String ram = res.getString("ram");
                String cpu= res.getString("cpu");
                String ssd = res.getString("ssd");
                String hdd = res.getString("hdd");
                float price = res.getFloat("price");
                String card = res.getString("card");
                String screen_resolution = res.getString("screen_resolution");
                float screen_size = res.getFloat("screen_size");
                int sold= res.getInt("sold");
                String create_timestamp = res.getString("create_timestamp");
                String last_update_timestamp = res.getString("last_update_timestamp");
                LapTop laps= new LapTop(id,name,url,maker,type,ram,cpu,ssd,hdd,price,card,screen_resolution,screen_size,sold,create_timestamp,last_update_timestamp);
                laptops.add(laps);

            }
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return laptops;
    }
    public List<LapTop> findhardandmaker(String hard){
        List<LapTop> lapTops = new ArrayList<>();
        String sql ="select * from laptop where "+ hard;
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                int id = res.getInt("id");
                String name =res.getString("name");
                String url= res.getString("url");
                String maker= res.getString("maker");
                String type= res.getString("type");
                String ram = res.getString("ram");
                String cpu= res.getString("cpu");
                String ssd = res.getString("ssd");
                String hdd = res.getString("hdd");
                float price = res.getFloat("price");
                String card = res.getString("card");
                String screen_resolution = res.getString("screen_resolution");
                float screen_size = res.getFloat("screen_size");
                int sold= res.getInt("sold");
                String create_timestamp = res.getString("create_timestamp");
                String last_update_timestamp = res.getString("last_update_timestamp");
                LapTop laps= new LapTop(id,name,url,maker,type,ram,cpu,ssd,hdd,price,card,screen_resolution,screen_size,sold,create_timestamp,last_update_timestamp);
                lapTops.add(laps);
            }
stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lapTops;
    }
}
