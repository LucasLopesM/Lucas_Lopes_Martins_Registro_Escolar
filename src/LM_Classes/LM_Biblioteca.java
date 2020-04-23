/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Classes;

/**
 *
 * @author Lucas
 */
public class LM_Biblioteca {
    protected String LM_bibliotecaria;
    protected double LM_acervo;
    protected String LM_emprestimos;
    protected String LM_pedidos;
    protected String LM_livro;
    protected String LM_localizarLivro;

    public LM_Biblioteca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String EmcontreMeuLivro(){
        return this.LM_livro=this.LM_localizarLivro;
        
      
    }
    
    public void setLM_bibliotecaria(String LM_bibliotecaria){
         this.LM_bibliotecaria=LM_bibliotecaria;
     }
     public String getLM_bibliotecaria(){
     return this.LM_bibliotecaria;
         }
     
     
      public void setLM_acervo(double LM_acervo){
         this.LM_acervo=LM_acervo;
     }
     public double getLM_acervo(){
     return this.LM_acervo;
         }
     
     
     public void setLM_emprestimos(String LM_emprestimos){
         this.LM_emprestimos=LM_emprestimos;
     }
     public String getLM_emprestimos(){
     return this.LM_emprestimos;
      }
     

     
      public void setLM_pedidos(String LM_pedidos){
         this.LM_pedidos=LM_pedidos;
     }
     public String getLM_pedidos(){
     return this.LM_pedidos;
     }
     
     
     public void setLM_livro(String LM_livro){
         this.LM_livro=LM_livro;
     }
     public String getLM_livro(){
     return this.LM_livro;
      }
     
     
     
     
     public void setLM_localizarLivro(String LM_localizarLivro){
         this.LM_localizarLivro=LM_localizarLivro;
     }
     public String getLM_localizarLivro(){
     return this.LM_localizarLivro;
     }
     
     
     public LM_Biblioteca(String bb,double ac,String emp,String pd,String lv,String ll){
         this.LM_bibliotecaria=bb;
         this.LM_acervo=ac;
         this.LM_emprestimos=emp;
         this.LM_pedidos=pd;
         this.LM_livro=lv;
         this.LM_localizarLivro=ll;
       
     
     
     }
     
     
     
     
     
    
    
    
    
    
}
