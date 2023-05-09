package com.nttdata.proxy.proxyPersona.Proxy;

import com.nttdata.proxy.proxyPersona.Classes.Person;
import com.nttdata.proxy.proxyPersona.Interface.PersonInterface;

public class PersonProxy implements PersonInterface{
	
	private Person person;
	
	public PersonProxy(Person pers) {
		this.person = pers;
	}
	
	public void before() {
        System.out.println("Calentando para salir a andar");
    }

    public void after() {
        System.out.println("Estiramientos despues de salir a andar");
    }

	@Override
	public String caminar() {
		before();
		String caminar = person.caminar();
		System.out.println(caminar);
		after();
		return caminar;
	}

}
