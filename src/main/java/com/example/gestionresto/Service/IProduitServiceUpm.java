package com.example.gestionresto.Service;

import com.example.gestionresto.Entity.Fournisseur;
import com.example.gestionresto.Entity.Produit;
import com.example.gestionresto.Entity.Rayon;
import com.example.gestionresto.Entity.Stock;
import com.example.gestionresto.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IProduitServiceUpm implements IProduitService{
 @Autowired
    ProduitRepository produitRepository;
    @Autowired
    StockRepository stockRepository;
    @Autowired
    RayonRepository rayonRepository;
    @Autowired
    FournisseurRepository fournisseurRepository;


    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        Stock stock = stockRepository.findById(idStock).get();
        Rayon rayon = rayonRepository.findById(idRayon).get();
        if(rayon != null && stock !=null){
            p.setStock(stock);
            return produitRepository.save(p);
        }
        return null;

    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById((Long) id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Stock stock = stockRepository.findById(idStock).get();
        Produit produit = produitRepository.findById(idProduit).get();

        if((stock != null) && (produit != null)){
            produit.setStock(stock);
            produitRepository.save(produit);


        }
    }
    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId){
        Fournisseur fournisseur= fournisseurRepository.findById(fournisseurId).orElse(null);
        Produit produit= produitRepository.findById(produitId).orElse(null);
        if(produit != null && fournisseur !=null )    {

        }
    }

}
