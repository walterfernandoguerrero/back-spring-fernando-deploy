
package com.ABML.pruebaabml.service;

import com.ABML.pruebaabml.model.Datos;
import com.ABML.pruebaabml.repository.datosRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DatosService implements IDatasService {
    
    @Autowired
    public datosRepository datosRepo;

    @Override
    public List<Datos> verDatos() {
        return datosRepo.findAll();
    }

    @Override
    public void crearDatos(Datos dato) {
        datosRepo.save(dato);
    }

    @Override
    public void borrarDatos(int id) {
        datosRepo.deleteById(id);
    }

    @Override
    public Datos buscarDatos(int id) {
        return datosRepo.findById(id).orElse(null);
    }
    
}
