/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import ConexaoDB.ConexaoDB;
import LM_bean.LM_Biblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LLM
 */
public class LM_BibliotecaDAO {
    public static void adicionar( LM_Biblioteca biblioteca){
    String sql="INSERT INTO LM_Biblioteca(LM_bibliotecaria,LM_acervo,LM_emprestimos,LM_pedidos,LM_livros,LM_localizarLivro) VALUES (?,?,?,?,?,?)";
    
    Connection conexao=ConexaoDB.retornaConexao();
        
        
    try{
       PreparedStatement stmt=conexao.prepareStatement(sql);
    
    stmt.setString(1, biblioteca.getLM_bibliotecaria());
    stmt.setDouble(2, biblioteca.getLM_acervo());
    stmt.setString(3, biblioteca.getLM_emprestimos());
    stmt.setString(4, biblioteca.getLM_pedidos());
    stmt.setString(5, biblioteca.getLM_livro());
    stmt.setString(6, biblioteca.getLM_localizarLivro());
    
    
      stmt.execute();
            System.err.println("Produto adicionado com Sucesso");
            
            }catch(Exception e){
                System.err.println("Erro no Adicionar Produto: "+e.toString());
            
            }
    
 
    }
    
    public static ArrayList<LM_Biblioteca> listar(){

             ArrayList<LM_Biblioteca> bibliotecas = new ArrayList<>();

                String sql = "SELECT * FROM LM_Biblioteca";
                
                 try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);

            ResultSet dados = stmt.executeQuery();

            while(dados.next()){
                LM_Biblioteca temporario = new LM_Biblioteca();
                temporario.setId(dados.getInt("id"));
                temporario.setLM_bibliotecaria(dados.getString("LM_bibliotecaria"));
                temporario.setLM_acervo(dados.getDouble("LM_acervo"));
                temporario.setLM_emprestimos(dados.getString("LM_emprestimos"));
                temporario.setLM_pedidos(dados.getString("LM_pedidos"));
                temporario.setLM_livro(dados.getString("LM_livros"));
                temporario.setLM_localizarLivro(dados.getString("LM_localizarLivro"));
                

                bibliotecas.add(temporario);
            }

        }catch(Exception e){} 

        return bibliotecas;

}
}



            