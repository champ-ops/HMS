package hms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class logForm extends javax.swing.JFrame {

  public logForm() {
    initComponents();

    this.setLocationRelativeTo(null);

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
    uname = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    butcanc = new javax.swing.JButton();
    butlog = new javax.swing.JButton();
    txtpass = new javax.swing.JPasswordField();
    butlog1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(0, 204, 204));

    jPanel2.setBackground(new java.awt.Color(153, 153, 153));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("User Login");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(193, 193, 193))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
    );

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Username:");

    uname.setFont(new java.awt.Font("Tahoma", 1, 18));

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Password:");

    butcanc.setBackground(new java.awt.Color(204, 204, 204));
    butcanc.setFont(new java.awt.Font("Tahoma", 1, 14));
    butcanc.setForeground(new java.awt.Color(153, 153, 153));
    butcanc.setText("Cancel");
    butcanc.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        butcancActionPerformed(evt);
      }
    });

    butlog.setBackground(new java.awt.Color(204, 204, 204));
    butlog.setFont(new java.awt.Font("Tahoma", 1, 14));
    butlog.setForeground(new java.awt.Color(153, 153, 153));
    butlog.setText("Login");
    butlog.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        butlogActionPerformed(evt);
      }
    });

    txtpass.setFont(new java.awt.Font("Tahoma", 1, 18));

    butlog1.setBackground(new java.awt.Color(204, 204, 204));
    butlog1.setFont(new java.awt.Font("Tahoma", 1, 14));
    butlog1.setForeground(new java.awt.Color(153, 153, 153));
    butlog1.setText("Signup");
    butlog1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        butlog1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(butlog1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butlog, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(butcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butlog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butcanc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butlog1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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

  private void butlogActionPerformed(java.awt.event.ActionEvent evt) {


    String username = uname.getText();
    String password = String.valueOf(txtpass.getPassword());

    if (username.trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Enter your Username to login", "Empty Username", 2);
    } else if (password.trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Enter your Password to login", "Empty password", 2);
    } else {

      connection cnt = new connection();


      String selectQuery = "Select * from users where username=? and password=?";
      try {
        ps = cnt.cn().prepareStatement(selectQuery);
        ps.setString(1, username);
        ps.setString(2, password);

        rs = ps.executeQuery();

        if (rs.next()) {
          main mainF = new main();
          mainF.setVisible(true);
          mainF.pack();
          mainF.setLocationRelativeTo(null);
          //mainF.setExtendedState(JFrame.MAXIMIZED_BOTH);

          this.dispose();
        } else {
          JOptionPane.showMessageDialog(rootPane, "Wrong username or password", "Login error", 2);
        }

      } catch (SQLException ex) {
        Logger.getLogger(logForm.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

  }

  private void butcancActionPerformed(java.awt.event.ActionEvent evt) {

    this.setVisible(false);
  }

  private void butlog1ActionPerformed(java.awt.event.ActionEvent evt) {

    registr r = new registr();
    r.setVisible(true);

  }

  public static void main(String args[]) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(logForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(logForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(logForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(logForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }


    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new logForm().setVisible(true);
      }
    });
  }


  private javax.swing.JButton butcanc;
  private javax.swing.JButton butlog;
  private javax.swing.JButton butlog1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPasswordField txtpass;
  private javax.swing.JTextField uname;

}
