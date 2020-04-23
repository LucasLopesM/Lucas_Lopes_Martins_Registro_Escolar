/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Layout;

import LM_Views.LM_Form_Professor;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author 201817069
 */
public class Topo extends JPanel{
   public Topo(){
       setLayout(new GridLayout(1,5));
  JButton botao1=new JButton("Aluno");
  add(botao1);
  
  JButton botao2=new JButton("Professor");
  add(botao2);
  
  
  JButton botao3=new JButton("Biblioteca");
  add(botao3);
  
  JButton botao4=new JButton("Turmas");
  add(botao4);
  
  JButton botao5=new JButton("Series");
  add(botao5);
    
  
    
    
    }

   


    
    
}
