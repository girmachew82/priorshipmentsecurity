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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="AssignDrivers")
public class CarrierAssignDriver extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer assignId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bidding_id")
    @JsonIgnore
    private Bidding bidding;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name="driverId", referencedColumnName = "driverId")
    private Driver driver;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name="vehicleId", referencedColumnName = "vehicleId")
    private Vehicle vehicle;
    public Integer getAssignId() {
        return assignId;
    }
    public void setAssignId(Integer assignId) {
        this.assignId = assignId;
    }
    public Bidding getBidding() {
        return bidding;
    }
    public void setBidding(Bidding bidding) {
        this.bidding = bidding;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public CarrierAssignDriver() {
    }
    public CarrierAssignDriver(Integer assignId, Bidding bidding, Driver driver, Vehicle vehicle) {
        this.assignId = assignId;
        this.bidding = bidding;
        this.driver = driver;
        this.vehicle = vehicle;
    }
 
    


}