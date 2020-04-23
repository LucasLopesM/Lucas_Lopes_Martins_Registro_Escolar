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
public class LM_Series {
    protected String LM_serieEspecifica; 
    protected String LM_professorResponsavel;
    protected int LM_TotalDeAlunos;
    protected String LM_Aluno;
    protected String LM_turnoDaAula;
    protected String LM_SalaDeAula;
    protected int LM_faltas=1;

    public LM_Series() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String faltas(){
    return this.LM_Aluno=this.LM_faltas+this.LM_Aluno;
    }
    
    
    public void setLM_serieEspecifica(String LM_serieEspecifica){
        this.LM_serieEspecifica=LM_serieEspecifica;
    }
    public String getLM_serieEspecifica(){
    return this.LM_serieEspecifica;
    }
    
    
     public void setLM_professorResponsavel(String LM_professorResponsavel){
        this.LM_professorResponsavel=LM_professorResponsavel;
    }
    public String getLM_professorResponsavel(){
    return this.LM_professorResponsavel;
    }
    
    
    public void setLM_TotalDeAlunos(int LM_TotalDeAlunos){
        this.LM_TotalDeAlunos=LM_TotalDeAlunos;
    }
    public int getLM_TotalDeAlunos(){
    return this.LM_TotalDeAlunos;
    }
    
    
    public void setLM_turnoDaAula(String LM_turnoDaAula){
        this.LM_turnoDaAula=LM_turnoDaAula;
    }
    public String getLM_turnoDaAula(){
    return this.LM_turnoDaAula;
    }
    
    
     public void setLM_SalaDeAula(String LM_SalaDeAula){
        this.LM_SalaDeAula=LM_SalaDeAula;
    }
    public String getLM_SalaDeAula(){
    return this.LM_SalaDeAula;
    }
    
    public LM_Series(String se,String pr,int ta,String tda,String sa){
    this.LM_serieEspecifica=se;
    this.LM_professorResponsavel=pr;
    this.LM_TotalDeAlunos=ta;
    this.LM_turnoDaAula=tda;
    this.LM_SalaDeAula=sa;
    
    }
}
