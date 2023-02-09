package com.nttdata.progfuncional.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

	private String nombre;

	private String apellidos;

	private int edad;

	public Person(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
}
