package com.ravenhub;

import com.ravenhub.util.ConnectionManager;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Транзации в JDBC - это группа операций, которые должны быть выполнены как единое целое. Если одна из операций не выполнена,
 * то все операции откатываются. Транзакции используются для обеспечения целостности данных. Например, если мы хотим удалить
 * рейс и все билеты на этот рейс, то мы должны выполнить эти операции в рамках одной транзакции, чтобы не оставить в БД
 */
public class TransactionRunner {

    public static void main(String[] args) throws SQLException {
        long flightId = 8;
        var deleteFlightSql = "DELETE FROM flight WHERE id = " + flightId;
        var deleteTicketsSql = "DELETE FROM ticket WHERE flight_id = " + flightId;
        var createTableSql = "CREATE TABLE test4 (id SERIAL PRIMARY KEY);";
        /*
          Prepared statement не поддерживает batch операции, поэтому используем Statement
         */
        Connection connection = null;
        Statement statement = null;
        try {
            connection = ConnectionManager.get();
            connection.setAutoCommit(false);

            statement = connection.createStatement();
            statement.addBatch(deleteTicketsSql);
            statement.addBatch(deleteFlightSql);
            statement.addBatch(createTableSql);

            var ints = statement.executeBatch();

            connection.commit();
        } catch (Exception e) {
            if (connection != null) {
                connection.rollback();
            }
            throw e;
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }
}