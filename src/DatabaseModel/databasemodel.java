/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.ShortMessage;

/**
 *
 * @author Acer
 */
public class databasemodel { //Dinh nghi phuong thuc ket noi csdl
    public static Connection connectdb(){
        
        try {
            String connectionUrl = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=;" 
                    + "user=sa;"  
                    + "password=123;" 
                    + "encrypt=true;"
                    + "trustServerCertificate=true;";
            Connection con = DriverManager.getConnection(connectionUrl);
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(databasemodel.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        return null;
    }
}
