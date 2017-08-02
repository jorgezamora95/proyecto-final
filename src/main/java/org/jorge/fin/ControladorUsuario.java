/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorge.fin;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
        Usuario u=new Usuario("2","Jorge","sssdasdasd",d);
       repoUsuario.save(u);
       
        return "usuario guardado";

    }

    @RequestMapping(value="/usuario/{rfc}",
            method=RequestMethod.GET, headers={"Accept=application/json"})

    public Usuario buscarporid (@PathVariable String rfc){

        Usuario u=repoUsuario.findOne(rfc);
        return u;
     

} /*
    
    @RequestMapping(value="/usuario", method=RequestMethod.GET,
            headers={"Accept=Application/json"})
    
    public ArrayList<Usuario> buscartodos(){
        
        return (ArrayList<Usuario>) repoUsuario.findAll();
    }/*
    @RequestMapping(value="/usuario", method=RequestMethod.PUT,
            headers={"Accept=text/html"})
    public String actualizar(){
        
    }*/
    
}
