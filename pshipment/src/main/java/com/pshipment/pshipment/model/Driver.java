package com.pshipment.pshipment.model;

import javax.persistence.CascadeType;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pshipment.pshipment.dto.DriversforAnOrderDto;

import org.hibernate.annotations.NamedNativeQuery;

@Entity
@Table(name = "drivers")
@NamedNativeQuery(name = "findDriversofAnOrder",
                   query ="SELECT "+
                         "drivers.driver_id AS driverId,"+
                        " drivers.first_name AS firstName,"+
                        "drivers.middle_name AS middleName,"+
                        "drivers.last_name AS lastName,"+
                        "drivers.phone_number  AS phoneNumber "+
                        "FROM assign_drivers "+
                        "INNER JOIN drivers ON drivers.driver_id =assign_drivers.driver_id "+
                         "WHERE  assign_drivers.bidding_id = :biddingId",
                          resultSetMapping = "driversofAnOrder"
                          )
@SqlResultSetMapping(
    name = "driversofAnOrder", 
        classes = @ConstructorResult(
            targetClass = DriversforAnOrderDto.class, columns = {
        @ColumnResult(name = "driverId", type = Integer.class), 
        @ColumnResult(name = "firstName", type = String.class),
        @ColumnResult(name = "middleName", type = String.class),
        @ColumnResult(name = "lastName", type = String.class), 
        @ColumnResult(name = "phoneNumber", type = String.class)
    }
        ))
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "carrier_id", nullable = false)
    private Carrier carrier;

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

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Driver() {
    }

    public Driver(Integer driverId, String firstName, String middleName, String lastName, String phoneNumber,
            Carrier carrier) {
        this.driverId = driverId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.carrier = carrier;
    }


    
    /*
     * @ManyToOne(fetch = FetchType.LAZY, optional = false)
     * 
     * @JoinColumn(name = "assign_id")
     * 
     * @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) private
     * CarrierAssignDriver carrierAssignDriver;
     */
 
    /*
     * public CarrierAssignDriver getCarrierAssignDriver() { return
     * carrierAssignDriver; }
     * 
     * public void setCarrierAssignDriver(CarrierAssignDriver carrierAssignDriver) {
     * this.carrierAssignDriver = carrierAssignDriver; }
     */

}
