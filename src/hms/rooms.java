
package hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class rooms {
    
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       
       connection my_cn = new connection();
    
 public void fillRoomsTypeJtable(JTable table){
        String selectQuery = "Select * from `type`";
           try {
               ps = my_cn.cn().prepareStatement(selectQuery);
               rs = ps.executeQuery();
               
               DefaultTableModel tm = (DefaultTableModel)table.getModel();
               
               Object[] row;
               
               while(rs.next()){
               
                   row = new Object[3];
                   row[0] = rs.getInt(1);
                   row[1] = rs.getString(2);
                   row[2] = rs.getString(3);
                   
                   tm.addRow(row);
               }
               
               
           } catch (SQLException ex) {
               Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
 
 
 public void fillRoomsJtable(JTable table){
        String selectQuery = "Select * from `rooms`";
           try {
               ps = my_cn.cn().prepareStatement(selectQuery);
               rs = ps.executeQuery();
               
               DefaultTableModel tm = (DefaultTableModel)table.getModel();
               
               Object[] row;
               
               while(rs.next()){
               
                   row = new Object[4];
                   row[0] = rs.getInt(1);
                   row[1] = rs.getInt(2);
                   row[2] = rs.getString(3);
                   row[3] = rs.getString(4);
                   
                   tm.addRow(row);
               }
               
               
           } catch (SQLException ex) {
               Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
 
 
 
 public void fillRoomsTypeJCombobox(JComboBox combobox){
        String selectQuery = "Select * from `type`";
           try {
               ps = my_cn.cn().prepareStatement(selectQuery);
               rs = ps.executeQuery();
           
               while(rs.next()){
                 combobox.addItem(rs.getInt(1));
               }
               
               
           } catch (SQLException ex) {
               Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
         
 public boolean addRoom(int number, int type, String phone){ 
            String addQuery = "INSERT INTO `rooms`(`r_number`, `type`, `phone`, `reserved`) VALUES (?, ?, ?, ?)";
            try {
            
                ps = my_cn.cn().prepareStatement(addQuery);
                ps.setInt(1, number);
                ps.setInt(2, type);
                ps.setString(3, phone);
                 ps.setString(4, "No");
                
                
              
                    return (ps.executeUpdate() > 0);
                
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
 
 public boolean editRoom(int number, int type, String phone, String isReserved){
        String editQuery = "UPDATE `rooms` SET `type`=? ,`phone`=?, `reserved`=? WHERE `r_number`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(editQuery);
                ps.setInt(1, type);
                ps.setString(2, phone);
                ps.setString(3, isReserved);
                ps.setInt(4, number);
              
                
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }    
 
 
  public boolean removeRoom(int roomNumber){
            String deleteQuery = "DELETE FROM `rooms` WHERE `r_number`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(deleteQuery);
           
                ps.setInt(1, roomNumber);
                
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
 
 
 
 
 public boolean setRoomToReserved(int number, String isReserved){
        String editQuery = "UPDATE `rooms` SET `reserved`=? WHERE `r_number`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(editQuery);
            
                ps.setString(1, isReserved);
                ps.setInt(2, number);
              
                
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }    
 
 
 
 public String isRoomReserved(int number){
        String editQuery = "SELECT `reserved` FROM `rooms` WHERE `r_number`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(editQuery);
            
              
                ps.setInt(1, number);
              
                rs = ps.executeQuery();
                
               if(rs.next()){
                   return rs.getString(1);
               }else{
                   return "";
               }
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return "";
            }
    }    
 

 
              
}    

