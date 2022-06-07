package it.prova.catenadimontaggio.model;

import java.util.Date;

public class Automobile {
	private Long id;
	private String modello;
	private String telaio;
	private Date dataProduzione;
	
	private SlotCatenaDiMontaggio slotCatenaDiMontaggio;

	public Automobile(Long id, String modello, String telaio, Date dataProduzione,
			SlotCatenaDiMontaggio slotCatenaDiMontaggio) {
		super();
		this.id = id;
		this.modello = modello;
		this.telaio = telaio;
		this.dataProduzione = dataProduzione;
		this.slotCatenaDiMontaggio = slotCatenaDiMontaggio;
	}
	
	public Automobile(Long id, String modello, String telaio, Date dataProduzione) {
		super();
		this.id = id;
		this.modello = modello;
		this.telaio = telaio;
		this.dataProduzione = dataProduzione;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTelaio() {
		return telaio;
	}

	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}

	public Date getDataProduzione() {
		return dataProduzione;
	}

	public void setDataProduzione(Date dataProduzione) {
		this.dataProduzione = dataProduzione;
	}

	public SlotCatenaDiMontaggio getSlotCatenaDiMontaggio() {
		return slotCatenaDiMontaggio;
	}

	public void setSlotCatenaDiMontaggio(SlotCatenaDiMontaggio slotCatenaDiMontaggio) {
		this.slotCatenaDiMontaggio = slotCatenaDiMontaggio;
	}
	
	
}
