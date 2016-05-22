package bean;

import java.sql.Date;
import java.util.HashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Esame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEsame;
	@Column(nullable = true)
	private Paziente paziente;
	@Column(nullable = true)
	private Date dataPrenotazione;
	@Column(nullable = true)
	private Date dataEsame;
	@Column(nullable = true)
	private Medico medico;
	@Column(nullable = true)
	private TipologiaEsame tipologiaEsame;
	@Column(nullable = true)
	private HashMap<String, String> risultati;
	
	
	
	public Esame(Paziente paziente, Date dataPrenotazione, Medico medico, TipologiaEsame tipologiaEsame) {
		this.paziente = paziente;
		this.dataPrenotazione = dataPrenotazione;
		this.medico = medico;
		this.tipologiaEsame = tipologiaEsame;
	}
	
	public Esame() {
		// TODO Auto-generated constructor stub
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
