package lesson41.service;

import lesson32.modul.Laptop;
import lesson41.modul.Counter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CounterService {
    Connection connection;
    public CounterService(Connection connection){
        this.connection = connection;
    }
    public List<Counter> getCounterByMaker(){
        List<Counter> counters = new ArrayList<>();
        String sql = "select maker, count(maker) as quantity from laptop group by maker";
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
                String maker= res.getString("maker");
                int quantity = res.getInt("quantity");
                Counter laps= new Counter(maker,quantity);
                counters.add(laps);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  counters;
    }
}
