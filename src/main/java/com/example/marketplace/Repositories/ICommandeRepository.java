package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.Commande;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommandeRepository extends CrudRepository<Commande,Long> {
}
