/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_DAO;

import LM_Classes.LM_Biblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author LLM
 */
public class LM_BibliotecaDAO {
    public static void adicionar( LM_Biblioteca biblioteca){
    String sql="INSERT INTO LM_Biblioteca(LM_bibliotecaria,LM_acervo,LM_emprestimos,LM_pedidos,LM_livro,LM_localizarLivro) VALUES (?,?,?,?,?,?)";
    
    Connection conexao=null;
    PreparedStatement stmt=null;
    
     try{
    
    stmt.setString(1, biblioteca.getLM_bibliotecaria());
    stmt.setDouble(2, biblioteca.getLM_acervo());
    stmt.setString(3, biblioteca.getLM_emprestimos());
    stmt.setString(4, biblioteca.getLM_pedidos());
    stmt.setString(5, biblioteca.getLM_livro());
    stmt.setString(6, biblioteca.getLM_localizarLivro());
    
    
     stmt.execute();
            System.out.println("Produto adicionado com Sucesso");
  }catch(Exception e){
                System.out.println("Erro no Adicionar Produto: "+e.toString());
            
            }
    
    }
}
