package com.example.marketplace.Services;

import com.example.marketplace.Entities.Produit;
import com.example.marketplace.Repositories.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService {

    @Autowired
    ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }



    @Override
    public void deleteProduit(Long idProduit) {
        produitRepository.deleteProduit(idProduit);

    }


}

