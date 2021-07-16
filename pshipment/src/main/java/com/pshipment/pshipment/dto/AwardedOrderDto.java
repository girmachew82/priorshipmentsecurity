package com.pshipment.pshipment.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.pshipment.pshipment.model.CarrierAssignDriver;
import com.pshipment.pshipment.model.Driver;

public class AwardedOrderDto  {
 /*    private int orderId;
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
    private String ostatus; */
    private OrderDto order;
    /*
    private int carrierId;
    private String fname;
    private String mname;
    private String lname;
    private String address;
    private String mCNumber;
    private String dOTNumber;
    private String companyName;
    private String email;
   */
  private AwardedCarrierOfAnOrderDto carrierOnAnOrder;
    /*
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
*/
    private List<DriversforAnOrderDto> driversDto;
    public OrderDto getOrder() {
        return order;
    }
    public void setOrder(OrderDto order) {
        this.order = order;
    }
    public AwardedCarrierOfAnOrderDto getCarrierOnAnOrder() {
        return carrierOnAnOrder;
    }
    public void setCarrierOnAnOrder(AwardedCarrierOfAnOrderDto carrierOnAnOrder) {
        this.carrierOnAnOrder = carrierOnAnOrder;
    }
    public List<DriversforAnOrderDto> getDriversDto() {
        return driversDto;
    }
    public void setDriversDto(List<DriversforAnOrderDto> driversDto) {
        this.driversDto = driversDto;
    }


  
}
