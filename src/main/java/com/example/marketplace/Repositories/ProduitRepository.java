package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.Facture;
import com.example.marketplace.Entities.Produit;
import org.springframework.data.repository.CrudRepository;

public interface ProduitRepository  extends CrudRepository<Produit,Long> {
}
