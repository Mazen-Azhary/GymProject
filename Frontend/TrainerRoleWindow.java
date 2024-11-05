/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;
import Backend.*;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Mazen
 */
public class TrainerRoleWindow extends javax.swing.JFrame {
static TrainerLoginPage trainerLoginPage;
static TrainerRole trainerRole;
static MainWindow mainWindow;
static ViewClasses viewClassesTable;
static ViewMembers viewMembersTable;
static ViewRegistrations viewRegistrationsTable;
static ViewTrainers viewTrainersTable;
    /**
     * Creates new form TrainerRole
     */
    public TrainerRoleWindow(TrainerLoginPage trainerLoginPage,MainWindow mainWindow) {
        this.trainerLoginPage = trainerLoginPage;
        this.trainerRole=new TrainerRole();
        this.mainWindow = mainWindow;
        initComponents();   
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
         jPanel1.setLayout(new BoxLayout(jPanel1, BoxLayout.Y_AXIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AddClassButton = new javax.swing.JButton();
        viewClassButton = new javax.swing.JButton();
        RegisterMemberForClassButton = new javax.swing.JButton();
        ViewMembersButton = new javax.swing.JButton();
        viewRegistrationButton = new javax.swing.JButton();
        CancelRegistrationButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        AddMembersButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("     Trainer Role Page");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddClassButton.setText("Add Class");
        AddClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddClassButtonActionPerformed(evt);
            }
        });

        viewClassButton.setText("View Classes");
        viewClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewClassButtonActionPerformed(evt);
            }
        });

        RegisterMemberForClassButton.setText("Register Member for class");
        RegisterMemberForClassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterMemberForClassButtonActionPerformed(evt);
            }
        });

        ViewMembersButton.setText("View Members");
        ViewMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewMembersButtonActionPerformed(evt);
            }
        });

        viewRegistrationButton.setText("View Registrations");
        viewRegistrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRegistrationButtonActionPerformed(evt);
            }
        });

        CancelRegistrationButton.setText("Cancel Registration");

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        AddMembersButton.setText("Add Members");
        AddMembersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMembersButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Trainer Role");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddClassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ViewMembersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewClassButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(AddMembersButton))))
                    .addComponent(RegisterMemberForClassButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CancelRegistrationButton)
                            .addComponent(viewRegistrationButton)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(LogoutButton)))
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {CancelRegistrationButton, viewRegistrationButton});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddMembersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(ViewMembersButton)
                .addGap(18, 18, 18)
                .addComponent(AddClassButton)
                .addGap(18, 18, 18)
                .addComponent(viewClassButton)
                .addGap(18, 18, 18)
                .addComponent(RegisterMemberForClassButton)
                .addGap(18, 18, 18)
                .addComponent(CancelRegistrationButton)
                .addGap(18, 18, 18)
                .addComponent(viewRegistrationButton)
                .addGap(43, 43, 43)
                .addComponent(LogoutButton)
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMembersButtonActionPerformed
        AddMember a = new AddMember(this,trainerRole);
        this.setVisible(false);
        a.setVisible(true);
    }//GEN-LAST:event_AddMembersButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        this.trainerRole.logout();
        JOptionPane.showMessageDialog(null, "Succesful Logout");
        this.setVisible(false);
        this.mainWindow.setVisible(true);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void ViewMembersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewMembersButtonActionPerformed
        if (viewMembersTable == null) {
        viewMembersTable = new ViewMembers(this, trainerRole);
    }
    //this.setVisible(false);
    viewMembersTable.setVisible(true);
    }//GEN-LAST:event_ViewMembersButtonActionPerformed

    private void viewClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewClassButtonActionPerformed
        if (viewClassesTable == null) {
        viewClassesTable = new ViewClasses(this, trainerRole);
    }
    //this.setVisible(false);
    viewClassesTable.setVisible(true);
    }//GEN-LAST:event_viewClassButtonActionPerformed

    private void viewRegistrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRegistrationButtonActionPerformed
        if (viewRegistrationsTable == null) {
        viewRegistrationsTable = new ViewRegistrations(this, trainerRole);
    }
    //this.setVisible(false);
    viewRegistrationsTable.setVisible(true);
    }//GEN-LAST:event_viewRegistrationButtonActionPerformed

    private void AddClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddClassButtonActionPerformed
        AddClass p = new AddClass(this, trainerRole);
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddClassButtonActionPerformed

    private void RegisterMemberForClassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterMemberForClassButtonActionPerformed
        this.setVisible(false);
        RegisterMemberForClass p = new RegisterMemberForClass(this, trainerRole);
        p.setVisible(true);
    }//GEN-LAST:event_RegisterMemberForClassButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerRoleWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerRoleWindow(trainerLoginPage,mainWindow).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddClassButton;
    private javax.swing.JButton AddMembersButton;
    private javax.swing.JButton CancelRegistrationButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton RegisterMemberForClassButton;
    private javax.swing.JButton ViewMembersButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton viewClassButton;
    private javax.swing.JButton viewRegistrationButton;
    // End of variables declaration//GEN-END:variables
}
