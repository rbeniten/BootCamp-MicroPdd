package com.nttdata.decorador.decoradorPersona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.decorador.decoradorPersona.Interface.PersonDecorator;
import com.nttdata.decorador.decoradorPersona.Interface.Impl.PersonDecoratorImpl;
import com.nttdata.decorador.decoradorPersona.classes.Person;

@SpringBootApplication
public class DecoradorPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoradorPersonaApplication.class, args);
		
		Person person = new Person();
		person.setAltura(1.75);

		PersonDecorator decorator = new PersonDecoratorImpl(person);
		System.out.println("Altura: " + decorator.getAlturacm() + " cm");
		
	}

}
