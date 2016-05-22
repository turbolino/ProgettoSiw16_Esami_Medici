package bean;

import java.sql.Date;
import java.util.HashMap;

public class Esame {

	private Paziente paziente;
	private Date dataPrenotazione;
	private Date dataEsame;
	private Medico medico;
	private TipologiaEsame tipologiaEsame;
	private HashMap<String, String> risultati;
	
	
	
	public Esame(Paziente paziente, Date dataPrenotazione, Medico medico, TipologiaEsame tipologiaEsame) {
		this.paziente = paziente;
		this.dataPrenotazione = dataPrenotazione;
		this.medico = medico;
		this.tipologiaEsame = tipologiaEsame;
	}
	
	public Paziente getPaziente() {
		return paziente;
	}
	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}
	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	public Date getDataEsame() {
		return dataEsame;
	}
	public void setDataEsame(Date dataEsame) {
		this.dataEsame = dataEsame;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public TipologiaEsame getTipologiaEsame() {
		return tipologiaEsame;
	}
	public void setTipologiaEsame(TipologiaEsame tipologiaEsame) {
		this.tipologiaEsame = tipologiaEsame;
	}
	public HashMap<String, String> getRisultati() {
		return risultati;
	}
	public void setRisultati(HashMap<String, String> risultati) {
		this.risultati = risultati;
	}
	
	
	
}
