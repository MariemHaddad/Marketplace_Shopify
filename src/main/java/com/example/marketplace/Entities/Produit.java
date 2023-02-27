package com.example.marketplace.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idProduit;
    private String nomProduit;
    private Float prixProduit;
    private Date dateCreation;
    private String photoProduit;
    @ManyToOne
    private Categorie categorie;
    @ManyToOne
    private User user;
    @OneToMany (mappedBy = "productlike" ,cascade = CascadeType.ALL)
    private List<Productlike> Likes;

    @OneToOne
    private OrderLine orderLine;

}
