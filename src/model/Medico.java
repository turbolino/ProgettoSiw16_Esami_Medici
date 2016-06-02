package bean;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Medico {
	private String nomeMedico;
	private String cognomeMedico;
	@Id
	private String idMedico;
	private String specializzazione;
	
	
	
	public Medico(String nome, String cognome, String id, String specializzazione) {
		this.nomeMedico = nome;
		this.cognomeMedico = cognome;
		this.idMedico = id;
		this.specializzazione = specializzazione;
	}
	public Medico() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nomeMedico;
	}
	public void setNome(String nome) {
		this.nomeMedico = nome;
	}
	public String getCognome() {
		return cognomeMedico;
	}
	public void setCognome(String cognome) {
		this.cognomeMedico = cognome;
	}
	public String getId() {
		return idMedico;
	}
	public void setId(String id) {
		this.idMedico = id;
	}
	public String getSpecializzazione() {
		return specializzazione;
	}
	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

}
