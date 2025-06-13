package ppa.example.RS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ppa.example.RS.service.AlcanceSismoService;
import ppa.example.RS.model.AlcanceSismo;

@RestController
@RequestMapping("/alcance")
public class AlcanceSismoController {
    @Autowired
    private AlcanceSismoService alcanceSismoService;

    // Crear alcance
    @PostMapping
    public ResponseEntity <AlcanceSismo> crearAlcance(@RequestBody AlcanceSismo alcanceSismo) {
        AlcanceSismo nuevoAlcanceSismo = alcanceSismoService.guardarAlcanceSismo(alcanceSismo);
        return ResponseEntity.ok(nuevoAlcanceSismo);
    }

    // Listar alcances
    @GetMapping
    public ResponseEntity <List<AlcanceSismo>> listarAlcances() {
        List<AlcanceSismo> alcances = alcanceSismoService.listarAlcanceSismo();
        return ResponseEntity.ok(alcances);
    }
}
