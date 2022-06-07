package it.prova.catenadimontaggio.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;

public class DBMock {
	
	public static final List<SlotCatenaDiMontaggio> CATENE_DI_MONTAGGIO = new ArrayList<SlotCatenaDiMontaggio>();
	
	static {
		SlotCatenaDiMontaggio slot1 = new SlotCatenaDiMontaggio(1L, "Prova1", "Tentativo1");
		Automobile auto1 = new Automobile(10L, "Ferrari", "Telaio1", new Date());
		slot1.addToAutomobili(auto1);
		Automobile auto2 = new Automobile(11L, "Ducati", "Telaio2", new Date());
		slot1.addToAutomobili(auto2);
		Automobile auto3 = new Automobile(12L, "Abbath", "Telaio3", new Date());
		slot1.addToAutomobili(auto3);
		
		CATENE_DI_MONTAGGIO.add(slot1);
	}
}
