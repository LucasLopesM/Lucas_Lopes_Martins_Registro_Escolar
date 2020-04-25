/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LLM
 */
public class ConexaoDB {
    private static final String USUARIO="root";
    private static final String SENHA="123456789";
    private static final String URL_DB="jdbc:mysql://127.0.0.1:3306/lucas_lopes_martins_registro_escolar?useTimezone=true&serverTimezone=UTC";
    
    
    public static Connection retornaConexao(){
        Connection conexao=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao=DriverManager.getConnection(URL_DB, USUARIO, SENHA);
            
        }catch(SQLException e){
                   System.err.println("Erro de Conexao: "+e.toString());
        }catch (ClassNotFoundException e){
            System.err.println("Classe Não Encontrada:"+e.toString());
        
        }
        
        return conexao;
        

} 
    
    
    
    
}
