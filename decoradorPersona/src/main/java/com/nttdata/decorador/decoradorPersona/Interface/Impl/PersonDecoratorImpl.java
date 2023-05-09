package com.nttdata.decorador.decoradorPersona.Interface.Impl;

import com.nttdata.decorador.decoradorPersona.Interface.PersonDecorator;
import com.nttdata.decorador.decoradorPersona.classes.Person;

public class PersonDecoratorImpl implements PersonDecorator{
	
	protected Person person;
	protected double altura;

	public PersonDecoratorImpl(Person person, double atura) {
		super();
		this.person = person;
		this.altura = atura;
	}
	
	@Override
	public int getAlturacm() {
		return (int) (this.altura * 100);
	}
	

}
