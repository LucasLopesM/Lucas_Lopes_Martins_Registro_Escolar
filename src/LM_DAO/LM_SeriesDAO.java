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
import java.sql.ResultSet;
import java.util.ArrayList;

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
            public static ArrayList<LM_Series> listar(){

             ArrayList<LM_Series> series = new ArrayList<>();

                String sql = "SELECT * FROM LM_Series";
                
                 try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while(dados.next()){
                LM_Series temporario = new LM_Series();
                temporario.setId(dados.getInt("id"));
                temporario.setLM_serieEspecifica(dados.getString("LM_serieEspecifica"));
                temporario.setLM_professorResponsavel(dados.getString("LM_professorResponsavel"));
                temporario.setLM_TotalDeAlunos(dados.getInt("LM_TotalDeAlunos"));
                temporario.setLM_turnoDaAula(dados.getString("LM_turnoDaAula"));
                temporario.setLM_SalaDeAula(dados.getString("LM_SalaDeAula"));
                
                
                 series.add(temporario);
            }

        }catch(Exception e){} 

        return series;
    
    
    
    
    }
    
    
    
}
