package ppa.example.RS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppa.example.RS.model.EventoSismico;
import ppa.example.RS.repository.EventoSismicoRepository;

@Service
public class EventoSismicoService {
@Autowired
    private EventoSismicoRepository eventoSismicoRepository;
    
    // listado de todos los eventos sismicos
    public List<EventoSismico> findAll() {
        return eventoSismicoRepository.findAll();
    }
    // crear evento sismico
    public EventoSismico registrarSismo( EventoSismico eventoSismico ){
		return eventoSismicoRepository.save(eventoSismico);

    }
}
