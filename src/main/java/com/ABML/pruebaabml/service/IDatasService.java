
package com.ABML.pruebaabml.service;

import com.ABML.pruebaabml.model.Datos;
import java.util.List;



public interface IDatasService {
    public List<Datos>verDatos();
    public void crearDatos(Datos dato);
    public void borrarDatos(int id);
    public Datos buscarDatos(int id);
}
