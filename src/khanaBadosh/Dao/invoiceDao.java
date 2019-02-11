/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.invoice;

/**
 *
 * @author HP
 */
public class invoiceDao {
    public static boolean AddInvoice(invoice inv) throws Exception
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("insert into invoice values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    
pstmtadd.setString(1,inv.getEmpname());

          pstmtadd.setString(2,inv.getEmpid());
        pstmtadd.setString(3,inv.getDesignation());
         pstmtadd.setString(4,inv.getDepartment());
       pstmtadd.setString(5,inv.getSal_mm_yy());
      pstmtadd.setInt(6,inv.getDays());
       pstmtadd.setInt(7,inv.getLeaves());
        pstmtadd.setInt(8,inv.getBasics());
         pstmtadd.setInt(9,inv.getPf());
          pstmtadd.setInt(10,inv.getConveyance_fixed());
          pstmtadd.setInt(11,inv.getConveyance_variable());
        pstmtadd.setInt(12,inv.getInsurance());
         pstmtadd.setInt(13,inv.getHra());
          pstmtadd.setInt(14,inv.getAdvance());
            pstmtadd.setInt(15,inv.getIncentive());
             pstmtadd.setInt(16,inv.getBonus());
         pstmtadd.setInt(17,inv.getSpecial_allowance());
          pstmtadd.setInt(18,inv.getTotal_add());
           pstmtadd.setInt(19,inv.getTotal_ded());
            pstmtadd.setInt(20,inv.getGross_sal());
            pstmtadd.setInt(21, inv.getNet_sal());
            pstmtadd.setString(22, inv.getNet_words());
             pstmtadd.setInt(24,inv.getProfession_tax());
             pstmtadd.setString(25, inv.getDate_of_join());
     
  
       pstmtadd.setBlob(23, inv.getPhoto());
       
        
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;  
    }
 
    }  
    
    public static String ntoword(int num) throws SQLException
    {
         Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("select to_char(to_date(?,'J'), 'JSP') as converted_form from dual");
    String b = null ;
pstmtadd.setInt(1,num);
ResultSet rs = pstmtadd.executeQuery();
if(rs.next())
{
    b= rs.getString(1);
}
     return b ;
        }
            
    
    
    
}
