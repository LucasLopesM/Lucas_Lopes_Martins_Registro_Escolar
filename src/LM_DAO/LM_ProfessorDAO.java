/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import LM_Classes.LM_Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LLM
 */
public class LM_ProfessorDAO {
    public static void adicionar(LM_Professor professor){
        String sql="INSERT INTO LM_Professor(LM_nome,LM_cargo,LM_cargaHoraria,LM_turnos,LM_salario,LM_usuario,LM_senha,LM_turmas,LM_disciplinas) VALUES (?,?,?,?,?,?,?,?,?)";
     Connection conexao=null;
     PreparedStatement stmt=null;
     
      try{
          stmt.setString(1, professor.getLM_Nome());
          stmt.setString(2, professor.getLM_Cargo());
          stmt.setDouble(3, professor.getLM_CargaHoraria());
          stmt.setString(4, professor.getTurnos());
          stmt.setDouble(5, professor.getSalario());
          stmt.setString(6, professor.getLM_Usuario());
          stmt.setString(7, professor.getLM_Senha());
          stmt.setString(8, professor.getTurmas());
          stmt.setString(9, professor.getDisciplina());
          
          stmt.execute();
            System.out.println("Produto adicionado com Sucesso");
  }catch(Exception e){
                System.out.println("Erro no Adicionar Produto: "+e.toString());
            
            }
      
      
      }
    }
    
