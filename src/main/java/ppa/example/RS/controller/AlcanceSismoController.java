package ppa.example.RS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ppa.example.RS.service.AlcanceSismoService;
import ppa.example.RS.model.AlcanceSismo;

@RestController
@RequestMapping("/sismo/alcance")
public class AlcanceSismoController {
    @Autowired
    private AlcanceSismoService alcanceSismoService;

    // Crear alcance sismo
    @PostMapping
    public ResponseEntity <AlcanceSismo> crearAlcance(@RequestBody AlcanceSismo alcanceSismo) {
        AlcanceSismo nuevoAlcanceSismo = alcanceSismoService.guardarAlcanceSismo(alcanceSismo);
        return ResponseEntity.ok(nuevoAlcanceSismo);
    }
}
