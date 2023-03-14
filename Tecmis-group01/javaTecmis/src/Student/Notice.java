/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

/**
 *
 * @author Hiru
 */
public class Notice extends javax.swing.JFrame {

    /**
     * Creates new form Notice
     */
    public Notice() {
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
        noticeLBL = new javax.swing.JLabel();
        notice_1_outerFramePNL = new javax.swing.JPanel();
        notice_1_innerFramePNL = new javax.swing.JPanel();
        notice1LBL = new javax.swing.JLabel();
        date1LBL = new javax.swing.JLabel();
        topic1LBL = new javax.swing.JLabel();
        notice_2_outerFramePNL = new javax.swing.JPanel();
        notice_2_innerFramePNL = new javax.swing.JPanel();
        notice2LBL = new javax.swing.JLabel();
        date2LBL = new javax.swing.JLabel();
        topic2LBL = new javax.swing.JLabel();
        notice_3_outerFramePNL = new javax.swing.JPanel();
        date3LBL = new javax.swing.JLabel();
        topic3LBL = new javax.swing.JLabel();
        notice_3_innerFramePNL = new javax.swing.JPanel();
        notice3LBL = new javax.swing.JLabel();

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

        noticeLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        noticeLBL.setText("Notice");

        notice_1_outerFramePNL.setBackground(new java.awt.Color(245, 245, 245));

        notice_1_innerFramePNL.setBackground(new java.awt.Color(255, 255, 255));

        notice1LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        notice1LBL.setText("<html> Please be advised that CA 02 for this course will be an online quiz which will be held on 11th Saturday at 8 am. This will be open for two hours. 10 minutes are allocated per attempt. The quiz will close at 10 am. Make sure you do the quiz on time. <br> If you have any questions or concerns, please do not hesitate to contact me on 0766391036 or email on naveend@fot.ruh.ac.lk  </html>");

        javax.swing.GroupLayout notice_1_innerFramePNLLayout = new javax.swing.GroupLayout(notice_1_innerFramePNL);
        notice_1_innerFramePNL.setLayout(notice_1_innerFramePNLLayout);
        notice_1_innerFramePNLLayout.setHorizontalGroup(
            notice_1_innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_1_innerFramePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notice1LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        notice_1_innerFramePNLLayout.setVerticalGroup(
            notice_1_innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_1_innerFramePNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notice1LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        date1LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        date1LBL.setText("February 8, 2023");

        topic1LBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        topic1LBL.setText("TO ALL REPEATERS AND STUDENTS OF ENGLISH SEMESTER 1");

        javax.swing.GroupLayout notice_1_outerFramePNLLayout = new javax.swing.GroupLayout(notice_1_outerFramePNL);
        notice_1_outerFramePNL.setLayout(notice_1_outerFramePNLLayout);
        notice_1_outerFramePNLLayout.setHorizontalGroup(
            notice_1_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_1_outerFramePNLLayout.createSequentialGroup()
                .addGroup(notice_1_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notice_1_outerFramePNLLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(notice_1_innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(notice_1_outerFramePNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(date1LBL)
                        .addGap(152, 152, 152)
                        .addComponent(topic1LBL)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        notice_1_outerFramePNLLayout.setVerticalGroup(
            notice_1_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_1_outerFramePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notice_1_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date1LBL)
                    .addGroup(notice_1_outerFramePNLLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(topic1LBL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notice_1_innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        notice_2_outerFramePNL.setBackground(new java.awt.Color(245, 245, 245));
        notice_2_outerFramePNL.setPreferredSize(new java.awt.Dimension(1190, 155));

        notice_2_innerFramePNL.setBackground(new java.awt.Color(255, 255, 255));

        notice2LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        notice2LBL.setText("<html> Please be advised that CA 02 for this course will be an online quiz which will be held on 11th Saturday at 8 am. This will be open for two hours. 10 minutes are allocated per attempt. <br> The quiz will close at 10 am. Make sure you do the quiz on time. <br> If you have any questions or concerns, please do not hesitate to contact me on 0766391036 or email on  naveend@fot.ruh.ac.lk  </html>");
        notice2LBL.setPreferredSize(new java.awt.Dimension(500, 57));

        javax.swing.GroupLayout notice_2_innerFramePNLLayout = new javax.swing.GroupLayout(notice_2_innerFramePNL);
        notice_2_innerFramePNL.setLayout(notice_2_innerFramePNLLayout);
        notice_2_innerFramePNLLayout.setHorizontalGroup(
            notice_2_innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_2_innerFramePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notice2LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
                .addContainerGap())
        );
        notice_2_innerFramePNLLayout.setVerticalGroup(
            notice_2_innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notice_2_innerFramePNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notice2LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        date2LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        date2LBL.setText("February 8, 2023");

        topic2LBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        topic2LBL.setText("TO ALL REPEATERS AND STUDENTS OF ENGLISH SEMESTER 1");

        javax.swing.GroupLayout notice_2_outerFramePNLLayout = new javax.swing.GroupLayout(notice_2_outerFramePNL);
        notice_2_outerFramePNL.setLayout(notice_2_outerFramePNLLayout);
        notice_2_outerFramePNLLayout.setHorizontalGroup(
            notice_2_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_2_outerFramePNLLayout.createSequentialGroup()
                .addGroup(notice_2_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notice_2_outerFramePNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(date2LBL)
                        .addGap(131, 131, 131)
                        .addComponent(topic2LBL))
                    .addGroup(notice_2_outerFramePNLLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(notice_2_innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        notice_2_outerFramePNLLayout.setVerticalGroup(
            notice_2_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_2_outerFramePNLLayout.createSequentialGroup()
                .addGroup(notice_2_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notice_2_outerFramePNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(date2LBL)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, notice_2_outerFramePNLLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(topic2LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(notice_2_innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        notice_3_outerFramePNL.setBackground(new java.awt.Color(245, 245, 245));
        notice_3_outerFramePNL.setPreferredSize(new java.awt.Dimension(1190, 155));

        date3LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        date3LBL.setText("February 8, 2023");

        topic3LBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        topic3LBL.setText("TO ALL REPEATERS AND STUDENTS OF ENGLISH SEMESTER 1");

        notice_3_innerFramePNL.setBackground(new java.awt.Color(255, 255, 255));
        notice_3_innerFramePNL.setPreferredSize(new java.awt.Dimension(750, 123));

        notice3LBL.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        notice3LBL.setText("<html> Please be advised that CA 02 for this course will be an online quiz which will be held on 11th Saturday at 8 am. This will be open for two hours. 10 minutes are allocated per attempt. <br> The quiz will close at 10 am. Make sure you do the quiz on time. <br> If you have any questions or concerns, please do not hesitate to contact me on 0766391036 or email on  naveend@fot.ruh.ac.lk  </html>");

        javax.swing.GroupLayout notice_3_innerFramePNLLayout = new javax.swing.GroupLayout(notice_3_innerFramePNL);
        notice_3_innerFramePNL.setLayout(notice_3_innerFramePNLLayout);
        notice_3_innerFramePNLLayout.setHorizontalGroup(
            notice_3_innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_3_innerFramePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notice3LBL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        notice_3_innerFramePNLLayout.setVerticalGroup(
            notice_3_innerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_3_innerFramePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notice3LBL, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout notice_3_outerFramePNLLayout = new javax.swing.GroupLayout(notice_3_outerFramePNL);
        notice_3_outerFramePNL.setLayout(notice_3_outerFramePNLLayout);
        notice_3_outerFramePNLLayout.setHorizontalGroup(
            notice_3_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_3_outerFramePNLLayout.createSequentialGroup()
                .addGroup(notice_3_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notice_3_outerFramePNLLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(date3LBL)
                        .addGap(129, 129, 129)
                        .addComponent(topic3LBL))
                    .addGroup(notice_3_outerFramePNLLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(notice_3_innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, 1103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        notice_3_outerFramePNLLayout.setVerticalGroup(
            notice_3_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notice_3_outerFramePNLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notice_3_outerFramePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date3LBL)
                    .addComponent(topic3LBL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notice_3_innerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL)
                        .addGap(517, 517, 517)
                        .addComponent(noticeLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notice_2_outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notice_1_outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notice_3_outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(noticeLBL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notice_1_outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(notice_2_outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(notice_3_outerFramePNL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        Dashboard nDb = new Dashboard();
        nDb.show();
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
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel date1LBL;
    private javax.swing.JLabel date2LBL;
    private javax.swing.JLabel date3LBL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel notice1LBL;
    private javax.swing.JLabel notice2LBL;
    private javax.swing.JLabel notice3LBL;
    private javax.swing.JLabel noticeLBL;
    private javax.swing.JPanel notice_1_innerFramePNL;
    private javax.swing.JPanel notice_1_outerFramePNL;
    private javax.swing.JPanel notice_2_innerFramePNL;
    private javax.swing.JPanel notice_2_outerFramePNL;
    private javax.swing.JPanel notice_3_innerFramePNL;
    private javax.swing.JPanel notice_3_outerFramePNL;
    private javax.swing.JLabel topic1LBL;
    private javax.swing.JLabel topic2LBL;
    private javax.swing.JLabel topic3LBL;
    // End of variables declaration//GEN-END:variables
}
