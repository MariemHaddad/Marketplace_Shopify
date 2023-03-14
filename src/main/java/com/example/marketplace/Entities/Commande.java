package com.example.marketplace.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Id
    private Long idCommande;
    @Temporal(TemporalType.DATE)
    private Date dateCommande;
    //private int ProductId;
    //private string ProductName;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus=OrderStatus.NEW;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    private Set<OrderLine> orderLines;



    //  @ManyToOne
    //@JsonIgnore
    //Delivery delivery;
    //  @ManyToMany
    //private Set<PromotionCode> promotionCodes;

    // @ManyToOne
    //Payment payment;

    ///dans la classe Payment
    // @OneToMany(cascade = CascadeType.ALL, mappedBy="payment")
    // private Set<order> orders;


    //relation avec facture Many Orders to one facture
    // @ManyToOne
    // Facture facture;

    //  @OneToMany(cascade = CascadeType.ALL, mappedBy="facture")
    //private Set<Order> order;

    // relation avec facture one to one
    @OneToOne
    @JsonIgnore
    private Facture facture;

    // relation avec User Many Orders to one user
    @ManyToOne
    @JsonIgnore
    User user;


}
