package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
@Component
public class AutomobileDAOImpl implements AutomobileDAO {

	@Override
	public void insert(Automobile input) {
		for(SlotCatenaDiMontaggio catenaItem : DBMock.CATENE_DI_MONTAGGIO) {
			if(catenaItem.getId() == input.getSlotCatenaDiMontaggio().getId())
				catenaItem.addToAutomobili(input);
		}
	}

}
