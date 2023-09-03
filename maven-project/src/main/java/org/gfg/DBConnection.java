package org.gfg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root" , "rootroot");
        connection.createStatement().execute("create table jbdl57 (name varchar(50), id int);");
        connection.close();
    }
}
