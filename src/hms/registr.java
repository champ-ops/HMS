/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class registr extends javax.swing.JFrame {

  public registr() {
    initComponents();
    Connect();
  }


  Connection con;
  PreparedStatement ps;
  DefaultTableModel d;


  public void Connect() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3307/hms", "Beksultan", "qwerty123");

    } catch (ClassNotFoundException ex) {
      Logger.getLogger(rooms.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
      Logger.getLogger(rooms.class.getName()).log(Level.SEVERE, null, ex);
    }

  }


  @SuppressWarnings("unchecked")
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    txtuname = new javax.swing.JTextField();
    txtpass = new javax.swing.JPasswordField();
    jButton1 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(0, 204, 204));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Username");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
    jLabel4.setForeground(new java.awt.Color(255, 255, 255));
    jLabel4.setText("Password");

    jButton1.setBackground(new java.awt.Color(204, 204, 204));
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
    jButton1.setForeground(new java.awt.Color(153, 153, 153));
    jButton1.setText("Signup");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton4.setBackground(new java.awt.Color(204, 204, 204));
    jButton4.setFont(new java.awt.Font("Tahoma", 1, 14));
    jButton4.setForeground(new java.awt.Color(153, 153, 153));
    jButton4.setText("Close");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jPanel2.setBackground(new java.awt.Color(153, 153, 153));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Registration");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(193, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
  }

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {


    String uname = txtuname.getText();
    String password = txtpass.getText();


    try {
      ps = con.prepareStatement("insert into users (username,password) values(?,?) ");

      ps.setString(1, uname);
      ps.setString(2, password);

      ps.executeUpdate();
      JOptionPane.showMessageDialog(this, "You are registered");

      txtuname.setText("");
      txtpass.setText("");


    } catch (SQLException ex) {
      Logger.getLogger(rooms.class.getName()).log(Level.SEVERE, null, ex);
    }


  }

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {

    this.setVisible(false);


  }

  public static void main(String args[]) {


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new registr().setVisible(true);
      }
    });
  }


  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPasswordField txtpass;
  private javax.swing.JTextField txtuname;

}
