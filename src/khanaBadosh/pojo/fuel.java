/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.pojo;

import java.util.Date;

/**
 *
 * @author HP
 */
public class fuel {
    private int startR ;
    private int finR ;
    private double price;
    private double total;
    private String EmpId ;
    private Date date ;

    public int getStartR() {
        return startR;
    }

    public void setStartR(int startR) {
        this.startR = startR;
    }

    public int getFinR() {
        return finR;
    }

    public void setFinR(int finR) {
        this.finR = finR;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEmpId() {
        return EmpId;
    }

    public void setEmpId(String EmpId) {
        this.EmpId = EmpId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
}
