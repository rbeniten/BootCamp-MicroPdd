package com.nttdata.proxy.proxyPersona.Classes;

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
	
	public String caminar() {
		return name + " está caminando";
	}
	
}
