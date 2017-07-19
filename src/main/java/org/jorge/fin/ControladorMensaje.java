/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jorge.fin;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
@CrossOrigin
public class ControladorMensaje {
//caso post 
     @Autowired RepositorioMensaje repoMensaje;
    @RequestMapping(value="/mensaje", method=RequestMethod.POST, headers={"application/json"})
    public Estatus guardar(@RequestBody String json){
        System.out.println(json);
        
        Estatus e=new Estatus();
        e.setSuccess(true);
        return e;
    }
    @RequestMapping(value="/mensaje", method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Mensaje> getTodos(){
         
        return (ArrayList<Mensaje>) repoMensaje.findAll();
    }
    @RequestMapping(value="/mensaje", method=RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json)throws Exception{
        Estatus e=new Estatus();
        e.setSuccess(true);
                 ObjectMapper  maper=new ObjectMapper();
         Mensaje mensa=        maper.readValue(json, Mensaje.class);
         repoMensaje.save(mensa);
         System.out.println("El titulo es: "+mensa.getTitulo()+ " el cuerpo es:"+mensa.getCuerpo());
        return e;
    }
}