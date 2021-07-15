package com.pshipment.pshipment.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pshipment.pshipment.model.Customer;
public class OrderDto {
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
    public OrderDto() {
    }
    public OrderDto(int orderId, String oLName, String oLpuAddress, String oLzipCode, Date oSrtData, String dLName,
            String dLpdAddress, String dLzipCode, Date dDnptDate, Long noofUnitShipping, String typeofUnit,
            Float weight, String dimension, String hazardousness, String cargonotes, String orderType, String status) {
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
    }

}