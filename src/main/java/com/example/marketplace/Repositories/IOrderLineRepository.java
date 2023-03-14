package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.OrderLine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface IOrderLineRepository extends CrudRepository<OrderLine,Long> {
}
