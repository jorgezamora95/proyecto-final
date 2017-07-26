package org.jorge.fin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinApplication implements CommandLineRunner{
    @Autowired RepositorioUsuario repoU;

	public static void main(String[] args) {
		SpringApplication.run(FinApplication.class, args);
                
               
	}

    @Override
    public void run(String... strings) throws Exception {
         //tratare de probar el 1
               // Direccion d=new Direccion("nada","sanborns",123l);
               // Usuario u=new Usuario("1","Jorge","jorgezamora@gmail.com",d);
               Usuario buscarporid =repoU.findOne("1");
               System.out.println(buscarporid.getNombre()+ buscarporid.getMail());

         
                
    }
    
    
}
