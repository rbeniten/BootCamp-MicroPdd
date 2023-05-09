package com.nttdata.patterndesign.patterns.classes;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configurable
public class MyConfig {
	

    @Bean()
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person getSingletonPerson() {
        return new Person("Ruben", 22);
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Person getPrototypePerson() {
    	return new Person();
    }

}
