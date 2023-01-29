
package com.ABML.pruebaabml.controller;


import com.ABML.pruebaabml.model.Datos;
import com.ABML.pruebaabml.service.IDatasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("walter")
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class datosController {
    @Autowired
    private IDatasService datosServ; //mi variable 
    
    //end point 
    
    //crear datos 
    @PostMapping ("/nuevodato")
    public void crearDatos(@RequestBody Datos dato){
        datosServ.crearDatos(dato);
    }
    
    //listar Personas
    @GetMapping("/verDatos")
    @ResponseBody
    public List<Datos>verDatos(){
        return datosServ.verDatos();
    }
    
    //borrar datos 
    @DeleteMapping("/delete/{id}")
    public void borrarDatos(@PathVariable int id){
        datosServ.borrarDatos(id);
    }
    
    //traer Datos
    @GetMapping("/traerUnDato/{id}")
    public Datos buscarDatos(@PathVariable int id){
        return datosServ.buscarDatos(id);
    }
}
