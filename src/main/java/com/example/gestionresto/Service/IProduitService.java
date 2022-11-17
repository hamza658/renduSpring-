package com.example.gestionresto.Service;

import com.example.gestionresto.Entity.Produit;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IProduitService {
    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);

    void assignProduitToStock(Long idProduit, Long idStock);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId);
}
