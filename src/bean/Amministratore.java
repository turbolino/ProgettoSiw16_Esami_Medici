package bean;

public class Amministratore {
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
