package com.pshipment.pshipment.dto;

public class DriversforAnOrderDto {
    private Integer driverId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private int vehicleId;
    private String vehicleNumber;
    public Integer getDriverId() {
        return driverId;
    }
    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public DriversforAnOrderDto() {
    }
    public DriversforAnOrderDto(Integer driverId, String firstName, String middleName, String lastName,
            String phoneNumber, int vehicleId, String vehicleNumber) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
    }
    
    
}