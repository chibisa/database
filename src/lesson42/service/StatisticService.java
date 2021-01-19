package lesson42.service;

import lesson42.modul.Statistic;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StatisticService {
    Connection connection;
    public StatisticService(Connection connection) {
        this.connection =connection;
    }
    public List<Statistic> getStatisticByMaker(){
        List<Statistic> statistic = new ArrayList<>();
        String sql = "select maker, sold, sold*price as totalMoney from laptop";
        try {
            Statement stmt = connection.createStatement();
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()){
               String maker= res.getString("maker");
               int sold = res.getInt("sold");
               float totalMoney = res.getFloat("totalMoney");
               Statistic statistic1 = new Statistic(maker,sold,totalMoney);
               statistic.add(statistic1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return statistic;
    }
}
