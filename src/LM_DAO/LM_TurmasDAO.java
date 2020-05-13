/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import ConexaoDB.ConexaoDB;
import LM_bean.LM_Turmas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LLM
 */
public class LM_TurmasDAO {
    public static void adicionar(LM_Turmas turmas){
         String sql="INSERT INTO LM_Turmas(LM_totalDeTurmas,LM_totalDeAlunos,LM_series,LM_professores,LM_Disciplinas) VALUES (?,?,?,?,?)";
     Connection conexao=ConexaoDB.retornaConexao();
        
        
        try{
            PreparedStatement stmt=conexao.prepareStatement(sql);
          stmt.setInt(1, turmas.getLM_totalDeTurmas());
          stmt.setInt(2, turmas.getLM_totalDeAlunos());
          stmt.setString(3, turmas.getLM_series());
          stmt.setString(4, turmas.getLM_professores());
          stmt.setString(5, turmas.getLM_Disciplinas());
          
        stmt.execute();
            System.err.println("Produto adicionado com Sucesso");
            
            }catch(Exception e){
                System.err.println("Erro no Adicionar Produto: "+e.toString());
            
            }
    }
        public static ArrayList<LM_Turmas> listar(){

             ArrayList<LM_Turmas> turmas = new ArrayList<>();

                String sql = "SELECT * FROM LM_Turmas";
                
                 try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while(dados.next()){
                LM_Turmas temporario = new LM_Turmas();
                temporario.setId(dados.getInt("id"));
                temporario.setLM_totalDeTurmas(dados.getInt("LM_totalDeTurmas"));
                temporario.setLM_totalDeAlunos(dados.getInt("LM_totalDeAlunos"));
                temporario.setLM_series(dados.getString("LM_series"));
                temporario.setLM_professores(dados.getString("LM_professores"));
                temporario.setLM_Disciplinas(dados.getString("LM_Disciplinas"));
                
                
                 turmas.add(temporario);
            }

        }catch(Exception e){} 

        return turmas;
    
    
    
    
    }
    
    
    
}
