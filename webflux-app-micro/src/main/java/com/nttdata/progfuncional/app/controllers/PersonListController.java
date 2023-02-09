package com.nttdata.progfuncional.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nttdata.progfuncional.app.Person;
import com.nttdata.progfuncional.app.PersonService;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {

	@Autowired
	PersonService personService;

	@GetMapping("/person-list")
	public String personList(final Model model) {
		final Flux<Person> personList = personService.allPersons();
		model.addAttribute("personList", personList);
		return "personList";
	}

}
