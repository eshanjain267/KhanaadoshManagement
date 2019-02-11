/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.Dao;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.employees_job;

/**
 *
 * @author HP
 */
public class Employees_jobDao {
    
    
    public static boolean AddEmp_Job(employees_job emp_j) throws Exception
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("insert into employees_job values(?,?,?,?,?,?,?,?,?,?)");
    
 java.sql.Date d2 =null,d3=null ;
long mili1 = emp_j.getDATE_OF_JOINING().getTime();
if(!(emp_j.getFROM_()==null)||(!(emp_j.getTO_()==null)))
{
long mili2 = emp_j.getFROM_().getTime();
long mili3 = emp_j.getTO_().getTime();
  d2 = new java.sql.Date(mili2);
   d3 = new java.sql.Date(mili3);
}
   java.sql.Date dl = new java.sql.Date(mili1);
   
         pstmtadd.setString(1,emp_j.getEMPID());
         pstmtadd.setString(2,emp_j.getEMPNAME());
          pstmtadd.setString(3,emp_j.getWORKING_EXPERIENCE());
           pstmtadd.setDate(4,d2);
         pstmtadd.setDate(5,d3);
         pstmtadd.setString(6,emp_j.getDEPARTMENT());
      pstmtadd.setString(7,emp_j.getDESIGNATION());
       pstmtadd.setInt(8,emp_j.getSALARY());
        
       FileInputStream fis = new FileInputStream(emp_j.getPHOTO());
       pstmtadd.setBinaryStream(9, fis, (int)emp_j.getPHOTO().length());
       
       
       
       pstmtadd.setDate(10,dl);
        
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;  
    }
    }
    
     public static ArrayList getEmpId() throws Exception
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("select EMPID from employees_job");
ResultSet rs = pstmtadd.executeQuery();
ArrayList<String> al = new ArrayList<>();
while(rs.next())
{
    al.add(rs.getString(1));
}
   
 return al ;   
}
        public static employees_job getEmpdetails(String id) throws Exception
        {
            Connection con = dbutil.getConnection();
        PreparedStatement  pstmtadd;
    pstmtadd = con.prepareStatement("select * from employees_job where EMPID=?");
    pstmtadd.setString(1, id);
    ResultSet rs = pstmtadd.executeQuery();
    employees_job emp = new employees_job();
    if(rs.next())
    {
        emp.setEMPID(id);
        emp.setEMPNAME(rs.getString(2));
        emp.setDATE_OF_JOINING(rs.getDate(10));
        emp.setDEPARTMENT(rs.getString(6));
        emp.setDESIGNATION(rs.getString(7));
        emp.setSALARY(rs.getInt(8));
        emp.setPho(rs.getBlob(9));
       byte   []imgbytes = rs.getBytes(9);
       Image img = Toolkit.getDefaultToolkit().createImage(imgbytes);
       emp.setImg(img);
    }
   
 return emp ;   
} 
         public static HashMap<String,employees_job> getEmp_jobDetails() throws Exception
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("select * from employees_job");
HashMap<String,employees_job> ejhm = new HashMap<>();
ResultSet rs = pstmtadd.executeQuery();
if(rs.next())
{
    employees_job emp = new employees_job();
    emp.setEMPID(rs.getString(1));
    emp.setEMPNAME(rs.getString(2));
    emp.setWORKING_EXPERIENCE(rs.getString(3));
    emp.setFROM_(rs.getDate(4));
    emp.setTO_(rs.getDate(5));
    emp.setDATE_OF_JOINING(rs.getDate(10));
    emp.setDEPARTMENT(rs.getString(6));
    emp.setDESIGNATION(rs.getString(7));
    emp.setSALARY(rs.getInt(8));
    emp.setPho(rs.getBlob(9));
   byte   []imgbytes = rs.getBytes(9);
   Image img = Toolkit.getDefaultToolkit().createImage(imgbytes);
   emp.setImg(img);
   ejhm.put(emp.getEMPID(), emp);
}
return ejhm ;
    }
         public static boolean updateEmp_Job(employees_job emp_j) throws Exception
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
    String qry = "update employees_job set EMPNAME=?,WORKING_EXPERIENCE=?,";
    qry = qry +"FROM_=?,TO_=?,DEPARTMENT=?,DESIGNATION=?,SALARY=?,PHOTO=?,";
    qry = qry + "DATE_OF_JOINING=? WHERE EMPID=?";
pstmtadd = con.prepareStatement(qry);
    
 java.sql.Date d2 =null,d3=null ;
long mili1 = emp_j.getDATE_OF_JOINING().getTime();
if(emp_j.getWORKING_EXPERIENCE().isEmpty())
{
   emp_j.setFROM_(null);
   emp_j.setTO_(null);
}
else{
long mili2 = emp_j.getFROM_().getTime();
long mili3 = emp_j.getTO_().getTime();
  d2 = new java.sql.Date(mili2);
   d3 = new java.sql.Date(mili3);
}
   java.sql.Date dl = new java.sql.Date(mili1);
   
         pstmtadd.setString(10,emp_j.getEMPID());
         pstmtadd.setString(1,emp_j.getEMPNAME());
          pstmtadd.setString(2,emp_j.getWORKING_EXPERIENCE());
           pstmtadd.setDate(3,d2);
         pstmtadd.setDate(4,d3);
         pstmtadd.setString(5,emp_j.getDEPARTMENT());
      pstmtadd.setString(6,emp_j.getDESIGNATION());
       pstmtadd.setInt(7,emp_j.getSALARY());
        
       if(emp_j.getPHOTO()==null){
       pstmtadd.setBlob(8,emp_j.getPho());
       }
       else
       {
        FileInputStream fis = new FileInputStream(emp_j.getPHOTO());
       pstmtadd.setBinaryStream(8, fis, (int)emp_j.getPHOTO().length());
       }
       
       
       pstmtadd.setDate(9,dl);
        
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;  
    }
    }
    
}