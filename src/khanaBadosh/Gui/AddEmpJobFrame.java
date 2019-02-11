/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.Gui;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import khanaBadosh.Dao.Employees_jobDao;
import khanaBadosh.Dao.Employees_personalDao;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.employees_job;
import khanaBadosh.pojo.employees_personal;

/**
 *
 * @author HP
 */
public class AddEmpJobFrame extends javax.swing.JFrame {
public static Frame fr1 =null;
static employees_personal emp ;
 String EMPID ,EMPNAME,WORKING_EXPERIENCE,DEPARTMENT,DESIGNATION ;                                   
 Date FROM_ ,TO_,DATE_OF_JOINING;                                               
 int SALARY;                                             
 File PHOTO ;
    
    public AddEmpJobFrame(employees_personal emp) {
        this.emp = emp ;
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
             SwingUtilities.updateComponentTreeUI(jPanel2);
        } catch (Throwable ex) {
            java.util.logging.Logger.getLogger(ViewFuelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         Toolkit t = Toolkit.getDefaultToolkit();
       Image im = t.getImage(getClass().getResource("/IMAGES/title.jpg"));
       setIconImage(im);
     
        this.setLocationRelativeTo(null);
      txtempid.setText(emp.getEmpid());
       txtname.setText(emp.getName());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scbar = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtexperience = new javax.swing.JTextField();
        txtempid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        txtdesignation = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jdfrom = new com.toedter.calendar.JDateChooser();
        jdto = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btnupload = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jdDoj = new com.toedter.calendar.JDateChooser();
        jssal = new javax.swing.JSpinner();
        btnAddDetails = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 1, true), " ADD JOB DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 102, 0))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1240, 680));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel12.setText("Employee Id           :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 220, -1));

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel13.setText("(in years)");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, -1));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel14.setText("Designation*    :");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 180, -1));

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 220, -1));

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel17.setText("From           :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, -1));

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel19.setText("Working Experience  :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        txtexperience.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        txtexperience.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtexperience, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 260, -1));

        txtempid.setEditable(false);
        txtempid.setBackground(new java.awt.Color(255, 255, 255));
        txtempid.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        txtempid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtempid, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 280, 40));

        txtname.setEditable(false);
        txtname.setBackground(new java.awt.Color(255, 255, 255));
        txtname.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        txtname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 320, 40));

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel22.setText("Department*     :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 190, -1));

        lb.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        lb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 190, 190));

        txtDepartment.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        txtDepartment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 280, 40));

        txtdesignation.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        txtdesignation.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtdesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 300, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Duration Of Last Job", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel18.setText("To      :");

        jdfrom.setBackground(new java.awt.Color(255, 255, 255));
        jdfrom.setDateFormatString("dd MMM,yyy");
        jdfrom.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jdto.setBackground(new java.awt.Color(255, 255, 255));
        jdto.setDateFormatString("dd MMM,yyy");
        jdto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jdfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdto, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 1100, 130));

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel28.setText("Passport Size Photo         :");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel29.setText("Salary*             :");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 170, -1));

        btnupload.setBackground(new java.awt.Color(255, 102, 0));
        btnupload.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        btnupload.setForeground(new java.awt.Color(255, 255, 255));
        btnupload.setText("Upload Photo");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });
        jPanel2.add(btnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 170, 30));

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel20.setText("To      :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, 110, -1));

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel16.setText("Employee Name        :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 230, -1));

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jLabel30.setText("Date of Joining*       :");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 220, -1));

        jdDoj.setBackground(new java.awt.Color(255, 255, 255));
        jdDoj.setForeground(new java.awt.Color(255, 0, 51));
        jdDoj.setDateFormatString("dd MMM,yyy");
        jdDoj.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(jdDoj, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 310, 40));

        jssal.setFont(new java.awt.Font("Trebuchet MS", 2, 22)); // NOI18N
        jssal.setModel(new javax.swing.SpinnerNumberModel(1000, 1000, null, 100));
        jssal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.add(jssal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 270, 40));

        btnAddDetails.setBackground(new java.awt.Color(204, 0, 51));
        btnAddDetails.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        btnAddDetails.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDetails.setText("Add Employee");
        btnAddDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDetailsActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 220, 40));

        jButton4.setBackground(new java.awt.Color(204, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("QUIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 110, 40));

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 510, 120, 40));

        btnBack.setBackground(new java.awt.Color(204, 0, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 580, 110, 40));

        scbar.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scbar, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
this.setVisible(false);
AddEmpFrame.fr.setVisible(true);
fr1 = this ;



        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDetailsActionPerformed
if(validateInput())
{ 
try
{
   EMPID = txtempid.getText();
   EMPNAME = txtname.getText();
   DESIGNATION = txtdesignation.getText();
   WORKING_EXPERIENCE = txtexperience.getText()+"";
   DEPARTMENT = txtDepartment.getText();
    FROM_ = jdfrom.getDate();
   TO_  = jdto.getDate();  
   DATE_OF_JOINING = jdDoj.getDate();
 SALARY = (int)jssal.getValue();                                             
  employees_job ejob = new employees_job();
  
           ejob.setEMPID(EMPID);
           ejob.setDATE_OF_JOINING(DATE_OF_JOINING);
           ejob.setDEPARTMENT(DEPARTMENT);
           ejob.setDESIGNATION(DESIGNATION);
           ejob.setEMPNAME(EMPNAME);
           ejob.setFROM_(FROM_);
           ejob.setSALARY(SALARY);
           ejob.setTO_(TO_);
           ejob.setWORKING_EXPERIENCE(WORKING_EXPERIENCE);
           ejob.setPHOTO(PHOTO);
           
           if(Employees_jobDao.AddEmp_Job(ejob) && Employees_personalDao.AddEmp_Personal(emp))
           {
       JOptionPane.showMessageDialog(null,"Adding Employees details is successfull.","Success",JOptionPane.INFORMATION_MESSAGE);
         this.dispose();
         new AdminOptionFrame().setVisible(true);
           
           }
           
    
    
}
catch(Throwable th)
{
     JOptionPane.showMessageDialog(null,"Adding Employees details is Unsuccessfull."+th.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
         
    th.printStackTrace();
}


}


        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddDetailsActionPerformed

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
  JFileChooser chooser  = new JFileChooser();
       chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("Images(.jpg & .jpeg)","jpg","jpeg"));
 
      
        try
        {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                   SwingUtilities.updateComponentTreeUI(chooser);
                        
    
      int returnval = chooser.showOpenDialog(chooser);
      
        if(returnval == JFileChooser.APPROVE_OPTION){
            PHOTO = chooser.getSelectedFile();
         String path = PHOTO.getAbsolutePath();
          ImageIcon MyImage = new ImageIcon(path);
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(lb.getWidth(), lb.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
     lb.setIcon(image);
            }
        
       
        }
 catch(Exception e)
    {
     e.printStackTrace();
    }


   
// TODO add your handling code here:
    }//GEN-LAST:event_btnuploadActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure ?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            dbutil.closeConnection();
            System.exit(0);
     
        }   


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.dispose();
new AddEmpJobFrame(emp).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmpJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmpJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmpJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmpJobFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmpJobFrame(emp).setVisible(true);
            }
        });
        
    }

    @Override
    public int getDefaultCloseOperation() {
        dbutil.closeConnection();
        return super.getDefaultCloseOperation(); //To change body of generated methods, choose Tools | Templates.
    }
private boolean validateInput()
{
    if(txtDepartment.getText().isEmpty() || txtdesignation.getText().isEmpty()||jdDoj.getDate().toString().isEmpty()){
       JOptionPane.showMessageDialog(null, "Please Fill All the Mandatory(*) Fields", "EMPTY FIELDS(*)", JOptionPane.ERROR_MESSAGE);
  return false ;
    }
    else{
   return true ;
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDetails;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnupload;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser jdDoj;
    private com.toedter.calendar.JDateChooser jdfrom;
    private com.toedter.calendar.JDateChooser jdto;
    private javax.swing.JSpinner jssal;
    private javax.swing.JLabel lb;
    private javax.swing.JScrollPane scbar;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtdesignation;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtexperience;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
