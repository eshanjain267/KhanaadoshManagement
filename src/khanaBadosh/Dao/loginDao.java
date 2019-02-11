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
import khanaBadosh.pojo.login;

/**
 *
 * @author HP
 */
public class loginDao {
    public static String validateUser(login user) throws SQLException
    {
       Connection con = dbutil.getConnection();
       PreparedStatement pstmt = con.prepareStatement("select USERID from login where userid=? and password=? and usertype=?");
       pstmt.setString(1, user.getUserId());
       pstmt.setString(2, user.getPassword());
       pstmt.setString(3, user.getUserType());
       ResultSet rs = pstmt.executeQuery();
       String username = null ;
       if(rs.next())
           username= rs.getString(1);
   
       
       return username ;
    }
     public static boolean registerUser(login user) throws SQLException
    {
       Connection con = dbutil.getConnection();
  PreparedStatement pst = con.prepareStatement("insert into login values(?,?,?)");
  pst.setString(1, user.getUserId());
  pst.setString(2,user.getPassword());
  pst.setString(3, user.getUserType());
  int x = pst.executeUpdate();
  if(x==0)
      return false ;
  else
      return true ;
    }
   
   
    
}
