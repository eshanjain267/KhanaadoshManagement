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
import java.sql.Statement;
import java.util.HashMap;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.employees_personal;

/**
 *
 * @author HP
 */
public class Employees_personalDao {
    
     public static String generateId() throws SQLException{
       int id =0;
       
        Connection con = dbutil.getConnection();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from Acount");
while(rs.next()){
    id = rs.getInt(1);
}
id = 1801 +id ;
return ""+id ;
   }
 public static boolean AddEmp_Personal(employees_personal emp_p) throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("insert into employees_personal values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
    
pstmtadd.setString(1,emp_p.getName());
long mili1 = emp_p.getDob().getTime();
          java.sql.Date dl = new java.sql.Date(mili1);
          pstmtadd.setDate(2,dl);
        pstmtadd.setString(3,emp_p.getEducation());
         pstmtadd.setString(4,emp_p.getDiploma());
       pstmtadd.setLong(5, emp_p.getContact());
       pstmtadd.setLong(6, emp_p.getEmergncy());
       pstmtadd.setString(7,emp_p.getPermanent());
       pstmtadd.setString(8,emp_p.getLocal());
       pstmtadd.setString(9,emp_p.getVechile());
       pstmtadd.setString(10,emp_p.getLicense());
       pstmtadd.setString(11,emp_p.getAdhar());
       pstmtadd.setString(12, emp_p.getPan());
       pstmtadd.setString(13,emp_p.getVoter());
       pstmtadd.setString(14, emp_p.getBlood());
      pstmtadd.setString(15, emp_p.getEmpid());
      
        
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
       pstmtadd = con.prepareStatement("update Acount set ecount = ecount+1");
       int y = pstmtadd.executeUpdate();
       return true ;  
   }
    }
 public static HashMap<String,employees_personal> getEmp_Personal() throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("select * from employees_personal");
ResultSet rs = pstmtadd.executeQuery();
HashMap<String,employees_personal> ephm =new HashMap<>();
while(rs.next())
{
    employees_personal emp_p = new employees_personal();
    
    emp_p.setName(rs.getString(1));
   emp_p.setDob(rs.getDate(2));
    emp_p.setAdhar(rs.getString(11));
    emp_p.setBlood(rs.getString(14));
 emp_p.setContact(rs.getLong(5));
    emp_p.setEducation(rs.getString(3));
    emp_p.setEmergncy(rs.getLong(6));
    emp_p.setLicense(rs.getString(10));
    emp_p.setLocal(rs.getString(8));
    emp_p.setPan(rs.getString(12));
    emp_p.setPermanent(rs.getString(7));
    emp_p.setVechile(rs.getString(9));
    emp_p.setVoter(rs.getString(13));
    emp_p.setDiploma(rs.getString(4));
    emp_p.setEmpid(rs.getString(15));
    
    ephm.put(rs.getString(15), emp_p);
}
    
    return ephm ;
    
    
    
    
}
public static boolean updateEmp_Personal(employees_personal emp_p) throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
    
   String qry = "update employees_personal set EMPNAME=?,DATE_OF_BIRTH=?,EDUCATION=?,DIPLOMA_COURSE=? ,CONTACT_NO=?,";
qry = qry +"EMERGENCY_NO=?,PERMANENT_ADDRESS =?,LOCAL_ADDRESS =?,VECHILE_NO=?,LICENSE_NO=?,";
qry = qry +"ADHARCARD_NO=?,PANCARD_NO=?,VOTERID =?,BLOOD_GROUP=? where EMPID=? ";   

pstmtadd = con.prepareStatement(qry);
    
pstmtadd.setString(1,emp_p.getName());
long mili1 = emp_p.getDob().getTime();
          java.sql.Date dl = new java.sql.Date(mili1);
          pstmtadd.setDate(2,dl);
        pstmtadd.setString(3,emp_p.getEducation());
         pstmtadd.setString(4,emp_p.getDiploma());
       pstmtadd.setLong(5, emp_p.getContact());
       pstmtadd.setLong(6, emp_p.getEmergncy());
       pstmtadd.setString(7,emp_p.getPermanent());
       pstmtadd.setString(8,emp_p.getLocal());
       pstmtadd.setString(9,emp_p.getVechile());
       pstmtadd.setString(10,emp_p.getLicense());
       pstmtadd.setString(11,emp_p.getAdhar());
       pstmtadd.setString(12, emp_p.getPan());
       pstmtadd.setString(13,emp_p.getVoter());
       pstmtadd.setString(14, emp_p.getBlood());
      pstmtadd.setString(15, emp_p.getEmpid());
      
        
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
       return true ;  
   }
    }
 public static boolean DeleteEmp(String id) throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd , psej;
    
   
pstmtadd = con.prepareStatement("delete from employees_personal where EMPID=?");
    psej = con.prepareStatement("delete from employees_job where EMPID=?");
   int x = pstmtadd.executeUpdate();
   int y =psej.executeUpdate();
   if(x==0||y==0)
       return false;
   
               else
       return true ;
    } 
}
