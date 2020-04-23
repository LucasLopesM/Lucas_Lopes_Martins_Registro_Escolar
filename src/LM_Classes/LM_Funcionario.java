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
public abstract class LM_Funcionario{
     protected String LM_nome;
    protected String LM_cargo;
    protected double LM_cargaHoraria;
    protected String LM_turnos;
    protected double LM_salario;
    protected String LM_usuario;
    protected String LM_senha;
    protected int LM_faltas;
    
      
    public double HoraExtra(){
     return this.LM_salario=this.LM_salario+0.5*100;
    }
    
    public double DescontoPorFalta(){
    return this.LM_salario=this.LM_salario-(25.0*this.LM_faltas);
    }
    
    
    
    
     public void setLM_Nome(String LM_nome){
         this.LM_nome=LM_nome;
     }
     public String getLM_Nome(){
     return this.LM_nome;
         }
         
    public void setLM_Cargo(String LM_cargo){
        this.LM_cargo=LM_cargo;
    }
    public String getLM_Cargo(){
    return this.LM_cargo;
    }
    
    public void setLM_CargaHoraria(double LM_cargaHoraria){
        this.LM_cargaHoraria=LM_cargaHoraria;
    }
    public double getLM_CargaHoraria(){
    return this.LM_cargaHoraria;
    }
     public void setTurnos(String LM_turnos){
        this.LM_turnos=LM_turnos;
    }
    public String getTurnos(){
    return this.LM_turnos;
    }
    
    public void setSalario(double LM_salario){
        this.LM_salario=LM_salario;
    }
    public double  getSalario(){
    return this.LM_salario;
    }
    
     public void setLM_Usuario(String LM_usuario){
        this.LM_usuario=LM_usuario;
    }
    public String getLM_Usuario(){
    return this.LM_usuario;
    }
    
    
     public void setLM_Senha(String LM_senha){
        this.LM_senha=LM_senha;
     }
     public String  getLM_Senha(){
     return this.LM_senha;
     }
     
     
     public void setLM_Faltas(int LM_faltas){
        this.LM_faltas=LM_faltas;
     }
     public int getLM_Faltas(){
     return this.LM_faltas;
     }
    
 
   
    
}
