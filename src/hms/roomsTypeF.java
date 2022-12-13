
package hms;


public class roomsTypeF extends javax.swing.JFrame {


    public roomsTypeF() {
        initComponents();
        rooms rom = new rooms();
        
        rom.fillRoomsTypeJtable(jTableR);
        
        jTableR.setRowHeight(75);
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableR = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableR.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTableR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type ID", "Label", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTableR);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roomsTypeF().setVisible(true);
            }
        });
    }


    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableR;

}
