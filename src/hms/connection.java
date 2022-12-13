package hms;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class connection {
    
        
    Connection con;
    PreparedStatement ps;
    DefaultTableModel d;
    
    
public Connection cn(){
    Connection connection = null;
    
    MysqlDataSource  mds = new MysqlDataSource();
    mds.setServerName("localhost");
    mds.setPortNumber(3307);
    mds.setUser("Beksultan");
    mds.setPassword("qwerty123");
    mds.setDatabaseName("hms");
    
        try {
            connection = mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
      }    
    
    }
    
    

