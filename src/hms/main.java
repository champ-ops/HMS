
package hms;

import javax.swing.JFrame;


public class main extends javax.swing.JFrame {


  public main() {
    initComponents();
  }


  @SuppressWarnings("unchecked")
  private void initComponents() {

    clientsM = new javax.swing.JMenuItem();
    jPanel1 = new javax.swing.JPanel();
    clientM = new javax.swing.JButton();
    roomsM = new javax.swing.JButton();
    reservM = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    clientsM.setText("jMenuItem2");

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(0, 204, 204));

    clientM.setBackground(new java.awt.Color(204, 204, 204));
    clientM.setFont(new java.awt.Font("Tahoma", 1, 18));
    clientM.setForeground(new java.awt.Color(153, 153, 153));
    clientM.setText("Clients");
    clientM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        clientMActionPerformed(evt);
      }
    });

    roomsM.setBackground(new java.awt.Color(204, 204, 204));
    roomsM.setFont(new java.awt.Font("Tahoma", 1, 18));
    roomsM.setForeground(new java.awt.Color(153, 153, 153));
    roomsM.setText("Rooms");
    roomsM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        roomsMActionPerformed(evt);
      }
    });

    reservM.setBackground(new java.awt.Color(204, 204, 204));
    reservM.setFont(new java.awt.Font("Tahoma", 1, 18));
    reservM.setForeground(new java.awt.Color(153, 153, 153));
    reservM.setText("Reservations");
    reservM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        reservMActionPerformed(evt);
      }
    });

    jButton1.setBackground(new java.awt.Color(204, 204, 204));
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
    jButton1.setForeground(new java.awt.Color(153, 153, 153));
    jButton1.setText("Exit");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jPanel2.setBackground(new java.awt.Color(153, 153, 153));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36));
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Menu");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reservM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roomsM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clientM, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(clientM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(roomsM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(reservM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }

  private void clientMActionPerformed(java.awt.event.ActionEvent evt) {
    manageClient clientF = new manageClient();
    clientF.setVisible(true);
    clientF.pack();
    clientF.setLocationRelativeTo(null);
    clientF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  private void roomsMActionPerformed(java.awt.event.ActionEvent evt) {
    manageRooms roomF = new manageRooms();
    roomF.setVisible(true);
    roomF.pack();
    roomF.setLocationRelativeTo(null);
    roomF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  private void reservMActionPerformed(java.awt.event.ActionEvent evt) {

    manageReservs reservF = new manageReservs();
    reservF.setVisible(true);
    reservF.pack();
    reservF.setLocationRelativeTo(null);
    reservF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
  }

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {


    this.setVisible(false);
  }

  public static void main(String args[]) {

    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new main().setVisible(true);
      }
    });
  }


  private javax.swing.JButton clientM;
  private javax.swing.JMenuItem clientsM;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JButton reservM;
  private javax.swing.JButton roomsM;

}
