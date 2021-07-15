package com.pshipment.pshipment.dto;

public class AwardedCarrierDto {
    private int carrierId;
    private String fname;
    private String mname;
    private String lname;
    private String address;
    private String mCNumber;
    private String dOTNumber;
    private String companyName;
    private String email;
    public int getCarrierId() {
        return carrierId;
    }
    public void setCarrierId(int carrierId) {
        this.carrierId = carrierId;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getmCNumber() {
        return mCNumber;
    }
    public void setmCNumber(String mCNumber) {
        this.mCNumber = mCNumber;
    }
    public String getdOTNumber() {
        return dOTNumber;
    }
    public void setdOTNumber(String dOTNumber) {
        this.dOTNumber = dOTNumber;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public AwardedCarrierDto() {
    }
    public AwardedCarrierDto(int carrierId, String fname, String mname, String lname, String address, String mCNumber,
            String dOTNumber, String companyName, String email) {
        this.carrierId = carrierId;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.address = address;
        this.mCNumber = mCNumber;
        this.dOTNumber = dOTNumber;
        this.companyName = companyName;
        this.email = email;
    }
 

   
}