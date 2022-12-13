
package hms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

        


public class manageClient extends javax.swing.JFrame {


    client client = new client();
    public manageClient() {
        initComponents();
        Border border = BorderFactory.createMatteBorder(1,1,1,1, Color.white);
        butclearc.setBorder(border);
        client.fillClientJtable(jTable);

    }
    
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    
    

    
   


    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        butaddc = new javax.swing.JButton();
        buteditc = new javax.swing.JButton();
        butremc = new javax.swing.JButton();
        butclearc = new javax.swing.JButton();
        tablerefresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        searchCL = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Clients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(378, 378, 378))
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

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone:");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone", "Email"
            }
        )
        {public boolean isCellEditable(int row, int column){return false;}}
    );
    jTable.setGridColor(new java.awt.Color(0, 255, 0));
    jTable.setSelectionBackground(new java.awt.Color(102, 153, 255));
    jTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable);

    butaddc.setBackground(new java.awt.Color(204, 204, 204));
    butaddc.setFont(new java.awt.Font("Tahoma", 0, 14));
    butaddc.setForeground(new java.awt.Color(102, 102, 102));
    butaddc.setText("Add new Client");
    butaddc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    butaddc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    butaddc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butaddcActionPerformed(evt);
        }
    });

    buteditc.setBackground(new java.awt.Color(204, 204, 204));
    buteditc.setFont(new java.awt.Font("Tahoma", 0, 14));
    buteditc.setForeground(new java.awt.Color(102, 102, 102));
    buteditc.setText("Edit");
    buteditc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    buteditc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    buteditc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buteditcActionPerformed(evt);
        }
    });

    butremc.setBackground(new java.awt.Color(204, 204, 204));
    butremc.setFont(new java.awt.Font("Tahoma", 0, 14));
    butremc.setForeground(new java.awt.Color(102, 102, 102));
    butremc.setText("Remove");
    butremc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
    butremc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    butremc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butremcActionPerformed(evt);
        }
    });

    butclearc.setBackground(new java.awt.Color(204, 204, 204));
    butclearc.setFont(new java.awt.Font("Tahoma", 0, 14));
    butclearc.setForeground(new java.awt.Color(102, 102, 102));
    butclearc.setText("Clear Fields");
    butclearc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    butclearc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            butclearcActionPerformed(evt);
        }
    });

    tablerefresh.setBackground(new java.awt.Color(204, 204, 204));
    tablerefresh.setFont(new java.awt.Font("Tahoma", 0, 14));
    tablerefresh.setForeground(new java.awt.Color(102, 102, 102));
    tablerefresh.setText("Refresh");
    tablerefresh.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            tablerefreshActionPerformed(evt);
        }
    });

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
    jLabel7.setForeground(new java.awt.Color(255, 255, 255));
    jLabel7.setText("Search:");

    jButton1.setBackground(new java.awt.Color(204, 204, 204));
    jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
    jButton1.setForeground(new java.awt.Color(102, 102, 102));
    jButton1.setText("Go");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(butaddc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buteditc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(butremc, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(butclearc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tablerefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addGap(18, 18, 18)
                    .addComponent(searchCL, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(19, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(searchCL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(53, 53, 53)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(butaddc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buteditc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butremc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addComponent(butclearc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void butaddcActionPerformed(java.awt.event.ActionEvent evt) {

        
        
        String fname = txtname.getText();
        String lname = txtlname.getText();
        String phone = txtphone.getText();
        String email = txtemail.getText();
        
        if( fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in these fields:(FName,LName,Phone,Email)", "Empty fields", JOptionPane.WARNING_MESSAGE);
        
         } else{
           
            if(client.addClient(fname, lname, phone, email)){
             
                JOptionPane.showMessageDialog(rootPane, "New client added successfuly", "Add client", JOptionPane.INFORMATION_MESSAGE);
        
         } else {
            
                JOptionPane.showMessageDialog(rootPane, "Client not added", "Add client error", JOptionPane.ERROR_MESSAGE);
         }
            
       } 
        
        
    }

    private void buteditcActionPerformed(java.awt.event.ActionEvent evt) {

        int id = 0;
        String fname = txtname.getText();
        String lname = txtlname.getText();
        String phone = txtphone.getText();
        String email = txtemail.getText();
        
        
        if( fname.trim().equals("") || lname.trim().equals("") || phone.trim().equals("") || email.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please fill in these fields:(FName,LName,Phone,Email)", "Empty fields", JOptionPane.WARNING_MESSAGE);
        
         } else{
            
            try{
               id = Integer.valueOf(txtid.getText());
               
               if(client.editClient(id, fname, lname, phone, email)){
             
                JOptionPane.showMessageDialog(rootPane, "Client data updated successfuly", "Edit client", JOptionPane.INFORMATION_MESSAGE);
        
               } else {
                 JOptionPane.showMessageDialog(rootPane, "Client data not updated", "Edit client error", JOptionPane.ERROR_MESSAGE);
               }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter client's Id (number)", "Client Id error", JOptionPane.ERROR_MESSAGE);
            }      
       } 
        
        
    }

    private void butremcActionPerformed(java.awt.event.ActionEvent evt) {

        
         try{
               int id = Integer.valueOf(txtid.getText());
               
               if(client.removeClient(id)){
             
                JOptionPane.showMessageDialog(rootPane, "Client deleted successfuly", "Remove client", JOptionPane.INFORMATION_MESSAGE);
        
               } else {
                 JOptionPane.showMessageDialog(rootPane, "Client not deleted", "Remove client error", JOptionPane.ERROR_MESSAGE);
               }
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter client's Id (number)", "Client Id error", JOptionPane.ERROR_MESSAGE);
            }   
        
    }

    private void butclearcActionPerformed(java.awt.event.ActionEvent evt) {

        txtid.setText("");
        txtname.setText("");
        txtlname.setText("");
        txtphone.setText("");
        txtemail.setText("");
    }

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {

        DefaultTableModel model = (DefaultTableModel)jTable.getModel();
        
        int rIndex = jTable.getSelectedRow();
        
        txtid.setText(model.getValueAt(rIndex, 0).toString());
        txtname.setText(model.getValueAt(rIndex, 1).toString());
        txtlname.setText(model.getValueAt(rIndex, 2).toString());
        txtphone.setText(model.getValueAt(rIndex, 3).toString());
        txtemail.setText(model.getValueAt(rIndex, 4).toString());
    }

    private void tablerefreshActionPerformed(java.awt.event.ActionEvent evt) {

        jTable.setModel(new DefaultTableModel (null, new Object[]{"ID", "First Name", "Last Name", "Phone", "Email"}));
        client.fillClientJtable(jTable);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String searchQuery = "Select * from clients where id=?";
        connection my_cn = new connection();
        try{
            
            ps = my_cn.cn().prepareStatement(searchQuery);
            ps.setString(1, searchCL.getText());
            rs = ps.executeQuery();
            
            if(rs.next()){
                txtid.setText(rs.getString("id"));
                txtname.setText(rs.getString("firstName"));
                txtlname.setText(rs.getString("lastName"));
                txtphone.setText(rs.getString("phone"));
                txtemail.setText(rs.getString("email"));
                
            }
            else {
                 JOptionPane.showMessageDialog(rootPane, "Client not found", "Find client error", JOptionPane.ERROR_MESSAGE);
               }   
        } catch(Exception ex){
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter client's Id (number)", "Search Client error", JOptionPane.ERROR_MESSAGE);
            }       
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageClient().setVisible(true);
            }
        });
    }


    private javax.swing.JButton butaddc;
    private javax.swing.JButton butclearc;
    private javax.swing.JButton buteditc;
    private javax.swing.JButton butremc;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTable jTable;
    private javax.swing.JTextField searchCL;
    private javax.swing.JButton tablerefresh;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;

}
