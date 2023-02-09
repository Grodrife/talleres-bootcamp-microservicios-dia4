package com.nttdata.progfuncional.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public Flux<Person> allPersons() {
		Flux<Person> flux = WebClient.create("http://localhost:8080/person-list-1").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> flux2 = WebClient.create("http://localhost:8080/person-list-2").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> flux3 = WebClient.create("http://localhost:8080/person-list-3").get().retrieve()
				.bodyToFlux(Person.class);
		Flux<Person> flux4 = WebClient.create("http://localhost:8080/person-list-4").get().retrieve()
				.bodyToFlux(Person.class);

		flux.merge(flux2, flux3, flux4);
//		List<Person> lista = new ArrayList<>();
//		lista.addAll(flux1.collect(Collectors.toList()).share().block());
//		lista.addAll(flux2.collect(Collectors.toList()).share().block());
//		lista.addAll(flux3.collect(Collectors.toList()).share().block());
//		lista.addAll(flux4.collect(Collectors.toList()).share().block());

		return flux;
	}

}
