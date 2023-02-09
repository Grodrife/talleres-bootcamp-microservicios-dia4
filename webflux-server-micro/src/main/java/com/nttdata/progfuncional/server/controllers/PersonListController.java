package com.nttdata.progfuncional.server.controllers;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.progfuncional.server.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Flux<Person> flux = Flux.just(new Person("Nombre1", "Apellidos1", 20), new Person("Nombre5", "Apellidos5", 21))
				.delayElements(Duration.ofSeconds(2));

		return flux;
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Flux<Person> flux = Flux.just(new Person("Nombre2", "Apellidos2", 25), new Person("Nombre6", "Apellidos6", 33))
				.delayElements(Duration.ofSeconds(4));

		return flux;
	}

	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Flux<Person> flux = Flux.just(new Person("Nombre3", "Apellidos3", 23), new Person("Nombre7", "Apellidos7", 29))
				.delayElements(Duration.ofSeconds(1));

		return flux;
	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Flux<Person> flux = Flux.just(new Person("Nombre4", "Apellidos4", 27), new Person("Nombre8", "Apellidos8", 26))
				.delayElements(Duration.ofSeconds(3));

		return flux;
	}
}
