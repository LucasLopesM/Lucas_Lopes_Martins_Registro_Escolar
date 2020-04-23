/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import ConexaoDB.ConexaoDB;
import LM_Classes.LM_Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LLM
 */
public class LM_AlunosDAO {
    public static void adicionar(LM_Aluno alunos){
        String sql="INSERT INTO LM_Aluno (LM_nome,LM_serie,LM_nota1,LM_nota2,LM_nota3,LM_matricula,LM_senha) VALUES (?,?,?,?,?,?,?)";
        Connection conexao=null;
        PreparedStatement stmt=null;
        
        try{
            conexao=ConexaoDB.retornaConexao();
            stmt=conexao.prepareStatement(sql);
            
            stmt.setString(1, alunos.getLM_Nome());
            stmt.setString(2, alunos.getLM_Serie());
            stmt.setDouble(3, alunos.getLM_Nota1());
            stmt.setDouble(4, alunos.getLM_Nota2());
            stmt.setDouble(5, alunos.getLM_Nota3());
            stmt.setInt(6, alunos.getLM_Matricula());
            stmt.setString(7, alunos.getLM_Senha());
            
            stmt.execute();
            System.out.println("Produto adicionado com Sucesso");
            
            }catch(Exception e){
                System.out.println("Erro no Adicionar Produto: "+e.toString());
            
            }
        
    
    }
    
}
