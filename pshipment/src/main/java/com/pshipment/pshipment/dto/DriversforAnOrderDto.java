package com.pshipment.pshipment.dto;

public class DriversforAnOrderDto {
    private Integer driverId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;
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
    public DriversforAnOrderDto() {
    }
    public DriversforAnOrderDto(Integer driverId, String firstName, String middleName, String lastName,
            String phoneNumber) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }
    
}