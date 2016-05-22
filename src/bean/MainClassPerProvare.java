package bean;

import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClassPerProvare {

	public static void main(String[] args) {
//		org.apache.log4j.BasicConfigurator.configure();
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tipologiaEsame_unit");
//		EntityManager em = emf.createEntityManager();
//		
//		
//		TipologiaEsame tipologiaEsame = new TipologiaEsame();
//		tipologiaEsame.setCodiceTipologia("1148");
//		tipologiaEsame.setCosto("50");
//		tipologiaEsame.setDescrizione("AAAa wonderful bla bla");
//		tipologiaEsame.setNome("ESAME DEL CAZZO");
//		tipologiaEsame.setPrerequisiti("NONE");
//		
//		
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//
//		em.persist(tipologiaEsame);
//		
//		//em.persist(product1);
//		tx.commit();		
//
//		em.close();
//		emf.close();
		
		
		org.apache.log4j.BasicConfigurator.configure();
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tipologiaEsame_unit");
		EntityManager em = emf.createEntityManager();
		
		
		Esame a = new Esame();
		a.setDataEsame(new Date(10101));
//		a.setPassword("50");
//		a.setUsername("AAAa wonderful bla bla");
//		a.setNome("ESAME DEL CAZZO");
		
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		em.persist(a);
		
		//em.persist(product1);
		tx.commit();		

		em.close();
		emf.close();
		
	}

}
