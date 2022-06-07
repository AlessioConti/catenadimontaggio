package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ProvaSuStradaServiceImpl implements ProvaSuStradaService {
	public void testSuStrada(Automobile input) {
		System.out.println("I test su strada dell'auto modello " + input.getModello()
				+ " riportano un grado di pericolosità dello 0,4%");
	}
}
