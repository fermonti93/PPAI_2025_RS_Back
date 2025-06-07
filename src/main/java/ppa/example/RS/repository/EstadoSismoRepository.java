package ppa.example.RS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ppa.example.RS.model.EstadoSismo;

@Repository
public interface EstadoSismoRepository extends JpaRepository<EstadoSismo, Long> {

}
