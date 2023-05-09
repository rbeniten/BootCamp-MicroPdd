package com.nttdata.facade.facadePersona;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.facade.facadePersona.Classes.Person;
import com.nttdata.facade.facadePersona.Facade.PersonFacade;
import com.nttdata.facade.facadePersona.Service.PersonService;

@SpringBootApplication
public class FacadePersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacadePersonaApplication.class, args);
		
		PersonFacade pf = new PersonFacade();
		List<Person> listaPersonas = pf.buscarPersonas();
		
		
		listaPersonas.forEach(x -> System.out.println(x.getName()+ "--"+x.getAge()));
		
	}

}
