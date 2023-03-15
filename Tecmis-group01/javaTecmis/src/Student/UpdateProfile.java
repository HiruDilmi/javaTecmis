
package Student;

import java.sql.Connection;
import DBConn.DBconn;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Hiru
 */
public class UpdateProfile extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;

    public UpdateProfile() {
        initComponents();
        
        conn = DBconn.connect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        backLBL = new javax.swing.JLabel();
        bgImgLBL = new javax.swing.JLabel();
        updateProLBL = new javax.swing.JLabel();
        idNoLBL = new javax.swing.JLabel();
        idNoTXT = new javax.swing.JTextField();
        emailLBL = new javax.swing.JLabel();
        emailTXT = new javax.swing.JTextField();
        newMailLBL = new javax.swing.JLabel();
        newMailTXT = new javax.swing.JTextField();
        newPhoneLBL = new javax.swing.JLabel();
        newPhoneTXT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        chooseImgBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        updateProBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel.setBackground(new java.awt.Color(255, 255, 255));
        jPanel.setPreferredSize(new java.awt.Dimension(1350, 750));

        backLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Go Back.png"))); // NOI18N
        backLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
<<<<<<< Updated upstream
=======
        backLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLBLMouseClicked(evt);
            }
        });
>>>>>>> Stashed changes

        bgImgLBL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update-profile.png"))); // NOI18N

        updateProLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 48)); // NOI18N
        updateProLBL.setText("Update Profile");

        idNoLBL.setBackground(new java.awt.Color(153, 153, 153));
        idNoLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        idNoLBL.setForeground(new java.awt.Color(153, 153, 153));
        idNoLBL.setText("ID Number");

        idNoTXT.setFont(new java.awt.Font("Iskoola Pota", 1, 14)); // NOI18N
        idNoTXT.setPreferredSize(new java.awt.Dimension(64, 30));
        idNoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idNoTXTActionPerformed(evt);
            }
        });

        emailLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        emailLBL.setForeground(new java.awt.Color(153, 153, 153));
        emailLBL.setText("Email");

        emailTXT.setPreferredSize(new java.awt.Dimension(64, 30));

        newMailLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        newMailLBL.setForeground(new java.awt.Color(153, 153, 153));
        newMailLBL.setText("New Email");

        newMailTXT.setPreferredSize(new java.awt.Dimension(64, 30));

        newPhoneLBL.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        newPhoneLBL.setForeground(new java.awt.Color(153, 153, 153));
        newPhoneLBL.setText("New Phone Number");

        newPhoneTXT.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Profile Picture");

        chooseImgBTN.setBackground(new java.awt.Color(245, 245, 245));
        chooseImgBTN.setFont(new java.awt.Font("Iskoola Pota", 1, 16)); // NOI18N
        chooseImgBTN.setText("Choose Image");
        chooseImgBTN.setPreferredSize(new java.awt.Dimension(131, 30));
        chooseImgBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseImgBTNActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(245, 245, 245));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Account.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 100));

        updateProBTN.setBackground(new java.awt.Color(76, 159, 255));
        updateProBTN.setFont(new java.awt.Font("Iskoola Pota", 1, 20)); // NOI18N
        updateProBTN.setForeground(new java.awt.Color(255, 255, 255));
        updateProBTN.setText("Update Profile");
        updateProBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addContainerGap(166, Short.MAX_VALUE)
                        .addComponent(bgImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)))
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idNoLBL)
                    .addComponent(updateProLBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idNoTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLBL)
                    .addComponent(emailTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newMailLBL)
                    .addComponent(newMailTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newPhoneLBL)
                    .addComponent(newPhoneTXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(chooseImgBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addComponent(updateProBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLBL)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addComponent(newPhoneTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel1))
                                    .addComponent(bgImgLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(updateProLBL)
                                .addGap(35, 35, 35)
                                .addComponent(idNoLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idNoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(emailLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newMailLBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newMailTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newPhoneLBL)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chooseImgBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(updateProBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseImgBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseImgBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseImgBTNActionPerformed

    private void idNoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idNoTXTActionPerformed
        String id;
         id = idNoTXT.getText();
    }//GEN-LAST:event_idNoTXTActionPerformed

    private void updateProBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProBTNActionPerformed
       String id;
        String mail;
        String newMail;
       int newPhone;
      // String newPhone;
   
        
       id = idNoTXT.getText();
        mail = emailTXT.getText();
        newMail = newMailTXT.getText();
       newPhone = Integer.parseInt(newPhoneTXT.getText());
       //newPhone = newPhoneTXT.getText();
        
        try {
           String sql = "UPDATE student SET email = '"+newMail+"', phone_no = '"+newPhone+"' WHERE s_id = '"+id+"'";
           // String sql ="INSERT INTO department (dep_id, dep_name) values ('"+newMail+"', '"+newPhone+"')";
            pst = conn.prepareStatement(sql);
            pst.execute();
      
            JOptionPane.showMessageDialog(null, "User Profile Updated Succesfully...!");
           // redirect to UserProfile
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);    
       }
         idNoTXT.setText("");
         emailTXT.setText("");
         newMailTXT.setText("");
         newPhoneTXT.setText("");          
    }//GEN-LAST:event_updateProBTNActionPerformed

    private void backLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLBLMouseClicked
        UserProfile update = new UserProfile();
        update.show();
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
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLBL;
    private javax.swing.JLabel bgImgLBL;
    private javax.swing.JButton chooseImgBTN;
    private javax.swing.JLabel emailLBL;
    private javax.swing.JTextField emailTXT;
    private javax.swing.JLabel idNoLBL;
    private javax.swing.JTextField idNoTXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel;
    private javax.swing.JLabel newMailLBL;
    private javax.swing.JTextField newMailTXT;
    private javax.swing.JLabel newPhoneLBL;
    private javax.swing.JTextField newPhoneTXT;
    private javax.swing.JButton updateProBTN;
    private javax.swing.JLabel updateProLBL;
    // End of variables declaration//GEN-END:variables
}
