package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Database.*;

public  class UDBility {

    Connection conn = null;   

    try{
        String url;
        conn = DriverManager.getConnection(url);
    }

    catch (SQLException e){
        throw new Error("Problem", e);
    }
    
}