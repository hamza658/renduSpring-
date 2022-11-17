package com.example.gestionresto.Repository;

import com.example.gestionresto.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock ,Long> {
}
