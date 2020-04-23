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
public class LM_Aluno {
    protected String LM_nome;
    protected String LM_serie;
    protected double LM_nota1,LM_nota2,LM_nota3;
    protected double LM_media;
    protected int LM_matricula;
    protected String LM_senha;

    public LM_Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   


    

   
    
    
    public double LM_Media(){
    return this.LM_media=(this.LM_nota1+this.LM_nota2+this.LM_nota3)/3;
     
    }
    
     public void setLM_Nome(String LM_nome){
         this.LM_nome=LM_nome;
         }
         public String getLM_Nome(){
         return this.LM_nome;
         }
         
         public void setLM_Serie(String LM_serie){
         this.LM_serie=LM_serie;
         }
         public String getLM_Serie(){
         return this.LM_serie;
         }
         
         public void setLM_LM_Nota1(double LM_nota1){
         this.LM_nota1=LM_nota1;
         }
         public double  getLM_Nota1(){
         return this.LM_nota1;
         }
         
         
          public void setLM_Nota2(double LM_nota2){
         this.LM_nota2=LM_nota2;
         }
         public double  getLM_Nota2(){
         return this.LM_nota2;
         }
         
         
          public void setLM_Nota3(double LM_nota3){
         this.LM_nota3=LM_nota3;
         }
         public double  getLM_Nota3(){
         return this.LM_nota3;
         }
         
         
         public void setLM_Media(double LM_media){
         this.LM_media=LM_media;
         }
         public double getLM_Media(){
         return this.LM_media=(this.LM_nota1+this.LM_nota2+this.LM_nota3)/3;
         }
         
       
         public void setLM_Matricula(int LM_matricula){
         this.LM_matricula=LM_matricula;
         }
         public int  getLM_Matricula(){
         return this.LM_matricula;
         }
         
         
          public void setLM_Senha(String LM_senha){
         this.LM_senha=LM_senha;
         }
         public String  getLM_Senha(){
         return this.LM_senha;
         }
         
         
public LM_Aluno(String n,String s,double n1,double n2,double n3,int matr,String snh){
            this.LM_nome=n;
            this.LM_serie=s;
            this.LM_nota1=n1;
            this.LM_nota2=n2;
            this.LM_nota3=n3;
            this.LM_matricula=matr;
            this.LM_senha=snh;
   }
            
            
               
    }
    