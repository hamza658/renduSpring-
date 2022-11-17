package com.example.gestionresto.Controller;

import com.example.gestionresto.Entity.Client;
import com.example.gestionresto.Entity.Stock;
import com.example.gestionresto.Service.IStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Stock")
public class StockRestController {
    @Autowired
    IStockService iStockService;

    @GetMapping("/retrieveAllStocks")
    List<Stock> retrieveAllStocks() {return iStockService.retrieveAllStocks();}


    @PostMapping("/add")
    public Stock addStock (@RequestBody Stock stock){
        return iStockService.addStock(stock);
    }


    @PutMapping("/updateStock")
    public Stock updateStock (@RequestBody Stock stock  ){
        return iStockService.updateStock(stock);}

    @RequestMapping(value ="/{id}")
    public  Stock retrieveStock (@PathVariable("id")Long id){
        return iStockService.retrieveStock(id);
    }
}
