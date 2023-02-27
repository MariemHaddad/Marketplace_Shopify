package com.example.marketplace.Services;

import com.example.marketplace.Entities.Delivery;
import com.example.marketplace.Repositories.IDeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeliveryServiceImpl implements IDeliveryService{

    @Autowired
    IDeliveryRepository deliveryRepository;

    @Override
    public Delivery getDeliveryById(Long id) {
        return null;
    }

    @Override
    public List<Delivery> getAllDeliveries() {
        return null;
    }

    @Override
    public void saveDelivery(Delivery delivery) {

    }

    @Override
    public void updateDelivery(Delivery delivery) {

    }

    @Override
    public void deleteDelivery(Long id) {

    }
}
