/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import ConexaoDB.ConexaoDB;
import LM_bean.LM_Series;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LLM
 */
public class LM_SeriesDAO {
    public static void adicionar(LM_Series series){
        String sql="INSERT INTO LM_Series(LM_serieEspecifica,LM_professorResponsavel,LM_TotalDeAlunos,LM_turnoDaAula,LM_SalaDeAula) VALUES (?,?,?,?,?)";
    Connection conexao=ConexaoDB.retornaConexao();
        
        
        try{
            PreparedStatement stmt=conexao.prepareStatement(sql);
          stmt.setString(1, series.getLM_serieEspecifica());
          stmt.setString(2, series.getLM_professorResponsavel());
          stmt.setInt(3, series.getLM_TotalDeAlunos());
          stmt.setString(4, series.getLM_turnoDaAula());
          stmt.setString(5, series.getLM_SalaDeAula());
          
          
       stmt.execute();
            System.err.println("Produto adicionado com Sucesso");
            
            }catch(Exception e){
                System.err.println("Erro no Adicionar Produto: "+e.toString());
            
            }
      
      
    }
    
}
