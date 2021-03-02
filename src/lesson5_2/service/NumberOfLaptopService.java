package lesson5_2.service;

import lesson5_2.modul.NumberOfLaptop;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class NumberOfLaptopService {
    Connection connection;
    public NumberOfLaptopService(Connection connection) {
        this.connection=connection;
    }
    public List<NumberOfLaptop> totalSoldLaptop(int id, int quantitylaptop){
        List<NumberOfLaptop> totalsold = new ArrayList<>();

        Statement statement = null;
        int numbersold = 0;
        try {
            statement = connection.createStatement();
            String sql1="select sold from laptop where id ="+id;
            ResultSet sold_first = statement.executeQuery(sql1);
            while (sold_first.next()) {
                 numbersold = sold_first.getInt("sold");
            }
             String sql = "update laptop set sold = "+(numbersold+quantitylaptop)+", last_update_timestamp = CURRENT_TIMESTAMP() where id ="+id;
            statement.executeUpdate(sql);
            String sql2="select name, sold,last_update_timestamp from laptop where id ="+id;
            ResultSet rs = statement.executeQuery(sql2);
            while(rs.next()){
                String name = rs.getString("name");
                int  quantityincreased=quantitylaptop;
                int sold_f=numbersold;
                int sold_now= rs.getInt("sold");
                String last_updated_timestamp= rs.getString("last_update_timestamp");
                NumberOfLaptop numberOfLaptop = new NumberOfLaptop(name,quantityincreased,sold_f,sold_now,last_updated_timestamp);
                totalsold.add(numberOfLaptop);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return totalsold ;
    }
}
