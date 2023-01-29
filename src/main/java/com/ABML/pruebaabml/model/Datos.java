
package com.ABML.pruebaabml.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Datos {
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private int id;
   private String nombre;
   private String apellido;

    public Datos() {
    }

    public Datos(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
   
   
    
    
}
