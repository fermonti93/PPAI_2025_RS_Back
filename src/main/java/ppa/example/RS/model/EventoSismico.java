package ppa.example.RS.model;


import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class EventoSismico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private LocalDateTime fechaHoraFin;
    private LocalDateTime fechaHoraOcurrencia;
    private double latitudEpicentro;
    private double latitudHipocetro;
    private double longitudEpicentro;
    private double longitudHipocentro;
    private int valorMagnitud;

    //constructor del evento
    public EventoSismico(LocalDateTime fechaHoraFin, LocalDateTime fechaHoraOcurrencia, double latitudEpicentro,
    double latitudHipocetro, double longitudEpicentro, double longitudHipocentro,
    int valorMagnitud) {
        this.fechaHoraFin = fechaHoraFin;
        this.fechaHoraOcurrencia = fechaHoraOcurrencia;
        this.latitudEpicentro = latitudEpicentro;
        this.latitudHipocetro = latitudHipocetro;
        this.longitudEpicentro = longitudEpicentro;
        this.longitudHipocentro = longitudHipocentro;
        this.valorMagnitud = valorMagnitud;
    }

    public EventoSismico() {
    }
}
