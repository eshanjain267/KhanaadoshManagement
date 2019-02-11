/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.pojo;


import java.awt.Image;
import java.io.File;
import java.sql.Blob;


import java.util.Date;

/**
 *
 * @author HP
 */
public class employees_job {
  String EMPID ,EMPNAME,WORKING_EXPERIENCE,DEPARTMENT,DESIGNATION ;                                   
 Date FROM_ ,TO_ , DATE_OF_JOINING;                                               
 int SALARY;                                             
File PHOTO ;
Image img ;

    public Blob getPho() {
        return pho;
    }

    public void setPho(Blob pho) {
        this.pho = pho;
    }
Blob pho ;

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
    public File getPHOTO() {
        return PHOTO;
    }

    public void setPHOTO(File PHOTO) {
        this.PHOTO = PHOTO;
    }

      
    public Date getDATE_OF_JOINING() {
        return DATE_OF_JOINING;
    }

    public void setDATE_OF_JOINING(Date DATE_OF_JOINING) {
        this.DATE_OF_JOINING = DATE_OF_JOINING;
    }
 

    public String getEMPID() {
        return EMPID;
    }

    public void setEMPID(String EMPID) {
        this.EMPID = EMPID;
    }

    public String getEMPNAME() {
        return EMPNAME;
    }

    public void setEMPNAME(String EMPNAME) {
        this.EMPNAME = EMPNAME;
    }

    public String getWORKING_EXPERIENCE() {
        return WORKING_EXPERIENCE;
    }

    public void setWORKING_EXPERIENCE(String WORKING_EXPERIENCE) {
        this.WORKING_EXPERIENCE = WORKING_EXPERIENCE;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }

    public String getDESIGNATION() {
        return DESIGNATION;
    }

    public void setDESIGNATION(String DESIGNATION) {
        this.DESIGNATION = DESIGNATION;
    }

    public Date getFROM_() {
        return FROM_;
    }

    public void setFROM_(Date FROM_) {
        this.FROM_ = FROM_;
    }

    public Date getTO_() {
        return TO_;
    }

    public void setTO_(Date TO_) {
        this.TO_ = TO_;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

  
}
