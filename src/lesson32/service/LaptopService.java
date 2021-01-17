package lesson32.service;

import lesson3.modul.LapTop;
import lesson32.modul.Laptop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class LaptopService {
    Connection connection;
    public LaptopService(Connection connection){
        this.connection = connection;
    }
    public List<Laptop> xulycaulenh(String fistprice, String lastprice, String maker1, String screen_resolution1, String ram1, String cpu1, String type1, String asc_des, String card1) {
        List<Laptop> laptopList = new ArrayList<>();
        String sql = "Select * from laptop ";
        if ((fistprice == "") && (lastprice == "") && (maker1 == "") && (screen_resolution1 == "") &&
                (ram1 == "") && (cpu1 == "") && (type1 == "") && (asc_des == "") && (card1 == "")) {
            sql = sql + "";
        } else {
            sql = sql +"where ";
            if (maker1 != "") sql = sql + " maker like " + "'" + maker1 + "'"; else sql =sql + " maker in (select maker from laptop)";
            if(screen_resolution1!="") sql=sql+" and screen_resolution like "+"'"+screen_resolution1+"'"; else sql =sql+" and screen_resolution in (select screen_resolution from laptop) ";
            if(ram1!="") sql=sql+" and ram like "+"'"+ram1+"'"; else sql=sql+" and ram in (select ram from laptop)";
            if(cpu1!="") sql=sql+" and cpu like "+"'"+cpu1+"'";else sql=sql+" and cpu in (select cpu from laptop)";
            if (type1!="") sql=sql+" and type like "+"'"+type1+"'";else sql =sql+" and type in (select type from laptop)";
            if (card1!="") sql =sql+" and card like "+"'"+card1+"'"; else sql=sql+" and card in (select card from laptop)";
            if((fistprice!="")&&(lastprice!="")) sql =sql+" group by "+fistprice +" and "+lastprice;
            if(asc_des!="") sql =sql+" order by price "+ asc_des;
        }
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while (res.next()){
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
                Laptop laps= new Laptop(id,name,url,maker,type,ram,cpu,ssd,hdd,price,card,screen_resolution,screen_size,sold,create_timestamp,last_update_timestamp);
                laptopList.add(laps);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
     return laptopList;
    }
}
