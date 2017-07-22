/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorge.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
@CrossOrigin
public class ControladorUsuario {
    @Autowired RepositorioUsuario repoUsuario;
    @RequestMapping(value="/usuario", method=RequestMethod.GET, headers={"Accept=text/html"})
    public String guardarUsuario(){
        System.out.println("antes");
        Direccion d=new Direccion("calle 21", "ecatepec",121212l);
        Usuario u=new Usuario("1","Jorge","sssdasdasd",d);
       repoUsuario.save(u);
       
        return "usuario guardado";
    }
    
}
