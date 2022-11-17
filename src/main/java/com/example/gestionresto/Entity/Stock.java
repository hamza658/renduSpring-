package com.example.gestionresto.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStock;
    private Integer qteStock;
    private Integer qteMin;
    private String libelleStock;


    @OneToMany(mappedBy = "stock")
    private Set<Produit> Produits;

 }
