package com.example.marketplace.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ProductComment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProductComment;

    private String text;

    @OneToMany (mappedBy = "commentlike")
    @JsonIgnore
    private List<Commentlike> commentlikes;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "idProduit", referencedColumnName = "idProduit")
    private Produit produit;

    private Instant createdDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUser")
    private User user;

}
