package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Amministratore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAmministratore;
	private String nomeAmministratore;
	private String cognomeAmministratore;
	private String usernameAmministratore;
	private String passwordAmministratore;
	
	
	
	public Amministratore(String nome, String cognome, String username, String password) {
		this.nomeAmministratore = nome;
		this.cognomeAmministratore = cognome;
		this.usernameAmministratore = username;
		this.passwordAmministratore = password;
	}
	public Amministratore() {
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nomeAmministratore;
	}
	public void setNome(String nome) {
		this.nomeAmministratore = nome;
	}
	public String getCognome() {
		return cognomeAmministratore;
	}
	public void setCognome(String cognome) {
		this.cognomeAmministratore = cognome;
	}
	public String getUsername() {
		return usernameAmministratore;
	}
	public void setUsername(String username) {
		this.usernameAmministratore = username;
	}
	public String getPassword() {
		return passwordAmministratore;
	}
	public void setPassword(String password) {
		this.passwordAmministratore = password;
	}
	
}
