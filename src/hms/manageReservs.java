package hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class manageReservs extends javax.swing.JFrame {

    reservations reserv = new reservations();
    
    public manageReservs() {
        initComponents();
         
        reserv.fillReservsJtable(jTable2);
        jTable2.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrsid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlrnums = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        butaddrs = new javax.swing.JButton();
        buteditrs = new javax.swing.JButton();
        butremrs = new javax.swing.JButton();
        butclearrs = new javax.swing.JButton();
        tablerefresh = new javax.swing.JButton();
        datein = new com.toedter.calendar.JDateChooser();
        dateout = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        searchRs = new javax.swing.JTextField();
        searchButRs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Reservations");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(340, 340, 340))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");

        txtrsid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrsidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("   Client ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("   Room №:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date in:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date out:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation ID", "Client ID", "Room Number", "Date in", "Date out"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable2.setGridColor(new java.awt.Color(0, 255, 0));
    jTable2.setSelectionBackground(new java.awt.Color(102, 153, 255));
    jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable2MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable2);

    butaddrs.setBackground(new java.awt.Color(204, 204, 204));
    butaddrs.setFont(new java.awt.Font("Tahoma", 0, 14));
    butaddrs.setForeground(new java.awt.Color(102, 102, 102));
    butaddrs.setText("Add new Reservation");
    butaddrs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    butaddrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    butaddrs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butaddrsActionPerformed(evt);
        }
    });

    buteditrs.setBackground(new java.awt.Color(204, 204, 204));
    buteditrs.setFont(new java.awt.Font("Tahoma", 0, 14));
    buteditrs.setForeground(new java.awt.Color(102, 102, 102));
    buteditrs.setText("Edit");
    buteditrs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    buteditrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    buteditrs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buteditrsActionPerformed(evt);
        }
    });

    butremrs.setBackground(new java.awt.Color(204, 204, 204));
    butremrs.setFont(new java.awt.Font("Tahoma", 0, 14));
    butremrs.setForeground(new java.awt.Color(102, 102, 102));
    butremrs.setText("Remove");
    butremrs.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    butremrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    butremrs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butremrsActionPerformed(evt);
        }
    });

    butclearrs.setBackground(new java.awt.Color(204, 204, 204));
    butclearrs.setFont(new java.awt.Font("Tahoma", 0, 14));
    butclearrs.setForeground(new java.awt.Color(102, 102, 102));
    butclearrs.setText("Clear Fields");
    butclearrs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    butclearrs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butclearrsActionPerformed(evt);
        }
    });

    tablerefresh.setBackground(new java.awt.Color(204, 204, 204));
    tablerefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    tablerefresh.setForeground(new java.awt.Color(102, 102, 102));
    tablerefresh.setText("Refresh");
    tablerefresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tablerefreshActionPerformed(evt);
        }
    });

    datein.setDateFormatString("dd/MM/yyyy");

    dateout.setDateFormatString("dd/MM/yyyy");

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Search:");

    searchRs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchRsActionPerformed(evt);
        }
    });

    searchButRs.setBackground(new java.awt.Color(204, 204, 204));
    searchButRs.setForeground(new java.awt.Color(102, 102, 102));
    searchButRs.setLabel("Go");
    searchButRs.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            searchButRsActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(butclearrs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dateout, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                        .addComponent(datein, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtrsid, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtlrnums, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(butaddrs, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(buteditrs, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(butremrs, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(tablerefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchRs, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchButRs, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(txtrsid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7)
                .addComponent(searchRs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchButRs, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(22, 22, 22)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtlrnums, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(datein, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGap(88, 88, 88)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butaddrs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buteditrs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butremrs, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(43, 43, 43)
                    .addComponent(butclearrs, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(tablerefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }

    private void tablerefreshActionPerformed(java.awt.event.ActionEvent evt) {


        jTable2.setModel(new DefaultTableModel (null, new Object[]{"Reservation ID", "Client ID", "Room Number", "Date in", "Date out"}));

        reserv.fillReservsJtable(jTable2);
    }//GEN-LAST:event_tablerefreshActionPerformed

    private void butclearrsActionPerformed(java.awt.event.ActionEvent evt) {

        txtcid.setText("");
        txtrsid.setText("");
        txtlrnums.setText("");

        datein.setDate(null);
        dateout.setDate(null);
    }

    private void butremrsActionPerformed(java.awt.event.ActionEvent evt) {

        try{
            int reservId = Integer.valueOf(txtrsid.getText());

            if(reserv.removeReservation(reservId)){

                JOptionPane.showMessageDialog(rootPane, "Reservation deleted successfuly", "Remove Reservation", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Reservation not deleted", "Remove Reservation error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter Reservation's Id", "Reservation Id error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buteditrsActionPerformed(java.awt.event.ActionEvent evt) {


        try{

            int reservsId = Integer.valueOf(txtrsid.getText());
            int roomNumber = Integer.valueOf(txtlrnums.getText());
            int clientId = Integer.valueOf(txtcid.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateIn = dateFormat.format(datein.getDate());
            String dateOut = dateFormat.format(dateout.getDate());

            String toDayDate = dateFormat.format(new Date());

            Date din = dateFormat.parse(dateIn);
            Date dout = dateFormat.parse(dateOut);
            Date tdd = dateFormat.parse(toDayDate);

            if(!(din.after(tdd) || din.equals(tdd))){

                JOptionPane.showMessageDialog(rootPane, "The Date In must be after or equal to current date", "Date In error", JOptionPane.ERROR_MESSAGE);

            } else if(!(dout.after(din) || dout.equals(din))){
                JOptionPane.showMessageDialog(rootPane, "The Date Out must be after or equal to Date In", "Date Out error", JOptionPane.ERROR_MESSAGE);
            } else{
                if(reserv.editReservation(reservsId, clientId, roomNumber, dateIn, dateOut)){
                    JOptionPane.showMessageDialog(rootPane, "Reservation information updated successfuly", "Edit reservation", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Reservation information not updated", "Edit reservation error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter room's number, client's Id, Reservation's Id", "Data error", JOptionPane.ERROR_MESSAGE);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Select DateIn & DateOut", "Date error", JOptionPane.ERROR_MESSAGE);
        }
        catch (ParseException ex) {
            Logger.getLogger(manageReservs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void butaddrsActionPerformed(java.awt.event.ActionEvent evt) {


        try{

            int client_id = Integer.valueOf(txtcid.getText());
            int room_number = Integer.valueOf(txtlrnums.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dateIn = dateFormat.format(datein.getDate());
            String dateOut = dateFormat.format(dateout.getDate());
            String toDayDate = dateFormat.format(new Date());

            Date din = dateFormat.parse(dateIn);
            Date dout = dateFormat.parse(dateOut);
            Date tdd = dateFormat.parse(toDayDate);

            if(!(din.after(tdd) || din.equals(tdd))){

                JOptionPane.showMessageDialog(rootPane, "The Date In must be after or equal to current date", "Date In error", JOptionPane.ERROR_MESSAGE);

            } else if(!(dout.after(din) || dout.equals(din))){
                JOptionPane.showMessageDialog(rootPane, "The Date Out must be after or equal to Date In", "Date Out error", JOptionPane.ERROR_MESSAGE);
            } else{
                if(reserv.addReservation(client_id, room_number, dateIn, dateOut)){
                    JOptionPane.showMessageDialog(rootPane, "New reservation added successfuly", "Add reservation", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Reservation not added", "Add reservation error", JOptionPane.ERROR_MESSAGE);
                }
            }

        }  catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter Room's number", "Input fields error", JOptionPane.ERROR_MESSAGE);
        }
        catch (ParseException ex) {
            Logger.getLogger(manageReservs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {


        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();

        int rIndex = jTable2.getSelectedRow();

        txtrsid.setText(model.getValueAt(rIndex, 0).toString());
        txtcid.setText(model.getValueAt(rIndex, 1).toString());
        txtlrnums.setText(model.getValueAt(rIndex, 2).toString());

        try {
            Date dateIn =  new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 3).toString());
            datein.setDate(dateIn);

            Date dateOut =  new SimpleDateFormat("yyyy-MM-dd").parse(model.getValueAt(rIndex, 4).toString());
            dateout.setDate(dateOut);
        } catch (ParseException ex) {
            Logger.getLogger(manageReservs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void txtrsidActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void searchRsActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void searchButRsActionPerformed(java.awt.event.ActionEvent evt) {

        String searchQuery = "Select * from reservations where id=?";
        connection my_cn = new connection();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
    
        try{
            
            ps = my_cn.cn().prepareStatement(searchQuery);
            ps.setString(1, searchRs.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtrsid.setText(rs.getString("id"));
                txtcid.setText(rs.getString("client_id"));
                txtlrnums.setText(rs.getString("room_num"));
                datein.setDate(rs.getDate("dateIn"));
                dateout.setDate(rs.getDate("dateOut"));
                
            }
            else {
                 JOptionPane.showMessageDialog(rootPane, "Reservation not found", "Find reservation error", JOptionPane.ERROR_MESSAGE);
               }   
        } catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter reservation's Id (number)", "Search reservation error", JOptionPane.ERROR_MESSAGE);
            }       
    }//GEN-LAST:event_searchButRsActionPerformed


    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageReservs().setVisible(true);
            }
        });
    }


    private javax.swing.JButton butaddrs;
    private javax.swing.JButton butclearrs;
    private javax.swing.JButton buteditrs;
    private javax.swing.JButton butremrs;
    private com.toedter.calendar.JDateChooser datein;
    private com.toedter.calendar.JDateChooser dateout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton searchButRs;
    private javax.swing.JTextField searchRs;
    private javax.swing.JButton tablerefresh;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtlrnums;
    private javax.swing.JTextField txtrsid;

}
