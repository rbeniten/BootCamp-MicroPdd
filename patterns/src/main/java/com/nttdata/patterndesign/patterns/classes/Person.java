package com.nttdata.patterndesign.patterns.classes;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Component @Builder @NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Person{
	
	private String name;
	private int age;
	
	
}
