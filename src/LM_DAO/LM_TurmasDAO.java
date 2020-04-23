/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import LM_Classes.LM_Turmas;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LLM
 */
public class LM_TurmasDAO {
    public static void adicionar(LM_Turmas turmas){
         String sql="INSERT INTO LM_Turmas(LM_totalDeTurmas,LM_totalDeAlunos,LM_series,LM_professores,LM_Disciplinas) VALUES (?,?,?,?,?)";
     Connection conexao=null;
     PreparedStatement stmt=null;
     
      try{
          stmt.setInt(1, turmas.getLM_totalDeTurmas());
          stmt.setInt(2, turmas.getLM_totalDeAlunos());
          stmt.setString(3, turmas.getLM_series());
          stmt.setString(4, turmas.getLM_professores());
          stmt.setString(5, turmas.getLM_Disciplinas());
          
       stmt.execute();
            System.out.println("Produto adicionado com Sucesso");
  }catch(Exception e){
                System.out.println("Erro no Adicionar Produto: "+e.toString());
            
            }
    }
    
}
