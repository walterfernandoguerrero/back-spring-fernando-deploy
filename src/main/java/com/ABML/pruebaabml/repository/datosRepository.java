
package com.ABML.pruebaabml.repository;


import com.ABML.pruebaabml.model.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface datosRepository extends JpaRepository<Datos, Integer> {
    
}
