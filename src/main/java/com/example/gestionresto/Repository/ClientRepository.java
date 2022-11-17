package com.example.gestionresto.Repository;

import com.example.gestionresto.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
