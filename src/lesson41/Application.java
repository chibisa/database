package lesson41;

import lesson41.modul.Counter;
import lesson41.service.CounterService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Counter> counterList = new ArrayList<>();
        String urlconnect="jdbc:mysql://localhost:3306/store_cms_plusplus";
        String userconnect="root";
        String passconnect="12345";
        try {
            Connection connection = DriverManager.getConnection(urlconnect, userconnect,passconnect);
            CounterService counterService = new CounterService(connection);
            counterList = counterService.getCounterByMaker();
            for (Counter laps:counterList) {
                System.out.print(laps.getMaker()+"\t\t");
                System.out.println(laps.getQuantity());
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
