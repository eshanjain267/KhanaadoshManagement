/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.Gui;

import java.awt.Component;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.imageio.ImageIO;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.DialogTypeSelection;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import khanaBadosh.Dao.invoiceDao;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.invoice;

/**
 *
 * @author HP
 */
public class SlipFrame extends javax.swing.JFrame {
public static invoice inv ;
public static Image  ic ;
PrintRequestAttributeSet aset;
String words ;
    
     
    public SlipFrame(invoice inv) {
        initComponents();
         try {
            this.setResizable(false);
   
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
             SwingUtilities.updateComponentTreeUI(this);
        } catch (Throwable ex) {
            java.util.logging.Logger.getLogger(ViewFuelFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        this.setLocationRelativeTo(null);
        this.inv = inv ;
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
            words = invoiceDao.ntoword(inv.getNet_sal());
            String sd = words.toLowerCase();
            String ar ="";
            int n = sd.length();
            for(int i=0;i<n;i++){
                if(i==n/2)
                    ar=ar+"\n";
            
            ar = ar+sd.charAt(i);
            }
            words =ar;
            
        
        }
        catch(Throwable th)
        {
          th.printStackTrace();  
        }
        Image img = ic.getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
ImageIcon icon=new ImageIcon(img);
pic.setIcon(icon);
        jList1.setSelectionModel(new NoSelectionModel());
        jList5.setSelectionModel(new NoSelectionModel());
        jList3.setSelectionModel(new NoSelectionModel());
        jList6.setSelectionModel(new NoSelectionModel());
          lis1.setSelectionModel(new NoSelectionModel());
          lis2.setSelectionModel(new NoSelectionModel());
        DefaultListModel<String> model = new DefaultListModel();
        DefaultListModel<String> model1 = new DefaultListModel();
              model1.setSize(18);
              model.setSize(18);
                 
      
       
      
       model.add(0,inv.getEmpname().toUpperCase());
         model.add(1,inv.getDesignation());
          model.add(2,inv.getSal_mm_yy());
           model.add(3,inv.getDate_of_join());
           model.add(4,"Amount (in Rs.)");

           model.add(5,inv.getBasics()+"");
            model.add(6,inv.getConveyance_fixed()+"");
             model.add(7,inv.getConveyance_variable()+"");
              model.add(8,inv.getHra()+"");
               model.add(9,inv.getIncentive()+"");
            model.add(10,inv.getBonus()+"");
             model.add(11,inv.getSpecial_allowance()+"");
             model.add(12, " ");
              model.add(13, " ");

             model.add(14,inv.getTotal_add()+"");
               model.add(15,inv.getGross_sal()+"");
                model.add(16,inv.getNet_sal()+"");
                lbword.setText(words);
        
         model1.add(0,inv.getEmpid());
         model1.add(1,inv.getDepartment());
          model1.add(2,inv.getDays()+"");
           model1.add(3,inv.getLeaves()+"");
           model1.add(4,"Amount (in Rs.)");

           model1.add(5,inv.getPf()+"");
            model1.add(6,inv.getProfession_tax()+"");
             model1.add(7,inv.getInsurance()+"");
              model1.add(8,inv.getAdvance()+"");
              model1.add(9, " ");
              model1.add(10, "  ");
              model1.add(11, " ");
              model1.add(12, " ");
             model1.add(13, " ");

              model1.add(14,inv.getTotal_ded()+"");
        
        lis1.setModel(model);
        lis2.setModel(model1);
      
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
        jScrollPane7 = new javax.swing.JScrollPane();
        lbword = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        lis1 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lis2 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(760, 730));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALARY SLIP\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 670));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbword.setColumns(5);
        lbword.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbword.setLineWrap(true);
        lbword.setRows(2);
        lbword.setTabSize(20);
        lbword.setWrapStyleWord(true);
        lbword.setBorder(null);
        lbword.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(lbword);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 170, 50));

        lis1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        lis1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lis1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lis1.setDropMode(javax.swing.DropMode.ON);
        lis1.setVisibleRowCount(18);
        jScrollPane2.setViewportView(lis1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 170, 410));

        jList5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jList5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jList5.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { ":", ":", ":", ":", ":", ":", ":", ":", ":", ":", ":", ":", " ", " ", ":", ":", ":", ":" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList5);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 20, 410));

        lis2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lis2.setVisibleRowCount(18);
        jScrollPane4.setViewportView(lis2);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 180, 410));

        jList6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jList6.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { ":", ":", ":", ":", ":", ":", ":", ":", ":", " ", " ", " ", " ", " ", ":", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(jList6);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 20, 410));

        jList1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "  Employee Name", "  Designation", "  Salary Month & Year", "  Date of Joining", "  Earnings           ", "  Basic                    ", "  Conveyance Fixed   ", "  Conveyance Variable", "  HRA", "  Incentive", "  Bonus ", "  Special Allowance", " ", " ", "  Total Addition", "  Gross Salary ", "  Net Salary ", "  Net Salary in Words" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jList1.setDropMode(javax.swing.DropMode.ON);
        jList1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jList1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, 410));

        jList3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "  Employee Id", "  Department", "  Days ", "  Leaves", "  Deductions", "  PF ", "  Profession Tax ", "  Insurance ", "  Advance ", " ", " ", " ", " ", " ", "  Total Deduction" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 170, 410));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Khanabadosh Food Delivery ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 350, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("C-51, Amravihar Phase-III, Kolar Road Bhopal-462042, MP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 490, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/okk.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 80));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel4.setText("  Employer's Signature   :                                      Employee Signature    :       ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 750, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("NOTE :-");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 750, 30));

        pic.setText("Passport size photo");
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 130, 100));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        jLabel6.setText("Print");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked

    jLabel6.setVisible(false);
jLabel6.hide();
        try{
            
        Dimension d = this.getSize();
        Rectangle rct = new Rectangle();
        rct.setSize(d);
        Robot r = new Robot();
        rct.setBounds(this.getBounds());
BufferedImage image = r.createScreenCapture(rct);

File f = new File("my.jpg");
ImageIO.write(image, "jpg", f);
Desktop e = Desktop.getDesktop();
e.print(f);
 
        this.dispose();
    }
      catch(Throwable th)
      {
          th.printStackTrace();
      }
 






        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

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
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SlipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlipFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlipFrame(inv).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea lbword;
    private javax.swing.JList<String> lis1;
    private javax.swing.JList<String> lis2;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
private static class NoSelectionModel extends DefaultListSelectionModel {

   @Override
   public void setAnchorSelectionIndex(final int anchorIndex) {}

   @Override
   public void setLeadAnchorNotificationEnabled(final boolean flag) {}

   @Override
   public void setLeadSelectionIndex(final int leadIndex) {}

   @Override
   public void setSelectionInterval(final int index0, final int index1) { }
 }

}









