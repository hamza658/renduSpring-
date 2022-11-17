package com.example.gestionresto.Controller;

import com.example.gestionresto.Entity.Produit;
import com.example.gestionresto.Entity.Stock;
import com.example.gestionresto.Service.IProduitService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/Produit")
public class ProduitRestController {

    IProduitService iProduitService;
    @GetMapping("/retrieveAllProduits")
    List<Produit> retrieveAllProduits() {return iProduitService.retrieveAllProduits();}



    @GetMapping("/{id}")
    public Produit retrieveProduit (@PathVariable("id")Long id){return iProduitService.retrieveProduit(id);}



    @PutMapping("/{idRayon}/{idStock}")
    public Produit addProduit (@RequestBody Produit p, @PathVariable Long idRayon, @PathVariable Long idStock)
    {return iProduitService.addProduit(p,idRayon,idStock);}



    @PutMapping("/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit, @PathVariable Long idStock)
    {  iProduitService.assignProduitToStock(idProduit,idStock);}
}
