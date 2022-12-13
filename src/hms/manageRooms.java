
package hms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class manageRooms extends javax.swing.JFrame {


    rooms roms = new rooms();

    public manageRooms() {
        initComponents();
        roms.fillRoomsTypeJCombobox(jComboBox1);
        roms.fillRoomsJtable(jTable1);

        jTable1.setRowHeight(40);


        ButtonGroup bg = new ButtonGroup();
        bg.add(butYes);
        bg.add(butNo);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtrnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtrphone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        butaddr = new javax.swing.JButton();
        buteditr = new javax.swing.JButton();
        butremr = new javax.swing.JButton();
        butclearrm = new javax.swing.JButton();
        tablerefresh = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        butshowtype = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        butYes = new javax.swing.JRadioButton();
        butNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1144, 581));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Rooms");

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
        jLabel2.setText("Number:");

        txtrnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrnumActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Type:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone:");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                             new Object[][]{

                             },
                             new String[]{
                                 "Number", "Type", "Phone", "Reserved"

                             }
                         ) {
                             public boolean isCellEditable(int row, int column) {
                                 return false;
                             }
                         }
        );
        jTable1.setGridColor(new java.awt.Color(0, 255, 0));
        jTable1.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        butaddr.setBackground(new java.awt.Color(204, 204, 204));
        butaddr.setFont(new java.awt.Font("Tahoma", 0, 14));
        butaddr.setForeground(new java.awt.Color(102, 102, 102));
        butaddr.setText("Add new Room");
        butaddr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        butaddr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butaddr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butaddrActionPerformed(evt);
            }
        });

        buteditr.setBackground(new java.awt.Color(204, 204, 204));
        buteditr.setFont(new java.awt.Font("Tahoma", 0, 14));
        buteditr.setForeground(new java.awt.Color(102, 102, 102));
        buteditr.setText("Edit");
        buteditr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buteditr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buteditr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buteditrActionPerformed(evt);
            }
        });

        butremr.setBackground(new java.awt.Color(204, 204, 204));
        butremr.setFont(new java.awt.Font("Tahoma", 0, 14));
        butremr.setForeground(new java.awt.Color(102, 102, 102));
        butremr.setText("Remove");
        butremr.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        butremr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butremr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butremrActionPerformed(evt);
            }
        });

        butclearrm.setBackground(new java.awt.Color(204, 204, 204));
        butclearrm.setFont(new java.awt.Font("Tahoma", 0, 14));
        butclearrm.setForeground(new java.awt.Color(102, 102, 102));
        butclearrm.setText("Clear Fields");
        butclearrm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butclearrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butclearrmActionPerformed(evt);
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

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jComboBox1.setForeground(new java.awt.Color(102, 102, 102));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        butshowtype.setFont(new java.awt.Font("Tahoma", 0, 14));
        butshowtype.setForeground(new java.awt.Color(102, 102, 102));
        butshowtype.setText("Show types");
        butshowtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butshowtypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reserved:");

        butYes.setFont(new java.awt.Font("Tahoma", 0, 14));
        butYes.setForeground(new java.awt.Color(102, 102, 102));
        butYes.setText("Yes");
        butYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butYesActionPerformed(evt);
            }
        });

        butNo.setFont(new java.awt.Font("Tahoma", 0, 14));
        butNo.setForeground(new java.awt.Color(102, 102, 102));
        butNo.setText("No");
        butNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(butYes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(butNo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butYes, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(butNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel6)
                            .addGap(26, 26, 26)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(186, 186, 186))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtrnum, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(butshowtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtrphone, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(butaddr, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(buteditr, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(butremr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(butclearrm, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tablerefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(38, 38, 38)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtrnum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(butshowtype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtrphone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(131, 131, 131)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(butremr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(buteditr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(butaddr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(butclearrm, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tablerefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(7, 7, 7))))
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
                    .addGap(0, 71, Short.MAX_VALUE))
        );

        pack();
    }

    private void txtrnumActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {


        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        int rIndex = jTable1.getSelectedRow();

        txtrnum.setText(model.getValueAt(rIndex, 0).toString());
        jComboBox1.setSelectedItem(model.getValueAt(rIndex, 1));
        txtrphone.setText(model.getValueAt(rIndex, 2).toString());

        String isReserved = model.getValueAt(rIndex, 3).toString();

        if (isReserved.equals("Yes")) {
            butYes.setSelected(true);
        } else if (isReserved.equals("No")) {
            butNo.setSelected(true);
        }


    }

    private void butaddrActionPerformed(java.awt.event.ActionEvent evt) {


        try {

            int roomNumber = Integer.valueOf(txtrnum.getText());
            int roomType = Integer.valueOf(jComboBox1.getSelectedItem().toString());
            String phone = txtrphone.getText();

            if (roms.addRoom(roomNumber, roomType, phone)) {
                JOptionPane.showMessageDialog(rootPane, "New room added successfuly", "Add room", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Room not added", "Add room error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter Room's number", "Room number error", JOptionPane.ERROR_MESSAGE);
        }


    }

    private void buteditrActionPerformed(java.awt.event.ActionEvent evt) {


        int roomNumber = 0;
        int type = Integer.valueOf(jComboBox1.getSelectedItem().toString());
        String phone = txtrphone.getText();
        String isReserved = "No";


        if (butYes.isSelected()) {
            isReserved = "Yes";
        }


        if (phone.trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Enter the room number", "Empty fields", JOptionPane.WARNING_MESSAGE);

        } else {

            try {
                roomNumber = Integer.valueOf(txtrnum.getText());

                if (roms.editRoom(roomNumber, type, phone, isReserved)) {

                    JOptionPane.showMessageDialog(rootPane, "Room data updated successfuly", "Edit room", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Room data not updated", "Edit room error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter room's number", "Room Number error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }

    private void butremrActionPerformed(java.awt.event.ActionEvent evt) {

        try {
            int roomNumber = Integer.valueOf(txtrnum.getText());

            if (roms.removeRoom(roomNumber)) {

                JOptionPane.showMessageDialog(rootPane, "Room deleted successfuly", "Remove room", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Room not deleted", "Remove room error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage() + " - Enter room's number", "Room number error", JOptionPane.ERROR_MESSAGE);
        }


    }

    private void butclearrmActionPerformed(java.awt.event.ActionEvent evt) {

        txtrnum.setText("");
        txtrphone.setText("");
        jComboBox1.setSelectedIndex(0);
        butNo.setSelected(true);


    }

    private void tablerefreshActionPerformed(java.awt.event.ActionEvent evt) {

        jTable1.setModel(new DefaultTableModel(null, new Object[]{"Number", "Type", "Phone", "Reserved"}));

        roms.fillRoomsJtable(jTable1);

    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void butshowtypeActionPerformed(java.awt.event.ActionEvent evt) {


        roomsTypeF rTypesF = new roomsTypeF();
        rTypesF.setVisible(true);
        rTypesF.pack();
        rTypesF.setLocationRelativeTo(null);
        rTypesF.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    private void butYesActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void butNoActionPerformed(java.awt.event.ActionEvent evt) {

    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageRooms().setVisible(true);
            }
        });
    }

    private javax.swing.JRadioButton butNo;
    private javax.swing.JRadioButton butYes;
    private javax.swing.JButton butaddr;
    private javax.swing.JButton butclearrm;
    private javax.swing.JButton buteditr;
    private javax.swing.JButton butremr;
    private javax.swing.JButton butshowtype;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton tablerefresh;
    private javax.swing.JTextField txtrnum;
    private javax.swing.JTextField txtrphone;
}
