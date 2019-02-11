/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.pojo;

import java.io.File;
import java.sql.Blob;

/**
 *
 * @author HP
 */
public class invoice {
    String empname ,empid,designation,department ,sal_mm_yy ,net_words,date_of_join ;
    int days ,leaves ,basics ,pf ,conveyance_fixed ,conveyance_variable ,insurance;
    int hra ,advance ,incentive ,bonus ,special_allowance ,total_add ,total_ded ;
    int gross_sal , net_sal ,profession_tax;
    Blob photo ;

    public String getDate_of_join() {
        return date_of_join;
    }

    public void setDate_of_join(String date_of_join) {
        this.date_of_join = date_of_join;
    }
    

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSal_mm_yy() {
        return sal_mm_yy;
    }

    public void setSal_mm_yy(String sal_mm_yy) {
        this.sal_mm_yy = sal_mm_yy;
    }

    public String getNet_words() {
        return net_words;
    }

    public void setNet_words(String net_words) {
        this.net_words = net_words;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        this.leaves = leaves;
    }

    public int getBasics() {
        return basics;
    }

    public void setBasics(int basics) {
        this.basics = basics;
    }

    public int getPf() {
        return pf;
    }

    public void setPf(int pf) {
        this.pf = pf;
    }

    public int getConveyance_fixed() {
        return conveyance_fixed;
    }

    public void setConveyance_fixed(int conveyance_fixed) {
        this.conveyance_fixed = conveyance_fixed;
    }

    public int getConveyance_variable() {
        return conveyance_variable;
    }

    public void setConveyance_variable(int conveyance_variable) {
        this.conveyance_variable = conveyance_variable;
    }

    public int getInsurance() {
        return insurance;
    }

    public void setInsurance(int insurance) {
        this.insurance = insurance;
    }

    public int getHra() {
        return hra;
    }

    public void setHra(int hra) {
        this.hra = hra;
    }

    public int getAdvance() {
        return advance;
    }

    public void setAdvance(int advance) {
        this.advance = advance;
    }

    public int getIncentive() {
        return incentive;
    }

    public void setIncentive(int incentive) {
        this.incentive = incentive;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSpecial_allowance() {
        return special_allowance;
    }

    public void setSpecial_allowance(int special_allowance) {
        this.special_allowance = special_allowance;
    }

    public int getTotal_add() {
        return total_add;
    }

    public void setTotal_add(int total_add) {
        this.total_add = total_add;
    }

    public int getTotal_ded() {
        return total_ded;
    }

    public void setTotal_ded(int total_ded) {
        this.total_ded = total_ded;
    }

    public int getGross_sal() {
        return gross_sal;
    }

    public void setGross_sal(int gross_sal) {
        this.gross_sal = gross_sal;
    }

    public int getNet_sal() {
        return net_sal;
    }

    public void setNet_sal(int net_sal) {
        this.net_sal = net_sal;
    }

    public int getProfession_tax() {
        return profession_tax;
    }

    public void setProfession_tax(int profession_tax) {
        this.profession_tax = profession_tax;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    
    

    
}
