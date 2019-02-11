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
import java.util.ArrayList;
import khanaBadosh.dbutil.dbutil;
import khanaBadosh.pojo.fuel;

/**
 *
 * @author HP
 */
public class fuelDao {
    public static boolean AddFuelEntry(fuel obj) throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("insert into fuel values(?,?,?,?,?,?)");
    
pstmtadd.setString(1,obj.getEmpId());
long mili1 = obj.getDate().getTime();
          java.sql.Date dl = new java.sql.Date(mili1);
          pstmtadd.setDate(2,dl);
        pstmtadd.setInt(3,obj.getStartR());
        pstmtadd.setDouble(5, obj.getPrice());
        pstmtadd.setDouble(6, obj.getTotal());
        pstmtadd.setInt(4,obj.getFinR());
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;  
    }
    }
     public static ArrayList<fuel> getFuelEntry() throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("select * from fuel");
ResultSet rs = pstmtadd.executeQuery();
ArrayList<fuel> al = new ArrayList<>();
while(rs.next())
{
    fuel obj = new fuel();

obj.setEmpId(rs.getString(1));
obj.setDate(rs.getDate(2));
obj.setStartR(rs.getInt(3));
obj.setFinR(rs.getInt(4));
obj.setPrice(rs.getDouble(5));
obj.setTotal(rs.getDouble(6));
al.add(obj);
}
   return al ;
    }
     public static boolean UpdateFuelEntry(fuel obj) throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
    String qry = "update fuel set START_READING=?,END_READING=?,READING_DATE=?,";
    qry = qry+"PRICE_PER_KM=?,TOTAL_FUEL_PRICE=? WHERE EMPID=?";
pstmtadd = con.prepareStatement(qry);
    
pstmtadd.setString(6,obj.getEmpId());
long mili1 = obj.getDate().getTime();
          java.sql.Date dl = new java.sql.Date(mili1);
        pstmtadd.setInt(1,obj.getStartR());
        pstmtadd.setInt(2,obj.getFinR());
          pstmtadd.setDate(3,dl);

        pstmtadd.setDouble(4, obj.getPrice());
        pstmtadd.setDouble(5, obj.getTotal());
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;  
    }
    }
     public static boolean DeleteFuelEntry(fuel obj) throws SQLException
    {
        Connection con = dbutil.getConnection();
    PreparedStatement  pstmtadd;
    String qry = "delete from fuel where START_READING=? and END_READING=? andREADING_DATE=? and";
    qry = qry+"PRICE_PER_KM=? and TOTAL_FUEL_PRICE=? and EMPID=?";
pstmtadd = con.prepareStatement(qry);
    
pstmtadd.setString(6,obj.getEmpId());
long mili1 = obj.getDate().getTime();
          java.sql.Date dl = new java.sql.Date(mili1);
        pstmtadd.setInt(1,obj.getStartR());
        pstmtadd.setInt(2,obj.getFinR());
          pstmtadd.setDate(3,dl);

        pstmtadd.setDouble(4, obj.getPrice());
        pstmtadd.setDouble(5, obj.getTotal());
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;  
    }
    }
    
    
}
