/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import LM_Classes.LM_Series;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LLM
 */
public class LM_SeriesDAO {
    public static void adicionar(LM_Series series){
        String sql="INSERT INTO LM_Series(LM_serieEspecifica,LM_professorResponsavel,LM_TotalDeAlunos,LM_turnoDaAula,LM_SalaDeAula) VALUES (?,?,?,?,?)";
    Connection conexao=null;
     PreparedStatement stmt=null;
     
      try{
          stmt.setString(1, series.getLM_serieEspecifica());
          stmt.setString(2, series.getLM_professorResponsavel());
          stmt.setInt(3, series.getLM_TotalDeAlunos());
          stmt.setString(4, series.getLM_turnoDaAula());
          stmt.setString(5, series.getLM_SalaDeAula());
          
          
      stmt.execute();
            System.out.println("Produto adicionado com Sucesso");
  }catch(Exception e){
                System.out.println("Erro no Adicionar Produto: "+e.toString());
            
            }
      
      
    }
    
}
