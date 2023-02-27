package com.example.marketplace.Services;

import com.example.marketplace.Entities.Produit;

public interface ProduitService {

     Produit saveProduit(Produit p);

     Produit updateProduit(Produit p);



     public void deleteProduit(Long idProduit);
}