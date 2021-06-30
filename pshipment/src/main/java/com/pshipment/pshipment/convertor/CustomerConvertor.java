package com.pshipment.pshipment.convertor;

import java.util.List;

import com.pshipment.pshipment.dto.CustomerDto;
import com.pshipment.pshipment.model.Customer;

import org.springframework.stereotype.Component;
import java.util.stream.Collectors;
@Component
public class CustomerConvertor {
    public CustomerDto  entityToDto(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setCustomerId(customer.getCustomerId());
        dto.setFname(customer.getFname());
        dto.setMname(customer.getMname());
        dto.setLname(customer.getLname());
        dto.setAddress(customer.getAddress());
        dto.setCompany(customer.getCompany());
        dto.setEmail(customer.getEmail());
        dto.setPhoneNumber(customer.getPhoneNumber());
        return dto;
        }

        public List<CustomerDto> entityToDto(List<Customer> Customer) {
            return Customer.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
        }
        public Customer  dtoToEntity(CustomerDto dto) {
            Customer cust = new Customer();
            cust.setCustomerId(dto.getCustomerId());
            cust.setFname(dto.getFname());
            cust.setMname(dto.getFname());
            cust.setLname(dto.getLname());
            cust.setAddress(dto.getAddress());
            cust.setCompany(dto.getCompany());
            cust.setEmail(dto.getEmail());
            cust.setPhoneNumber(dto.getPhoneNumber());
            return cust;
            
        }
    public List<Customer> dtoToEntity(List<CustomerDto> dto) {
        return dto.stream().map(x->dtoToEntity(x)).collect(Collectors.toList());
        
    }       
}