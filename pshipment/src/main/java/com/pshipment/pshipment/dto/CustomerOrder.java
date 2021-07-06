package com.pshipment.pshipment.dto;

public class CustomerOrder {
    private String fname;
    private String cargonotes;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getCargonotes() {
        return cargonotes;
    }
    public void setCargonotes(String cargonotes) {
        this.cargonotes = cargonotes;
    }
    public CustomerOrder() {
    }
    public CustomerOrder(String fname, String cargonotes) {
        this.fname = fname;
        this.cargonotes = cargonotes;
    }
   
}