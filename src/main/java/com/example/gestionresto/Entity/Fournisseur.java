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
public class Fournisseur {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private Long idFournisseur;
    private String sodeFournisseur;
    private String libelleFournisseur;


}
