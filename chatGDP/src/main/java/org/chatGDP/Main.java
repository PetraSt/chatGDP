package org.chatGDP;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Hello world!");
//        try (var connection =  DB.connect()){
//            System.out.println("Connected to the PostgreSQL database.");
//        } catch (SQLException e) {
//            System.err.println(e.getMessage());
//        }
        String url = "jdbc:postgresql://localhost:5432/chatGDP";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "root");
        Connection conn = DriverManager.getConnection(url, props);

        String query = "CREATE TABLE IF NOT EXISTS users (\n"
                + "	id SERIAL PRIMARY KEY,\n"
                + "	name VARCHAR(100) NOT NULL,\n"
                + "	last_name VARCHAR(100) NOT NULL,\n"
                + "	create_date DATE NOT NULL,\n"
                + "	is_active BOOLEAN NOT NULL\n"
                + ");";

        conn.createStatement().execute(query);
//        String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
//        Connection conn = DriverManager.getConnection(url);

    }
}