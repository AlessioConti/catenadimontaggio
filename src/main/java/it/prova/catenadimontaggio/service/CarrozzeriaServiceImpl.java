package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class CarrozzeriaServiceImpl implements CarrozzeriaService {
	public void reportCarrozzeria(Automobile input) {
		System.out.println("La carrozzeria dell'auto " +input.getModello() + " è stata sistemata");
	}
}
