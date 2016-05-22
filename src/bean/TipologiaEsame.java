package bean;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "findAllTipologiaEsame", query = "SELECT p FROM TipologiaEsame p")

public class TipologiaEsame {
	
	
	@Id 
	private String codiceTipologia;
	private String nomeTipologia;
	private String descrizione;
	private String costo;
	private String prerequisiti;
	
	public TipologiaEsame(String nome, String descrizione, String costo, String prerequisiti, String codiceTipologia) {
		this.nomeTipologia = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		this.prerequisiti = prerequisiti;
		this.codiceTipologia= codiceTipologia;
	}
	public TipologiaEsame() {
		
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
	public String getPrerequisiti() {
		return prerequisiti;
	}
	public void setPrerequisiti(String prerequisiti) {
		this.prerequisiti = prerequisiti;
	}
	public String getCodiceTipologia() {
		return codiceTipologia;
	}
	public void setCodiceTipologia(String codiceTipologia) {
		this.codiceTipologia = codiceTipologia;
	}
	
}
