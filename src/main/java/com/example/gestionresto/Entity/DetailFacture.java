package com.example.gestionresto.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private Integer qte;
    private float prixTotale;
    private Integer pourcentageRemise;
    private Integer montantRemise;
    @ManyToOne
    Produit produit;
    @ManyToOne
    Facture facture;


}
