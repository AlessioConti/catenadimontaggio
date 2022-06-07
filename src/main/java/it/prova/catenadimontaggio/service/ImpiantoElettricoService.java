package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;

@Service
public class ImpiantoElettricoService implements ImpiantoElettrico {
	
	public void reportCorrente(Automobile input) {
		System.out.println("L'automobile " + input.getModello() + " ha l'impianto elettrico senza problemi");
	}
}
