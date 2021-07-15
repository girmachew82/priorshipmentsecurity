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
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Null;
import javax.persistence.ConstructorResult;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.ColumnResult;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pshipment.pshipment.dto.AwardedOrderDto;

@Entity
@Table(name = "orders")
@NamedNativeQuery(name = "findAwardedOrder", query = "SELECT " + "orders.order_id AS orderId,"
        + "orders.cargonotes AS oCargoNote," + "orders.d_dnpt_date AS ddnptDate,"
        + "orders. dlname AS dlname," + "orders.d_lpd_address AS slpdAddress,"
        + "orders. d_lzip_code AS dlzipCode," + "orders. dimension AS dimension,"
        + "orders.hazardousness AS hazardousness," + "orders.noof_unit_shipping AS noofUnitShipping,"
        + "orders. olname AS olname," + "orders. o_lpu_address AS olpuAddress,"
        + "orders. o_lzip_code As olzipCode," + "orders. o_srt_data AS osrtDate,"
        + "orders. order_type AS orderType," + "orders. status As orderStatus,"
        + "orders. typeof_unit As typeOfUnit," + "orders.weight As weight," +

         "biddings. bidding_id AS biddindId," + "biddings.carrie_note AS carrierNote,"
        + "biddings.etato_destination As etaToDestination," + "biddings.etato_origion As etaToOrgion,"
        + "biddings.expected_price As expectedPrice," + "biddings.status AS bStatus,"
        + "biddings.team_single AS teamSingle," + "biddings.unit AS unit,"
        + "biddings.carrier_id AS carrierId," + "biddings.order_id AS bOrderId," +

        "carriers.carrier_id AS carrier_id," + "carriers.fname AS fname," + "carriers.mname AS mname,"
        + "carriers.lname As lname," + "carriers.dotnumber AS dotnumber,"
        + "carriers.company_name AS company_name," + "carriers.address As address,"
        + "carriers.mcnumber AS mvnumber," + "carriers.email AS email " + " FROM " + " biddings "
        + "INNER JOIN orders ON orders.order_id = biddings.order_id "
        + "INNER JOIN carriers ON carriers.carrier_id = biddings.carrier_id " +

        "WHERE " + "biddings.bidding_id = :biddingId " +

        "UNION " + "SELECT " + "drivers.driver_id AS driverId," + "drivers.first_name AS firstName, "
        + "drivers.middle_name AS middleName, " + "drivers.last_name AS lastName, "
        + "drivers.phone_number AS phoneNumber, " + "Null as Col1 , " + "Null as Col2," + "Null as Col3,"
        + "Null as Col4," + "Null as Col5," + "Null as Col6," + "Null as Col7," + "Null as Col8," + "Null as Col9,"
        + "Null as Col10," + "Null as Col11," + "Null as Col12," + "Null as Col13," + "Null as Co14," + "Null as Col15,"
        + "Null as Col16," + "Null as Col17," + "Null as Col18," + "Null as Col19," + "Null as Col20,"
        + "Null as Col21," + "Null as Col22," + "Null as Col23," + "Null as Col24," + "Null as Col25,"
        + "Null as Col26," + "Null as Col27," + "Null as Col28," + "Null as Col29," + "Null as Col30," + "Null as Col31"
        + "FROM " + "assign_drivers " + "INNER JOIN drivers ON drivers.driver_id = assign_drivers.driver_id "
        + "INNER JOIN biddings ON biddings.bidding_id = assign_drivers.bidding_id " +

        " WHERE " + " assign_drivers.bidding_id = :biddingId", resultSetMapping = "awardedOrder")
@SqlResultSetMapping(name = "awardedOrder", classes = @ConstructorResult(targetClass = AwardedOrderDto.class, columns = {
        @ColumnResult(name = "orderId", type = Integer.class), @ColumnResult(name = "oCargoNote", type = String.class),
        @ColumnResult(name = "ddnptDate", type = Date.class), @ColumnResult(name = "dlname", type = String.class),
        @ColumnResult(name = "slpdAddress", type = String.class),
        @ColumnResult(name = "dlzipCode", type = String.class), @ColumnResult(name = "dimension", type = String.class),
        @ColumnResult(name = "hazardousness", type = String.class),
        @ColumnResult(name = "noofUnitShipping", type = Long.class),
        @ColumnResult(name = "olname", type = String.class), @ColumnResult(name = "olpuAddress", type = String.class),
        @ColumnResult(name = "olzipCode", type = String.class), @ColumnResult(name = "osrtDate", type = Date.class),
        @ColumnResult(name = "orderType", type = String.class),
        @ColumnResult(name = "orderStatus", type = String.class),
        @ColumnResult(name = "typeOfUnit", type = String.class), @ColumnResult(name = "weight", type = Float.class),

        @ColumnResult(name = "biddindId", type = Integer.class),
        @ColumnResult(name = "carrierNote", type = String.class),
        @ColumnResult(name = "etaToDestination", type = String.class),
        @ColumnResult(name = "etaToOrgion", type = String.class),
        @ColumnResult(name = "expectedPrice", type = Float.class), @ColumnResult(name = "bStatus", type = String.class),
        @ColumnResult(name = "teamSingle", type = String.class), @ColumnResult(name = "unit", type = String.class),
        @ColumnResult(name = "carrierId", type = Integer.class), @ColumnResult(name = "bOrderId", type = Integer.class),

        @ColumnResult(name = "carrier_id", type = Integer.class), @ColumnResult(name = "fname", type = String.class),
        @ColumnResult(name = "mname", type = String.class), @ColumnResult(name = "lname", type = String.class),
        @ColumnResult(name = "dotnumber", type = String.class),
        @ColumnResult(name = "company_name", type = String.class), @ColumnResult(name = "address", type = String.class),
        @ColumnResult(name = "mcnumber", type = String.class), @ColumnResult(name = "email", type = String.class),
        @ColumnResult(name = "driverId", type = String.class), @ColumnResult(name = "firstName", type = String.class),
        @ColumnResult(name = "middleName", type = String.class), @ColumnResult(name = "lastName", type = String.class),
        @ColumnResult(name = "phoneNumber", type = String.class), @ColumnResult(name = "Col1", type = Null.class),
        @ColumnResult(name = "Col2", type = Null.class), @ColumnResult(name = "Col3", type = Null.class),
        @ColumnResult(name = "Col4", type = Null.class), @ColumnResult(name = "Col5", type = Null.class),
        @ColumnResult(name = "Col6", type = Null.class), @ColumnResult(name = "Col7", type = Null.class),
        @ColumnResult(name = "Col8", type = Null.class), @ColumnResult(name = "Col9", type = Null.class),
        @ColumnResult(name = "Col10", type = Null.class), @ColumnResult(name = "Col11", type = Null.class),
        @ColumnResult(name = "Col12", type = Null.class), @ColumnResult(name = "Col13", type = Null.class),
        @ColumnResult(name = "Col14", type = Null.class), @ColumnResult(name = "Col15", type = Null.class),
        @ColumnResult(name = "Col16", type = Null.class), @ColumnResult(name = "Col17", type = Null.class),
        @ColumnResult(name = "Col18", type = Null.class), @ColumnResult(name = "Col19", type = Null.class),
        @ColumnResult(name = "Col20", type = Null.class), @ColumnResult(name = "Col21", type = Null.class),
        @ColumnResult(name = "Col22", type = Null.class), @ColumnResult(name = "Col23", type = Null.class),
        @ColumnResult(name = "Col24", type = Null.class), @ColumnResult(name = "Col25", type = Null.class),
        @ColumnResult(name = "Col26", type = Null.class), @ColumnResult(name = "Col27", type = Null.class),
        @ColumnResult(name = "Col28", type = Null.class), @ColumnResult(name = "Col29", type = Null.class),
        @ColumnResult(name = "Col30", type = Null.class),

        @ColumnResult(name = "Col31", type = Null.class), }))

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