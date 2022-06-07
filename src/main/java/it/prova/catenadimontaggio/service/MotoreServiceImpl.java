package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class MotoreServiceImpl implements MotoreService {
	public void reportMotore(Automobile input) {
		System.out.println(
				"Il motore dell'auto " + input.getModello() + " è stato oliato e funziona di nuovo come prima");
	}
}
