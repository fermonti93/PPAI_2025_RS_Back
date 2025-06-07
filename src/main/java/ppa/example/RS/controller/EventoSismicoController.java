package ppa.example.RS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ppa.example.RS.Service.EventoSismicoService;
import ppa.example.RS.model.EventoSismico;


@RestController
@RequestMapping("/sismo")
public class EventoSismicoController {
    @Autowired
    private EventoSismicoService eventoSismicoService;

    //debolver todos los eventos
    @GetMapping
    public ResponseEntity  <List<EventoSismico>>  listarEventos() {
        List <EventoSismico> evento= eventoSismicoService.findAll();
        return ResponseEntity.ok(evento);
    }

    //cear evento sismico
    @PostMapping
    public ResponseEntity <EventoSismico> crearevento(@RequestBody EventoSismico eventoSismico){
       
        EventoSismico nuevoEventoSismico =eventoSismicoService.registrarSismo(eventoSismico) ;
		return ResponseEntity.ok(nuevoEventoSismico);
    }
}
