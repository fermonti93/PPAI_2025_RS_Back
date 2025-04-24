package ppa.example.RS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppa.example.RS.model.EventoSismico;
import ppa.example.RS.repository.EventoSismicoRepository;

@Service
public class EventoSismicoService {
@Autowired
    private EventoSismicoRepository eventoSismicoRepository;

    public List<EventoSismico> findAll() {
        return eventoSismicoRepository.findAll();
    }
}
