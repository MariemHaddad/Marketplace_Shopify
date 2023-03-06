package com.example.marketplace.Services;

import com.example.marketplace.Entities.Boutique;
import com.example.marketplace.Entities.Categorie;
import com.example.marketplace.Entities.Produit;

import java.util.List;

public interface ProduitService {

    void affectprodtocat(Produit produit, Long idCategorie);


    void affectcattobou(Categorie categorie, Long idbou);

    List<Produit> findAllProduits();
    List<Categorie> findAllCategories();


    //List<Produit> filterProduit(double minPrixProduit, double maxPrixProduit);

    void saveProduit(Produit p);
    Categorie saveCategorie(Categorie c);
    Boutique saveBoutique(Boutique b);

    Produit updateProduit(Produit p);
    Categorie updateCategorie(Categorie c);
    Boutique updateBoutique(Boutique b);



    void deleteProduit(Produit p);

    void deleteProduitById(Long idProduit);



}
