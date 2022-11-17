package com.example.gestionresto.Entity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailProduit;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDernierModification;
    @Enumerated(EnumType.STRING)
    CategorieProduit categorieProduit;
    @OneToOne(mappedBy = "detailProduit")
    private Produit produit;
}
