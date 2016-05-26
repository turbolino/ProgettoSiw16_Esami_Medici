package dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import bean.TipologiaEsame;

@ManagedBean(name = "tipologieEsame")
@RequestScoped
public class TipologiaEsameDao implements Serializable {

   private static final long serialVersionUID = 1L;

   
   
   public List<TipologiaEsame> getTipologieDao(){
      ResultSet rs = null;
      PreparedStatement pst = null;
      Connection con = getConnection();
      String stm = "Select * from tipologiaesame";
      List<TipologiaEsame> tipologie = new ArrayList<TipologiaEsame>();
      try {   
         pst = con.prepareStatement(stm);
         pst.execute();
         rs = pst.getResultSet();

         while(rs.next()){
            TipologiaEsame tipologiaEsame = new TipologiaEsame();
            tipologiaEsame.setCodiceTipologia(rs.getString("codicetipologia"));
            tipologiaEsame.setCosto(rs.getString("costo"));
            tipologiaEsame.setDescrizione(rs.getString("descrizione"));
            tipologiaEsame.setNome(rs.getString("nometipologia"));
            tipologiaEsame.setPrerequisiti(rs.getString("prerequisiti"));
            tipologie.add(tipologiaEsame);				
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return tipologie;
   }

   public Connection getConnection(){
      Connection con = null;

      String url = "jdbc:postgresql://localhost/postgres";
      String user = "postgres";
      String password = "postgres";
      try {
         con = DriverManager.getConnection(url, user, password);
         System.out.println("Connection completed.");
      } catch (SQLException ex) {
         System.out.println(ex.getMessage());
      }
      finally{
      }
      return con;
   }

}