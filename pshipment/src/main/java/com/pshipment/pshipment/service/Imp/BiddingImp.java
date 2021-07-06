package com.pshipment.pshipment.service.Imp;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.pshipment.pshipment.dto.CarriersOnAnOrder;
import com.pshipment.pshipment.dto.OrderBiddingCarrierDto;
import com.pshipment.pshipment.model.Bidding;
import com.pshipment.pshipment.model.Carrier;
import com.pshipment.pshipment.model.Order;
import com.pshipment.pshipment.repository.BiddingRepository;
import com.pshipment.pshipment.repository.CarrierRepository;
import com.pshipment.pshipment.repository.OrderRepository;
import com.pshipment.pshipment.service.Inter.BiddingInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BiddingImp implements BiddingInter{
    @Autowired 
    private BiddingRepository biddingRepo;
    @Autowired
    private OrderRepository orderRepo;
    @Autowired 
    private CarrierRepository carrierRepo;
    @Override
    public Bidding create(Bidding bidding, int orderId, int carrierId) {
        
        Order order = orderRepo.findById(orderId).get();
        bidding.setOrder(order);
        Carrier carrier = carrierRepo.findById(carrierId).get();
        bidding.setCarrier(carrier);
        return biddingRepo.save(bidding);
    }
    @Override
    public int award(int biddingId, String status) {
        Optional<Bidding> bidding = biddingRepo.findById(biddingId);

            return biddingRepo.updatestatusRepo(biddingId, status);
        
       
    }
    @Override
    public List<CarriersOnAnOrder> getCafrriersOfAnOrder(int orderId) {
        return biddingRepo.getCarriersOfAnOrder(orderId);
    }
    @Override
    public List<OrderBiddingCarrierDto> getCafrriersOfAnOrder() {
        return biddingRepo.getCarriersOfAnOrder();
    }
}