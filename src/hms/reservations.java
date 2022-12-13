
package hms;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class reservations {
    
    
    // alter TABLE reservations add CONSTRAINT fk_client_id FOREIGN KEY(client_id) REFERENCES clients(id) on DELETE CASCADE
    // alter TABLE reservations add CONSTRAINT fk_room_num FOREIGN KEY(room_num) REFERENCES rooms(r_number) on DELETE CASCADE
    // alter TABLE rooms add CONSTRAINT fk_type_id FOREIGN KEY(type) REFERENCES type(id) on DELETE CASCADE
    
       Connection con;
       PreparedStatement ps;
       ResultSet rs;
       
       connection my_cn = new connection();
       rooms rom = new rooms();
    
    
    public boolean addReservation(int client_id, int room_number, String dateIn, String dateOut){ 
            String addQuery = "INSERT INTO `reservations`(`client_id`, `room_num`, `dateIn`, `dateOut`) VALUES (?,?,?,?)";
            try {
            
                ps = my_cn.cn().prepareStatement(addQuery);
                ps.setInt(1, client_id);
                ps.setInt(2, room_number);
                ps.setString(3, dateIn);
                ps.setString(4, dateOut);
                
                if(rom.isRoomReserved(room_number).equals("No")){
                   if(ps.executeUpdate() > 0){
                       
                    rom.setRoomToReserved(room_number, "Yes");
                    return true;
                    
                }else{
                    
                    return false;
                } 
              }else{
                     JOptionPane.showMessageDialog(null, "This Room is already reserved", "Room reserved", JOptionPane.WARNING_MESSAGE);
                  return false;  
              }
              
       
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
        }
    
    
    
    public boolean editReservation(int reservId, int client_id, int room_number, String dateIn, String dateOut){
        String editQuery = "UPDATE `reservations` SET `client_id`=?, `room_num`=?, `dateIn`=?, `dateOut`=? WHERE `id`=? ";
        
        try {
            
                ps = my_cn.cn().prepareStatement(editQuery);
               
                ps.setInt(1, client_id);
                ps.setInt(2, room_number);
                ps.setString(3, dateIn);
                ps.setString(4, dateOut);
                ps.setInt(5, reservId);
              
                
                
                return (ps.executeUpdate() > 0);
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }    
    
    
    public boolean removeReservation(int reservation_id){
            PreparedStatement ps;
            String deleteQuery = "DELETE FROM `reservations` WHERE `id`=?";
        
        try {
            
                ps = my_cn.cn().prepareStatement(deleteQuery);
           
                ps.setInt(1, reservation_id);
                
                int room_num = getRoomNumFromReservation(reservation_id);
                
                if(ps.executeUpdate() > 0){
                    rom.setRoomToReserved(room_num, "No");
                    return true;
                }else{
                    
                    return false;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
    }
 
    
    
    public void fillReservsJtable(JTable table){
        String selectQuery = "Select * from `reservations`";
           try {
               ps = my_cn.cn().prepareStatement(selectQuery);
               rs = ps.executeQuery();
               
               DefaultTableModel tm = (DefaultTableModel)table.getModel();
               
               Object[] row;
               
               while(rs.next()){
               
                   row = new Object[5];
                   row[0] = rs.getInt(1);
                   row[1] = rs.getInt(2);
                   row[2] = rs.getInt(3);
                   row[3] = rs.getString(4);
                   row[4] = rs.getString(5);
                   
                   tm.addRow(row);
               }
               
               
           } catch (SQLException ex) {
               Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    
    
    
    public int getRoomNumFromReservation(int reservation_id){
        String selectQuery = "SELECT `room_num` FROM `reservations` WHERE `id`=?";
           try {
               ps = my_cn.cn().prepareStatement(selectQuery);
               
                ps.setInt(1, reservation_id);
               rs = ps.executeQuery();
               
               
         
               if(rs.next()){
                  return rs.getInt(1);
               }else{
                   return 0;
               }

               
           } catch (SQLException ex) {
               Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
               return 0;
           }
    }
    
    
    


}
