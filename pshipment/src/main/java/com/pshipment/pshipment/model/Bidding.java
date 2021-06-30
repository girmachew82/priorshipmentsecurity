package com.pshipment.pshipment.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Biddings")

public class Bidding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "carrier_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Carrier carrier;

    @OneToMany(mappedBy = "bidding", cascade = CascadeType.ALL)
    private Set<CarrierAssignDriver> drivers = new HashSet<>();

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

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Set<CarrierAssignDriver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<CarrierAssignDriver> drivers) {
        this.drivers = drivers;
    }

    public Bidding() {
    }

    public Bidding(int biddingId, String status, float expectedPrice, Date eTAToOrigion, Date eTAToDestination,
            String teamSingle, String unit, String carrieNote, Order order, Carrier carrier,
            Set<CarrierAssignDriver> drivers) {
        this.biddingId = biddingId;
        this.status = status;
        this.expectedPrice = expectedPrice;
        this.eTAToOrigion = eTAToOrigion;
        this.eTAToDestination = eTAToDestination;
        this.teamSingle = teamSingle;
        this.unit = unit;
        this.carrieNote = carrieNote;
        this.order = order;
        this.carrier = carrier;
        this.drivers = drivers;
    } 
    
}