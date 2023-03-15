/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

/**
 *
 * @author Hiru
 */
public class TimeTable extends javax.swing.JFrame {

    /**
     * Creates new form TimeTable
     */
    public TimeTable() {
        initComponents();
         setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backLBL = new javax.swing.JLabel();
        timetableLBL = new javax.swing.JLabel();
        outerFramePNL = new javax.swing.JPanel();
        innerFramePNL = new javax.swing.JPanel();
        subIdLBL = new javax.swing.JLabel();
        dayLBL = new javax.swing.JLabel();
        timeLBL = new javax.swing.JLabel();
        hrsLBL = new javax.swing.JLabel();
        subidLBL = new javax.swing.JLabel();
        day1LBL = new javax.swing.JLabel();
        time1LBL = new javax.swing.JLabel();
        hrs2LBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 750));

        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        backLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });

        timetableLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        timetableLBL.setText("Time Table");

        outerFramePNL.setBackground(new java.awt.Color(245, 245, 245));

        innerFramePNL.setBackground(new java.awt.Color(255, 255, 255));

        subIdLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        subIdLBL.setText("Subject ID");

        dayLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        dayLBL.setText("Day");

        timeLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        timeLBL.setText("Time");

        hrsLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        hrsLBL.setText("Hours");

        subidLBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        subidLBL.setText("ICT01");

        day1LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        day1LBL.setText("Monday");

        time1LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        time1LBL.setText("08.00 A.M");

        hrs2LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        hrs2LBL.setText("2");

        javax.swing.GroupLayout innerFramePNLLayout = new javax.swing.GroupLayout(innerFramePNL);
        innerFramePNL.setLayout(innerFramePNLLayout);
        innerFramePNLLayout.setHorizontalGroup(
            innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerFramePNLLayout.createSequentialGroup()
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(subIdLBL))
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(subidLBL)))
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(dayLBL)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerFramePNLLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(day1LBL)
                        .addGap(1, 1, 1)))
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(timeLBL))
                    .addGroup(innerFramePNLLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(time1LBL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerFramePNLLayout.createSequentialGroup()
                        .addComponent(hrsLBL)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerFramePNLLayout.createSequentialGroup()
                        .addComponent(hrs2LBL)
                        .addGap(145, 145, 145))))
        );
        innerFramePNLLayout.setVerticalGroup(
            innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerFramePNLLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subIdLBL)
                    .addComponent(dayLBL)
                    .addComponent(timeLBL)
                    .addComponent(hrsLBL))
                .addGap(20, 20, 20)
                .addGroup(innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subidLBL)
                    .addComponent(day1LBL)
                    .addComponent(time1LBL)
                    .addComponent(hrs2LBL))
                .addContainerGap(241, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout outerFramePNLLayout = new javax.swing.GroupLayout(outerFramePNL);
        outerFramePNL.setLayout(outerFramePNLLayout);
        outerFramePNLLayout.setHorizontalGroup(
            outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerFramePNLLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        outerFramePNLLayout.setVerticalGroup(
            outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerFramePNLLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLBL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timetableLBL)
                .addGap(494, 494, 494))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(timetableLBL)))
                .addGap(44, 44, 44)
                .addComponent(outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard ttDb = new Dashboard();
        ttDb.show();
        dispose();
    }//GEN-LAST:event_backLBLMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel day1LBL;
    private javax.swing.JLabel dayLBL;
    private javax.swing.JLabel hrs2LBL;
    private javax.swing.JLabel hrsLBL;
    private javax.swing.JPanel innerFramePNL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel outerFramePNL;
    private javax.swing.JLabel subIdLBL;
    private javax.swing.JLabel subidLBL;
    private javax.swing.JLabel time1LBL;
    private javax.swing.JLabel timeLBL;
    private javax.swing.JLabel timetableLBL;
    // End of variables declaration//GEN-END:variables
}
