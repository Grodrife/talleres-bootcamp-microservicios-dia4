package com.nttdata.progfuncional.app;

import reactor.core.publisher.Flux;

public interface PersonService {

	Flux<Person> allPersons();

}
