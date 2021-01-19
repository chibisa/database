package lesson42;

import lesson42.modul.Statistic;
import lesson42.service.StatisticService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Statistic> statisticList = new ArrayList<>();
        Connection connection=null;
        String urlconnect="jdbc:mysql://localhost:3306/store_cms_plusplus";
        String userconnect="root";
        String passconnect="12345";
        try {
            connection = DriverManager.getConnection(urlconnect,userconnect,passconnect);
            StatisticService statisticService = new StatisticService(connection);
            statisticList=statisticService.getStatisticByMaker();
            for (Statistic laps:statisticList) {
                System.out.print(laps.getMaker()+"\t");
                System.out.print(laps.getSold()+"\t");
                System.out.println(laps.getTotalMoney());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
