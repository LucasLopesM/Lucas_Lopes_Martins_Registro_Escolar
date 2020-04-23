/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Layout;

import LM_Views.LM_Form_Alunos;
import LM_Views.LM_Form_Biblioteca;
import LM_Views.LM_Form_Professor;
import LM_Views.LM_Form_Series;
import LM_Views.LM_Form_Turmas;
import javax.swing.JPanel;

/**
 *
 * @author 201817069
 */
public class Centro extends JPanel{
    public Centro(){
        
        LM_Form_Alunos alunos=new LM_Form_Alunos();
        
        add(alunos);
        
        LM_Form_Professor professor=new LM_Form_Professor();
        add(professor);
        
        LM_Form_Biblioteca biblioteca=new LM_Form_Biblioteca();
        add(biblioteca);
        
        LM_Form_Turmas turmas= new LM_Form_Turmas();
        add(turmas);
        
        LM_Form_Series series= new LM_Form_Series();
        add(series);
        
        
     
    }
    
}
