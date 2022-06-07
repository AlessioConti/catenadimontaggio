package it.prova.catenadimontaggio.dao;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public interface SlotCatenaDiMontaggioDAO {
	
	public SlotCatenaDiMontaggio get(Long id);
	public void addAutomobileACatena(Automobile automobileInput, SlotCatenaDiMontaggio catenaInput);
}
