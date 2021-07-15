package com.pshipment.pshipment.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AwardedCarrierOfAnOrderDto {
    private int carrierId;
    private String fname;
    private String mname;
    private String lname;
    private String address;
    private String mCNumber;
    private String dOTNumber;
    private String companyName;
    private String email;
    private int biddingId;
    private String status;
    private float expectedPrice;
    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    private Date eTAToOrigion;
    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    private Date eTAToDestination;
    private String teamSingle;
    private String unit;
    private String carrieNote;
    
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
    public int getBiddingId() {
        return biddingId;
    }
    public void setBiddingId(int biddingId) {
        this.biddingId = biddingId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public float getExpectedPrice() {
        return expectedPrice;
    }
    public void setExpectedPrice(float expectedPrice) {
        this.expectedPrice = expectedPrice;
    }
    public Date geteTAToOrigion() {
        return eTAToOrigion;
    }
    public void seteTAToOrigion(Date eTAToOrigion) {
        this.eTAToOrigion = eTAToOrigion;
    }
    public Date geteTAToDestination() {
        return eTAToDestination;
    }
    public void seteTAToDestination(Date eTAToDestination) {
        this.eTAToDestination = eTAToDestination;
    }
    public String getTeamSingle() {
        return teamSingle;
    }
    public void setTeamSingle(String teamSingle) {
        this.teamSingle = teamSingle;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getCarrieNote() {
        return carrieNote;
    }
    public void setCarrieNote(String carrieNote) {
        this.carrieNote = carrieNote;
    }
    public AwardedCarrierOfAnOrderDto() {
    }
    public AwardedCarrierOfAnOrderDto(int carrierId, String fname, String mname, String lname, String address,
            String mCNumber, String dOTNumber, String companyName, String email, int biddingId, 
            float expectedPrice, Date eTAToOrigion, Date eTAToDestination, String teamSingle, String unit,
            String carrieNote,String status) {
        this.carrierId = carrierId;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.address = address;
        this.mCNumber = mCNumber;
        this.dOTNumber = dOTNumber;
        this.companyName = companyName;
        this.email = email;
        this.biddingId = biddingId;
        this.status = status;
        this.expectedPrice = expectedPrice;
        this.eTAToOrigion = eTAToOrigion;
        this.eTAToDestination = eTAToDestination;
        this.teamSingle = teamSingle;
        this.unit = unit;
        this.carrieNote = carrieNote;
    }
    
}