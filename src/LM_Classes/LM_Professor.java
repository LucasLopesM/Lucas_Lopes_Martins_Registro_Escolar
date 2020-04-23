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
public class LM_Professor extends LM_Funcionario{
 
    protected String LM_disciplinas;
    protected String LM_turmas;

    public LM_Professor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    @Override
    public double HoraExtra(){
     return this.LM_salario=this.LM_salario+0.10*100;
    }
    
    @Override
    public double DescontoPorFalta(){
    return this.LM_salario=this.LM_salario-(50.0*this.LM_faltas);
    }
    
    
         
    public void setDisciplina(String LM_disciplinas){
        this.LM_disciplinas=LM_disciplinas;
    }
    public String getDisciplina(){
    return this.LM_disciplinas;
    }
    
    public void setTurmas(String LM_turmas){
        this.LM_turmas=LM_turmas;
    }
    public String getTurmas(){
    return this.LM_turmas;
    }
    
   
    
    
    public LM_Professor(String n,String cg,double cH,String tn,double s,String usu,String snh,int ft,String t,String d){
    
        this.LM_nome=n;
        this.LM_cargo=cg;
        this.LM_cargaHoraria=cH;
        this.LM_turnos=tn;
        this.LM_salario=s; 
        this.LM_usuario=usu;
        this.LM_senha=snh;
        this.LM_faltas=ft;
        this.LM_turmas=t;
        this.LM_disciplinas=d;
    
    }
}
