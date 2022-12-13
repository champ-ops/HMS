package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;







public class client{
    
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       
       connection my_cn = new connection();
              
        public boolean addClient(String fname, String lname, String phone, String email){ 
            String addQuery = "INSERT INTO `clients`(`firstName`, `lastName`, `phone`, `email`) VALUES(?,?,?,?)";
            try {
            
                ps = my_cn.cn().prepareStatement(addQuery);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, phone);
                ps.setString(4, email);
                
                
              
                    return (ps.executeUpdate() > 0);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
        
        
    public boolean editClient(int id,String fname, String lname, String phone, String email){
        String editQuery = "UPDATE `clients` SET `firstName`=?, `lastName`=?, `phone`=?, `email`=? WHERE `id`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(editQuery);
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, phone);
                ps.setString(4, email);
                ps.setInt(5, id);
                
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }    
    
    
    public boolean removeClient(int id){
            String deleteQuery = "DELETE FROM `clients` WHERE `id`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(deleteQuery);
           
                ps.setInt(1, id);
                
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
    
    
        

    public void fillClientJtable(JTable table){
        String selectQuery = "Select * from `clients`";
           try {
               ps = my_cn.cn().prepareStatement(selectQuery);
               rs = ps.executeQuery();
               
               DefaultTableModel tm = (DefaultTableModel)table.getModel();
               
               Object[] row;
               
               while(rs.next()){
               
                   row = new Object[5];
                   row[0] = rs.getInt(1);
                   row[1] = rs.getString(2);
                   row[2] = rs.getString(3);
                   row[3] = rs.getString(4);
                   row[4] = rs.getString(5);
                   
                   tm.addRow(row);
               }
               
               
           } catch (SQLException ex) {
               Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
         
}
