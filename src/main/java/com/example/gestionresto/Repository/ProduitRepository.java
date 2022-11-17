package com.example.gestionresto.Repository;

import com.example.gestionresto.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit ,Long> {
}
