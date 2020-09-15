package com.vusi.util;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class DBConnection {
	private  String database_connection_string = "jdbc:postgresql://localhost:3306/EmployeeDB";
    private  String database_user_name = "root";
    private  String database_user_password = "";

    /** By using below code we are connecting to the database and returning the connection object.

     * @return 

    */

    public Connection connect() {
        Connection conn = null;
        try {
            conn = (Connection) DriverManager.getConnection(database_connection_string, database_user_name, database_user_password );
            System.out.println("You are successfully connected to the PostgreSQL database server.");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {
    	DBConnection conn = new DBConnection();
       conn.connect();

    }
}
