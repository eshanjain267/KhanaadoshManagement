/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.Gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import khanaBadosh.Dao.loginDao;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.login;

/**
 *
 * @author HP
 */
public class AddAdminFrame extends javax.swing.JFrame {
private String userid;
    private String password;

    /**
     * Creates new form AddAdminFrame
     */
    public AddAdminFrame() {
        initComponents();
         try {
             Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
         setBounds(0,0,d.width, d.height);
       this.setResizable(false);
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
   SwingUtilities.updateComponentTreeUI(scbar);
  
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            SwingUtilities.updateComponentTreeUI(jPanel1);
        } catch (Throwable ex) {
            java.util.logging.Logger.getLogger(ViewFuelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
         Toolkit t = Toolkit.getDefaultToolkit();
        Image im = t.getImage(getClass().getResource("/IMAGES/title.jpg"));
        setIconImage(im);
  
Image img = t.getImage(getClass().getResource("/IMAGES/SIDE3.jpg")).getScaledInstance(jLabel5.getWidth(),jLabel5.getHeight(),Image.SCALE_SMOOTH);
ImageIcon icon=new ImageIcon(img);
jLabel5.setIcon(icon);
 img = t.getImage(getClass().getResource("/IMAGES/SIDE.jpg")).getScaledInstance(jLabel6.getWidth(),jLabel6.getHeight(),Image.SCALE_SMOOTH);
 icon=new ImageIcon(img);
jLabel6.setIcon(icon);
 img = t.getImage(getClass().getResource("/IMAGES/Untitled-1-copy.jpg")).getScaledInstance(jLabel8.getWidth(),jLabel8.getHeight(),Image.SCALE_SMOOTH);
 icon=new ImageIcon(img);
jLabel8.setIcon(icon);


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scbar = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        txtuserid = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        txtCnfrmPswrd = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/login-gif-13.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 420));

        jLabel4.setBackground(new java.awt.Color(255, 102, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("USER LOGIN DETAILS");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 350, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SIDE.jpg"))); // NOI18N
        jLabel6.setText("jLabel5");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 310, 530));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SIDE3.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 260, 310));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/Untitled-1-copy.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 730, 170));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD LOGIN DETAILS ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 14, 19));
        jLabel2.setText("USERID         :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 14, 19));
        jLabel3.setText("PASSWORD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, 30));

        btnlogin.setBackground(new java.awt.Color(255, 0, 0));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("ADD ADMIN");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 160, 30));

        btnquit.setBackground(new java.awt.Color(255, 0, 0));
        btnquit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnquit.setForeground(new java.awt.Color(255, 255, 255));
        btnquit.setText("QUIT");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });
        jPanel2.add(btnquit, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 130, -1));

        txtuserid.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel2.add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 319, -1));

        txtpassword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 319, -1));

        btnBack.setBackground(new java.awt.Color(255, 102, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 150, 30));

        btnclear.setBackground(new java.awt.Color(255, 102, 0));
        btnclear.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("CLEAR");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel2.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 130, 30));

        txtCnfrmPswrd.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        txtCnfrmPswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCnfrmPswrdActionPerformed(evt);
            }
        });
        jPanel2.add(txtCnfrmPswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 319, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 14, 19));
        jLabel9.setText("CONFIRM      :");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 190, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 14, 19));
        jLabel10.setText("PASSWORD   :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 590, 310));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/SIDE2.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 990, 140));

        scbar.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scbar, javax.swing.GroupLayout.DEFAULT_SIZE, 1198, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scbar, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if (validateInput()) {
            try {
                login user = new login();
                user.setUserId(userid);
                user.setPassword(password);
                user.setUserType("ADMIN");
                if (loginDao.registerUser(user)) {
                     JOptionPane.showMessageDialog(null,"New Admin Successfully Registered","Success",JOptionPane.INFORMATION_MESSAGE);
this.dispose();
    new AdminOptionFrame().setVisible(true);
     
                } 

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "ERROR IN DB PART \n Please Contact Master Admin\n" + ex, "ERROR in DB!", JOptionPane.ERROR_MESSAGE);

                ex.printStackTrace();
            }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Please Fill the Userid/Password", "EMPTY FIELDS", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
       int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure ?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            dbutil.closeConnection();
            System.exit(0);
     
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_btnquitActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
        new AdminOptionFrame().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed

        this.dispose();
        new AddAdminFrame().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnclearActionPerformed

    private void txtCnfrmPswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCnfrmPswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCnfrmPswrdActionPerformed

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
            java.util.logging.Logger.getLogger(AddAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdminFrame().setVisible(true);
            }
        });
         


        
    }

    @Override
    public int getDefaultCloseOperation() {
        dbutil.closeConnection();
        return super.getDefaultCloseOperation();
        //To change body of generated methods, choose Tools | Templates.
    }

    public boolean validateInput() {
        userid = txtuserid.getText();
        char[] pwd = txtpassword.getPassword();
        password = String.valueOf(pwd);
        pwd = txtCnfrmPswrd.getPassword();
    String confirm = String.valueOf(pwd);
    if(txtuserid.getText().isEmpty()|| password.length()==0 || confirm.length()==0){
       
        return false;
    }
    else{
         if(!password.equals(confirm))
        {
       JOptionPane.showMessageDialog(null,"Password doesn't Match with Confirm ","Password Mismatch!!",JOptionPane.ERROR_MESSAGE);
        return false; 
        }
    return true;  
    }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnquit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scbar;
    private javax.swing.JPasswordField txtCnfrmPswrd;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables
}
