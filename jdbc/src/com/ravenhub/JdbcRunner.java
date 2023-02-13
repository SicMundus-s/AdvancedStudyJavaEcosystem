package com.ravenhub;

import com.ravenhub.util.ConnectionManager;
import org.postgresql.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JdbcRunner {
    /**
     * Statement - это интерфейс, который позволяет выполнять запросы к БД.
     * Параметры в запросе вызывают могут вызвать SQL-инъекцию.
     *
     */
    public static void main(String[] args) throws SQLException {

        String sql = """
                SELECT * 
                FROM ticket
                """;

        try (var connection = ConnectionManager.getConnection();
                var sta = connection.createStatement()) {
            var executeResult = sta.executeQuery(sql);

            while(executeResult.next()) {
                System.out.println(executeResult.getLong("id"));
                System.out.println(executeResult.getString("passenger_no"));
                System.out.println(executeResult.getBigDecimal("cost"));
                System.out.println("--------------");
            }
            System.out.println(executeResult);
            System.out.println(connection.getTransactionIsolation());
        }
    }


    /**
     * PreparedStatement - это интерфейс, который позволяет выполнять запросы к БД с параметрами.
     * Параметры в запросе обозначаются знаком вопроса (?).
     */
    private static List<Long> getTicketsByFlightId(Long flightId) throws SQLException {

        String sql = """
                SELECT id
                FROM ticket
                WHERE flight_id =?
                """;

        List<Long> result = new ArrayList<>();
        try(var connection = ConnectionManager.getConnection();
            var prepareStatement = connection.prepareStatement(sql)) {
            prepareStatement.setLong(1, flightId);

            ResultSet resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                resultSet.getLong("id");
            }
        }

        return result;
    }
}
