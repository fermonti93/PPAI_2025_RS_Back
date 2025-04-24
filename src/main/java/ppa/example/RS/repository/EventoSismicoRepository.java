package ppa.example.RS.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ppa.example.RS.model.EventoSismico;

@Repository
public interface EventoSismicoRepository extends JpaRepository<EventoSismico, Long> {
   
}
