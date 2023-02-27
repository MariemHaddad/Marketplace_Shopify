package com.example.marketplace.Services;

import com.example.marketplace.Entities.Delivery;
import java.util.List;

public interface IDeliveryService {
    Delivery getDeliveryById(Long id);
    List<Delivery> getAllDeliveries();
    void saveDelivery(Delivery delivery);
    void updateDelivery(Delivery delivery);
    void deleteDelivery(Long id);
}
