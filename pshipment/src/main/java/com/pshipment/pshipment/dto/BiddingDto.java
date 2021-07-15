package com.pshipment.pshipment.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class BiddingDto {
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
    public BiddingDto() {
    }
    public BiddingDto(int biddingId,  float expectedPrice, Date eTAToOrigion, Date eTAToDestination,
            String teamSingle, String unit, String carrieNote,String status) {
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