package ppa.example.RS.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class EventoSismico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Data fechaHoraFin;
    private Data fechaHoraOcurrencia;
    private double latitudEpicentro;
    private double latitudHipocetro;
    private double longitudEpicentro;
    private double longitudHipocentro;
    private int valorMagnitud;


    //constructor del evento
    public EventoSismico(Data ferchaHoraFin, Data ferchaHoraOcurrencia, double latitudEpicentro,
    double latitudHipocetro, double longitudEpicentro, double longitudHipocentro,
    int valorMagnitud) {
        this.fechaHoraFin = ferchaHoraFin;
        this.fechaHoraOcurrencia = ferchaHoraOcurrencia;
        this.latitudEpicentro = latitudEpicentro;
        this.latitudHipocetro = latitudHipocetro;
        this.longitudEpicentro = longitudEpicentro;
        this.longitudHipocentro = longitudHipocentro;
        this.valorMagnitud = valorMagnitud;
    }


}
