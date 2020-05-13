/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import ConexaoDB.ConexaoDB;
import LM_bean.LM_Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LLM
 */
public class LM_ProfessorDAO {
    public static void adicionar(LM_Professor professor){
        String sql="INSERT INTO LM_Professor(LM_nome,LM_cargo,LM_cargaHoraria,LM_turnos,LM_salario,LM_usuario,LM_senha,LM_turmas,LM_disciplinas) VALUES (?,?,?,?,?,?,?,?,?)";
      Connection conexao=ConexaoDB.retornaConexao();
        
        
    try{
       PreparedStatement stmt=conexao.prepareStatement(sql);
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
            System.err.println("Produto adicionado com Sucesso");
            
            }catch(Exception e){
                System.err.println("Erro no Adicionar Produto: "+e.toString());
            
            }
      
      
      }
        public static ArrayList<LM_Professor> listar(){

             ArrayList<LM_Professor> professores = new ArrayList<>();

                String sql = "SELECT * FROM LM_Professor";
                
                 try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while(dados.next()){
                LM_Professor temporario = new LM_Professor();
                temporario.setId(dados.getInt("id"));
                temporario.setLM_Nome(dados.getString("LM_Nome"));
                temporario.setLM_Cargo(dados.getString("LM_Cargo"));
                temporario.setLM_CargaHoraria(dados.getDouble("LM_CargaHoraria"));
                temporario.setTurnos(dados.getString("LM_turnos"));
                temporario.setSalario(dados.getDouble("LM_salario"));
                temporario.setLM_Usuario(dados.getString("LM_usuario"));
                temporario.setLM_Senha(dados.getString("LM_senha"));
                temporario.setTurmas(dados.getString("LM_turmas"));
                temporario.setDisciplina(dados.getString("LM_disciplinas"));
                
                 professores.add(temporario);
            }

        }catch(Exception e){} 

        return professores;
    
    
    
    
    }
}
