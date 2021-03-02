package lesson5_1.sevice;

import lesson32.service.LaptopService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopInsertService {
    Connection connection;
    public LaptopInsertService(Connection connection) {
        this.connection=connection;
    }

    public LaptopInsertService() {

    }

    public int InsertLaptop(String name, String url, String type, String maker, String ram,String cpu, String ssd,
                             String hdd, float price, String card, String screen_resolution,
                             float  screen_size, int sold, String create_timestamp, String last_update_timestamp){
        int rs=0;
        String sql ="Insert into laptop (name,url,maker, type, ram,cpu,ssd,hdd,price,card," +
                "screen_resolution,screen_size,sold, create_timestamp,last_update_timestamp)" +
                " Value('" +name + "',"+url+","+maker+","+ type+","+ ram+"," + cpu+","+ssd+","+hdd+
                ","+price+","+card+","+screen_resolution +","+screen_size+","+sold+","+ create_timestamp+
                ","+last_update_timestamp + ")";

        /*try {*/
        Statement statement = null;
        try {
            statement = connection.createStatement();
            //statement.executeQuery(sql);
            rs = statement.executeUpdate(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        /*} catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
       return rs;
    }
}
