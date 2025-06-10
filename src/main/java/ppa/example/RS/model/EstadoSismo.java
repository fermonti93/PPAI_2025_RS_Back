package ppa.example.RS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EstadoSismo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    String Nombre;
    
    public EstadoSismo(String nombre){
        this.Nombre=nombre;
    };
    public EstadoSismo(){};
}
