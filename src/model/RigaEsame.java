package bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RigaEsame {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idRigaEsame;
private String chiave;
private String valore;



public String getChiave() {
	return chiave;
}
public void setChiave(String chiave) {
	this.chiave = chiave;
}
public String getValore() {
	return valore;
}
public void setValore(String valore) {
	this.valore = valore;
}

	
}
