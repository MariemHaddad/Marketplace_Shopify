package com.example.marketplace.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLine {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idOrderLine;
    private Long productreference;

    private Integer quantity;



    private Long orderTotal;

    //  @ManyToOne
    // Order order;

    // @ManyToOne
    // Cart cart;

    //relation between orderLine and Product One to One
    @JsonIgnore
    @OneToOne(mappedBy="orderLine")
    private Produit produit;

//Dans la classe Product
    //@OneToOne
//  private OrderLine orderLine;

}

