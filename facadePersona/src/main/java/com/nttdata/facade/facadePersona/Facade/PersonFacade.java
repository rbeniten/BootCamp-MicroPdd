package com.nttdata.facade.facadePersona.Facade;

import java.util.List;

import com.nttdata.facade.facadePersona.Classes.Person;
import com.nttdata.facade.facadePersona.Service.PersonService;

public class PersonFacade {
	
	private PersonService ps;

	public PersonFacade() {
		this.ps = new PersonService();
	}
	
	public List<Person> buscarPersonas() {
		return ps.getPeopleBetweenAges(20, 30);
	}
	

}
