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

public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;


    @ManyToOne
    Rayon rayon;
    @ManyToOne
    Stock stock;
    @ManyToMany
    private Set<Fournisseur>fournisseurs;
    @OneToOne
    private DetailProduit detailProduit;
    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture>detailFactures ;




}
