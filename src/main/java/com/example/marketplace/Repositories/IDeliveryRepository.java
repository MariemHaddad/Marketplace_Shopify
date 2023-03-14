package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.Delivery;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDeliveryRepository extends CrudRepository<Delivery,Long> {


}
