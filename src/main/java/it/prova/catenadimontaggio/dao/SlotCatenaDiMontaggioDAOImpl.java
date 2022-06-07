package it.prova.catenadimontaggio.dao;

import org.springframework.stereotype.Component;

import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
@Component
public class SlotCatenaDiMontaggioDAOImpl implements SlotCatenaDiMontaggioDAO {

	@Override
	public SlotCatenaDiMontaggio get(Long id) {
		for (SlotCatenaDiMontaggio catenaItem : DBMock.CATENE_DI_MONTAGGIO) {
			if (catenaItem.getId() == id)
				return catenaItem;
		}
		return null;
	}

	@Override
	public void addAutomobileACatena(Automobile automobileInput, SlotCatenaDiMontaggio catenaInput) {
		automobileInput.setSlotCatenaDiMontaggio(catenaInput);
		for (SlotCatenaDiMontaggio catenaItem : DBMock.CATENE_DI_MONTAGGIO) {
			if (catenaItem.getId() == catenaInput.getId())
				catenaItem.addToAutomobili(automobileInput);
		}

	}

}
