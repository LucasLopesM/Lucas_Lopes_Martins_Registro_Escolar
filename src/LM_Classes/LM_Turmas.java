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
public class LM_Turmas {
    protected int LM_totalDeTurmas;
    protected int LM_totalDeAlunos;
    protected String LM_Disciplinas;
    protected String LM_professores;
    protected String LM_series;

    public LM_Turmas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
     public void setLM_totalDeTurmas(int LM_totalDeTurmas){
        this.LM_totalDeTurmas=LM_totalDeTurmas;
    }
    public int getLM_totalDeTurmas(){
    return this.LM_totalDeTurmas;
    }
    
    
    public void setLM_totalDeAlunos(int LM_totalDeAlunos){
        this.LM_totalDeAlunos=LM_totalDeAlunos;
    }
    public int getLM_totalDeAlunos(){
    return this.LM_totalDeAlunos;
    }
    
    
     public void setLM_Disciplinas(String LM_Disciplinas){
        this.LM_Disciplinas=LM_Disciplinas;
    }
    public String getLM_Disciplinas(){
    return this.LM_Disciplinas;
    }
    
    
    public void setLM_professores(String LM_professores){
        this.LM_professores=LM_professores;
    }
    public String getLM_professores(){
    return this.LM_professores;
    }
    
    
     public void setLM_series(String LM_series){
        this.LM_series=LM_series;
    }
    public String getLM_series(){
    return this.LM_series;
    }
    
    
    public LM_Turmas(int tt,int ta,String se,String pr,String dis){
        this.LM_totalDeTurmas=tt;
        this.LM_totalDeAlunos=ta;
        this.LM_series=se;
        this.LM_professores=pr;
        this.LM_Disciplinas=dis;
    
    }
}
