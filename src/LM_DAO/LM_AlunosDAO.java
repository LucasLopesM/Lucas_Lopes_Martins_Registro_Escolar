/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import ConexaoDB.ConexaoDB;
import LM_bean.LM_Alunos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LLM
 */
public class LM_AlunosDAO {
    
    public static void adicionar(LM_Alunos alunos){
        String sql="INSERT INTO LM_Alunos (LM_nome,LM_serie,LM_nota1,LM_nota2,LM_nota3,LM_matricula,LM_senha) VALUES (?,?,?,?,?,?,?)";
        Connection conexao=ConexaoDB.retornaConexao();
        
        
        try{
            PreparedStatement stmt=conexao.prepareStatement(sql);
            
            stmt.setString(1, alunos.getLM_Nome());
            stmt.setString(2, alunos.getLM_Serie());
            stmt.setDouble(3, alunos.getLM_Nota1());
            stmt.setDouble(4, alunos.getLM_Nota2());
            stmt.setDouble(5, alunos.getLM_Nota3());
            stmt.setInt(6, alunos.getLM_Matricula());
            stmt.setString(7, alunos.getLM_Senha());
            
            /*stmt.execute();
            System.err.println("Aluno adicionado com Sucesso");
            */
            }catch(Exception e){
                System.err.println("Erro no Adicionar Aluno: "+e.toString());
                
            }
        
    
    }
    
    public static ArrayList<LM_Alunos> listar(){

        ArrayList<LM_Alunos> alunos = new ArrayList<>();

        String sql = "SELECT * FROM LM_Alunos";

        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while(dados.next()){
                LM_Alunos temporario = new LM_Alunos();
                temporario.setId(dados.getInt("id"));
                temporario.setLM_Nome(dados.getString("LM_nome"));
                temporario.setLM_Serie(dados.getString("LM_serie"));
                temporario.setLM_LM_Nota1(dados.getDouble("LM_nota1"));
                temporario.setLM_Nota2(dados.getDouble("LM_nota2"));
                temporario.setLM_Nota3(dados.getDouble("LM_nota3"));
                temporario.setLM_Matricula(dados.getInt("LM_matricula"));
                temporario.setLM_Senha(dados.getString("LM_senha"));

                alunos.add(temporario);
            }

        }catch(Exception e){} 

        return alunos;
    }


    public static void excluir() { }


    public static void atualizar() {}

        
}
