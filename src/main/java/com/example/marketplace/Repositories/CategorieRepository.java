package com.example.marketplace.Repositories;

import com.example.marketplace.Entities.Categorie;
import com.example.marketplace.Entities.Produit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends CrudRepository<Categorie, Long> {
}
