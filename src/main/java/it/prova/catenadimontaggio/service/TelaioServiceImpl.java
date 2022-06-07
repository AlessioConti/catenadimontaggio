package it.prova.catenadimontaggio.service;

import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.model.Automobile;
@Service
public class TelaioServiceImpl implements TelaioService {
	public void statisticheTelaio(Automobile input) {
		System.out.println("Il telaio dell'auto " +input.getModello()+ " è molto resistente");
	}
}
