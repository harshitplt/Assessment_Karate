package part2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import part2.RegisterFormPage;

class UDBility{

    public static Connection getConnection() {
        
        Connection conn = null;

        try {
            Class.forName("Database.StudentDB.sql");

            conn = DriverManager.getConnection("");
        }

        catch (Exception e){
            System.out.print(e.getMessage());
        }
        return conn;
    }

    //Creating the connection to database
    public boolean CheckName(String Name){
        PreparedStatement rpstatement;
        ResultSet rset;
        boolean CheckName = false;
    
        //A querry to select the table
        String query = "SELECT * FROM 'StudentDB' WHERE 'Name' = ?";

        try {
            rpstatement = UDBility.getConnection().prepareStatement(query);
            rpstatement.setString(1, Name);

            rset = rpstatement.executeQuery();

            if (rset.next()) {
                CheckName = true;
            }
        }

        catch (SQLException e) {
            Logger.getLogger(RegisterFormPage.class.getName()).log(Level.SEVERE, null, e);
        }

        return CheckName;    
    }

}