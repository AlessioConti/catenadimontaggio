package it.prova.catenadimontaggio;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
import it.prova.catenadimontaggio.service.CatenaDiMontaggioService;

@SpringBootApplication
public class CatenadimontaggioApplication implements CommandLineRunner{

	@Autowired
	private CatenaDiMontaggioService catenaDiMontaggioService;
	
	public static void main(String[] args) {
		SpringApplication.run(CatenadimontaggioApplication.class, args);
	}

	public void run(String... args) throws Exception{
		SlotCatenaDiMontaggio catenaDiProva = catenaDiMontaggioService.caricaCatena(1L);
		
		Automobile automobileDaInserire = new Automobile(16L, "Toyota", "Yaris", new Date());
		
		catenaDiMontaggioService.aggiungiMacchinaACatena(automobileDaInserire, catenaDiProva);
		
		catenaDiMontaggioService.avviaCatena(catenaDiProva);
	}

}
