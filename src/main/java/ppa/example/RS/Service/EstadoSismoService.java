package ppa.example.RS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppa.example.RS.model.EstadoSismo;
import ppa.example.RS.repository.EstadoSismoRepository;

@Service
public class EstadoSismoService {
@Autowired
    private EstadoSismoRepository estadoSismoRepository;

    //crear nuevo Estado
    public EstadoSismo guardarEstado(EstadoSismo estadoSismo){
        
        return estadoSismoRepository.save(estadoSismo);
    }

}
