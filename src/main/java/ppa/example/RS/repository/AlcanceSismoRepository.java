package ppa.example.RS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ppa.example.RS.model.AlcanceSismo;

@Repository
public interface AlcanceSismoRepository extends JpaRepository<AlcanceSismo, Long> {}
