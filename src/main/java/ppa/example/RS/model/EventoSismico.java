package ppa.example.RS.model;

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
    private Data ferchaHoraFin;
    private Data ferchaHoraOcurrencia;
    private double latitudEpicentro;
    private double latitudHipocetro;
    private double longitudEpicentro;
    private double longitudHipocentro;
    private int valorMagnitud;

}
