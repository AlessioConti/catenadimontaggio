package it.prova.catenadimontaggio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.catenadimontaggio.dao.SlotCatenaDiMontaggioDAO;
import it.prova.catenadimontaggio.model.Automobile;
import it.prova.catenadimontaggio.model.SlotCatenaDiMontaggio;
@Service
public class CatenaDiMontaggioServiceImpl implements CatenaDiMontaggioService {
	@Autowired
	private CarrozzeriaService carrozzeriaService;
	@Autowired
	private ImpiantoElettricoService impiantoElettricoService;
	@Autowired
	private MotoreService motoreService;
	@Autowired
	private ProvaSuStradaService provaSuStradaService;
	@Autowired
	private TelaioService telaioService;
	@Autowired
	private SlotCatenaDiMontaggioDAO slotCatenaDiMontaggioDAO;
	
	@Override
	public void avviaCatena(SlotCatenaDiMontaggio catenaDiMontaggio) {
		System.out.println("Inizio catena........................");
		System.out.println("*************************************");
		for(Automobile autoItem : catenaDiMontaggio.getAutomobili()) {
			System.out.println("Inizio controlli dell'auto modello " +autoItem.getModello());
			telaioService.statisticheTelaio(autoItem);
			motoreService.reportMotore(autoItem);
			impiantoElettricoService.reportCorrente(autoItem);
			carrozzeriaService.reportCarrozzeria(autoItem);
			provaSuStradaService.testSuStrada(autoItem);
			System.out.println("Termine controlli dell'auto modello" +autoItem.getModello());
			System.out.println("*************************************");
		}
		System.out.println("*************************************");
		System.out.println("Fine catena........................");
	}
	
	@Override
	public SlotCatenaDiMontaggio caricaCatena(Long id) {
		return slotCatenaDiMontaggioDAO.get(id);
	}



	@Override
	public void aggiungiMacchinaACatena(Automobile input, SlotCatenaDiMontaggio catena) {
		slotCatenaDiMontaggioDAO.addAutomobileACatena(input, catena);
	}

}
