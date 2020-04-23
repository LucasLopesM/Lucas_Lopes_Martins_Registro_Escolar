/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoDB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LLM
 */
public class ConexaoDB {
    private static final String USUARIO="root";
    private static final String SENHA="123456789";
    private static final String URL_DB="jdbc:mysql://127.0.0.1:3306/lucas_lopes_martins_registro_escolar?useTimezone=true&serverTimezone=UTC";
    
    
    public static Connection retornaConexao() throws Exception{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao=DriverManager.getConnection(URL_DB, USUARIO, SENHA);
            
               return conexao;
               }catch(Exception e){
                   System.out.println("Erro de Banco de Dados: "+e.toString());
                }
        
        return null;
        

} 
    
    
    
    
}
