package com.nttdata.patterndesign.patterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nttdata.patterndesign.patterns.classes.MyConfig;
import com.nttdata.patterndesign.patterns.classes.Person;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Person pBuilder = Person.builder().name("Pepe").age(21).build();
		System.out.println("Prueba Builder");
		System.out.println(pBuilder + " -> " + pBuilder.getName() + ", " + pBuilder.getAge());
		
        
        // Obtiene una instancia del bean singleton
        Person singletonPerson1 = (Person) context.getBean("getSingletonPerson");
        Person singletonPerson2 = (Person) context.getBean("getSingletonPerson");
        
        //Si cambio el nombre en 1, la cambio en otra
        singletonPerson2.setName("Juan");
        
        //Como puedes observar en la consola, la referencia en memoria de estos dos instancias son iguales
        System.out.println("Prueba Singleton");
        
        System.out.println(singletonPerson1 + " -> " + singletonPerson1.getName() + ", " + singletonPerson1.getAge());
		System.out.println(singletonPerson2 + " -> "+ singletonPerson2.getName() + ", " + singletonPerson2.getAge());
        
        
        // Obtiene dos instancias del bean prototipo
        Person prototypePerson1 = (Person) context.getBean("getPrototypePerson");
        Person prototypePerson2 = (Person) context.getBean("getPrototypePerson");
        prototypePerson1.setName("Juan");
        prototypePerson2.setName("Pedro");
        
        System.out.println("Prueba Prototype");
        
        System.out.println(prototypePerson1 + " -> " + prototypePerson1.getName() + ", " + prototypePerson1.getAge());
        System.out.println(prototypePerson2 + " -> " + prototypePerson2.getName() + ", " + prototypePerson2.getAge());
        
        
	}

}
