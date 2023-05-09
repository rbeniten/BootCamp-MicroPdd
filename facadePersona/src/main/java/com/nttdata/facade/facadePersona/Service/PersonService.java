package com.nttdata.facade.facadePersona.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nttdata.facade.facadePersona.Classes.Person;


public class PersonService {
	
	private List<Person> listaPersonas = new ArrayList<>();

    public PersonService() {
    	listaPersonas.add(new Person("Pepe", 22));
    	listaPersonas.add(new Person("Maria", 30));
    	listaPersonas.add(new Person("Lola", 19));
    	listaPersonas.add(new Person("Ruben", 24));
    	listaPersonas.add(new Person("Sandra", 31));
    }
    
    public List<Person> getPeopleBetweenAges(int min, int max) {
    	return listaPersonas.stream()
    		    .filter(person -> person.getAge() >= min && person.getAge() <= max)
    		    .collect(Collectors.toList());
    }

}
