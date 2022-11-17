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
public class Rayon {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long idRayon;
     private String codeRayon;
     private String libelleRayon;
@OneToMany (mappedBy = "rayon")
private Set<Produit>Produits;
}
