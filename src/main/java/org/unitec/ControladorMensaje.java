/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gears
 */
@RestController
public class ControladorMensaje {
    @Autowired RepositorioMensajes repoMensa;
    
    //Primero hacemos el metodo para guardar
    @CrossOrigin
    @RequestMapping(value="/mensaje/{titulo}/{cuerpo}", 
            method=RequestMethod.POST, headers={"Accept=text/html"})
    public String guardar(@PathVariable String titulo,
            @PathVariable String cuerpo){
        
        repoMensa.save(new Mensaje(titulo,cuerpo));
        return "Mensaje guardado con exito";
        
        
    }
    //buscartodos
   @CrossOrigin
    @RequestMapping(value="/mensaje", method=RequestMethod.GET,
                    headers={"Accept=Application/json"})
    
    public String buscarTodos()throws Exception{
        
        ArrayList<Mensaje> mensajes=
               (ArrayList<Mensaje>)repoMensa.findAll();
        
        
       ObjectMapper maper=new ObjectMapper();
        return maper.writeValueAsString(mensajes);
        
        
    }
    //actualizsr
    @CrossOrigin
    @RequestMapping(value="/mensaje/{id}/{titulo}/{cuerpo}", method=RequestMethod.PUT,headers={"Accept=text/html"})
    
    public String actualizar(@PathVariable Long id, @PathVariable String titulo, @PathVariable String cuerpo){

        Mensaje mensa=new Mensaje(id,titulo, cuerpo);
            repoMensa.save(mensa);
return "Mensaje Actualizado con exito";


}
@CrossOrigin
    @RequestMapping(value="/mensaje/{id}", method=RequestMethod.DELETE,headers={"Accept=text/html"})
    
    public String borrar(@PathVariable Long id) throws Exception{

        Mensaje mensa=new Mensaje(id);
            repoMensa.delete(mensa);
return "Mensaje Borrado con exito";
 
    
    
}
    
      //ENVIAR
    @CrossOrigin
    @RequestMapping(value="/mensaje/{Nombre}/{Descripcion}", method=RequestMethod.POST,headers={"Accept=text/html"})
    
    public String enviar(@PathVariable Long id, @PathVariable String titulo, @PathVariable String cuerpo){

        Mensaje mensa=new Mensaje(id,titulo, cuerpo);
            repoMensa.save(mensa);
return "Mensaje Enviado con exito";
    }
}