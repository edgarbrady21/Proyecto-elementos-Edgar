/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControladorHola {
    @Autowired RepositorioDepartamento repoDepo;
    @CrossOrigin
    @RequestMapping("/hola")
    
    public String reprobados(){
        
        return "Mi primer Servicio Web"+repoDepo.findOne(1L).getNombre();
        
        
    }
    
}
