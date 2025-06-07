package ppa.example.RS.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EstadoSismo {
    String Nombre;
    
    public EstadoSismo(String nombre){
        this.Nombre=nombre;
    };
    public EstadoSismo(){};
}
