package it.prova.catenadimontaggio.service;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface CatenaDiMontaggioService {
	
	public SlotCatenaDiMontaggio caricaCatena(Long id);
	public void avviaCatena(SlotCatenaDiMontaggio catenaDiMontaggio);
	public void aggiungiMacchinaACatena(Automobile input, SlotCatenaDiMontaggio catena);
}
