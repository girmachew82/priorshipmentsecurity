package com.pshipment.pshipment.model;

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

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="AssignDrivers")
public class CarrierAssignDriver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int assignId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bidding_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bidding bidding;
    private int driverId;
    public int getAssignId() {
        return assignId;
    }

    public void setAssignId(int assignId) {
        this.assignId = assignId;
    }

    public Bidding getBidding() {
        return bidding;
    }

    public void setBidding(Bidding bidding) {
        this.bidding = bidding;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public CarrierAssignDriver() {
    }

    public CarrierAssignDriver(int assignId, Bidding bidding, int driverId) {
        this.assignId = assignId;
        this.bidding = bidding;
        this.driverId = driverId;
    }

}