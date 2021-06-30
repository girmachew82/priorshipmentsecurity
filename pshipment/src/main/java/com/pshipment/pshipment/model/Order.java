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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private String oLName;
    private String oLpuAddress;
    private String oLzipCode;
    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    private Date oSrtData;
    private String dLName;
    private String dLpdAddress;
    private String dLzipCode;
    @JsonFormat(pattern = "MM-dd-yyyy HH:mm:ss")
    private Date dDnptDate;
    private Long noofUnitShipping;
    private String typeofUnit;
    private Float weight;
    private String dimension;
    private String hazardousness;
    private String cargonotes;
    private String orderType;
    private String status;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Customer customer;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Set<Bidding> biddings = new HashSet<>();

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getoLName() {
        return oLName;
    }

    public void setoLName(String oLName) {
        this.oLName = oLName;
    }

    public String getoLpuAddress() {
        return oLpuAddress;
    }

    public void setoLpuAddress(String oLpuAddress) {
        this.oLpuAddress = oLpuAddress;
    }

    public String getoLzipCode() {
        return oLzipCode;
    }

    public void setoLzipCode(String oLzipCode) {
        this.oLzipCode = oLzipCode;
    }

    public Date getoSrtData() {
        return oSrtData;
    }

    public void setoSrtData(Date oSrtData) {
        this.oSrtData = oSrtData;
    }

    public String getdLName() {
        return dLName;
    }

    public void setdLName(String dLName) {
        this.dLName = dLName;
    }

    public String getdLpdAddress() {
        return dLpdAddress;
    }

    public void setdLpdAddress(String dLpdAddress) {
        this.dLpdAddress = dLpdAddress;
    }

    public String getdLzipCode() {
        return dLzipCode;
    }

    public void setdLzipCode(String dLzipCode) {
        this.dLzipCode = dLzipCode;
    }

    public Date getdDnptDate() {
        return dDnptDate;
    }

    public void setdDnptDate(Date dDnptDate) {
        this.dDnptDate = dDnptDate;
    }

    public Long getNoofUnitShipping() {
        return noofUnitShipping;
    }

    public void setNoofUnitShipping(Long noofUnitShipping) {
        this.noofUnitShipping = noofUnitShipping;
    }

    public String getTypeofUnit() {
        return typeofUnit;
    }

    public void setTypeofUnit(String typeofUnit) {
        this.typeofUnit = typeofUnit;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getHazardousness() {
        return hazardousness;
    }

    public void setHazardousness(String hazardousness) {
        this.hazardousness = hazardousness;
    }

    public String getCargonotes() {
        return cargonotes;
    }

    public void setCargonotes(String cargonotes) {
        this.cargonotes = cargonotes;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Set<Bidding> getBiddings() {
        return biddings;
    }

    public void setBiddings(Set<Bidding> biddings) {
        this.biddings = biddings;
    }

    public Order() {
    }

    public Order(int orderId, String oLName, String oLpuAddress, String oLzipCode, Date oSrtData, String dLName,
            String dLpdAddress, String dLzipCode, Date dDnptDate, Long noofUnitShipping, String typeofUnit,
            Float weight, String dimension, String hazardousness, String cargonotes, String orderType, String status,
            Customer customer, Set<Bidding> biddings) {
        this.orderId = orderId;
        this.oLName = oLName;
        this.oLpuAddress = oLpuAddress;
        this.oLzipCode = oLzipCode;
        this.oSrtData = oSrtData;
        this.dLName = dLName;
        this.dLpdAddress = dLpdAddress;
        this.dLzipCode = dLzipCode;
        this.dDnptDate = dDnptDate;
        this.noofUnitShipping = noofUnitShipping;
        this.typeofUnit = typeofUnit;
        this.weight = weight;
        this.dimension = dimension;
        this.hazardousness = hazardousness;
        this.cargonotes = cargonotes;
        this.orderType = orderType;
        this.status = status;
        this.customer = customer;
        this.biddings = biddings;
    }

    
}