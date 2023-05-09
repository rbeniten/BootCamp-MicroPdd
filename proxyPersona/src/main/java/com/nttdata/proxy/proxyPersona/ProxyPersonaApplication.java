package com.nttdata.proxy.proxyPersona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.proxy.proxyPersona.Classes.Person;
import com.nttdata.proxy.proxyPersona.Interface.PersonInterface;
import com.nttdata.proxy.proxyPersona.Proxy.PersonProxy;

@SpringBootApplication
public class ProxyPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyPersonaApplication.class, args);
		
		Person person = new Person("Juan", 25);
		PersonInterface personProxy = new PersonProxy(person);
		
		personProxy.caminar();
		
	}

}
