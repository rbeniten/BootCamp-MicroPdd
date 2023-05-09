package com.nttdata.decorador.decoradorPersona.Interface.Impl;

import com.nttdata.decorador.decoradorPersona.Interface.PersonDecorator;
import com.nttdata.decorador.decoradorPersona.classes.Person;

public class PersonDecoratorImpl implements PersonDecorator{
	
	protected Person person;

	public PersonDecoratorImpl(Person person) {
		super();
		this.person = person;
	}
	
	@Override
	public int getAlturacm() {
		return (int) (person.getAltura() * 100);
	}
	

}
