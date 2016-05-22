package bean;

import java.util.ArrayList;

public class TipologiaEsame {
	
	private String codiceTipologia;
	private String nomeTipologia;
	private String descrizione;
	private String costo;
	private ArrayList<String> prerequisiti;
	
	
	public TipologiaEsame(String nome, String descrizione, String costo, ArrayList<String> prerequisiti, String codiceTipologia) {
		this.nomeTipologia = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.prerequisiti = prerequisiti;
		this.codiceTipologia= codiceTipologia;
	}
	public String getNome() {
		return nomeTipologia;
	}
	public void setNome(String nome) {
		this.nomeTipologia = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public String getCosto() {
		return costo;
	}
	public void setCosto(String costo) {
		this.costo = costo;
	}
	public ArrayList<String> getPrerequisiti() {
		return prerequisiti;
	}
	public void setPrerequisiti(ArrayList<String> prerequisiti) {
		this.prerequisiti = prerequisiti;
	}
	public String getCodiceTipologia() {
		return codiceTipologia;
	}
	public void setCodiceTipologia(String codiceTipologia) {
		this.codiceTipologia = codiceTipologia;
	}
	
}
