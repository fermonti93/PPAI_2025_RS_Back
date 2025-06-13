package ppa.example.RS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppa.example.RS.model.AlcanceSismo;
import ppa.example.RS.repository.AlcanceSismoRepository;

@Service
public class AlcanceSismoService {
    @Autowired
    private AlcanceSismoRepository alcanceSismoRepository;

    public AlcanceSismo guardarAlcanceSismo(AlcanceSismo alcanceSismo) {
        return alcanceSismoRepository.save(alcanceSismo);
    }

    public List<AlcanceSismo> listarAlcanceSismo() {
        return alcanceSismoRepository.findAll();
    }
}
