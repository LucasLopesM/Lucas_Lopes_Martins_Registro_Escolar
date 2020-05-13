/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Layout;


import static LM_Principal.IniciarAplicacao.centro;
import LM_Views.LM_Form_Alunos;
import LM_Views.LM_Form_Biblioteca;
import LM_Views.LM_Form_Professor;
import LM_Views.LM_Form_Series;
import LM_Views.LM_Form_Turmas;
import LM_Views.lista_LM_Alunos;
import LM_Views.lista_LM_Biblioteca;
import LM_Views.lista_LM_Professor;
import LM_Views.lista_LM_Series;
import LM_Views.lista_LM_Turmas;
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
       setLayout(new GridLayout());
       
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
    
  
  botao1.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    centro.removeAll();
                    centro.add(new lista_LM_Alunos());   
                    centro.repaint();                 
                    centro.validate();
                }
            });
  
   botao2.addActionListener(new ActionListener(){ 
      @Override
      public void actionPerformed(ActionEvent e) {
          centro.removeAll();
          centro.add(new lista_LM_Professor());
          centro.repaint();
          centro.validate();
      }
  });
   
    botao3.addActionListener(new ActionListener(){ 
      @Override
      public void actionPerformed(ActionEvent e) {
          centro.removeAll();
          centro.add(new lista_LM_Biblioteca());
          centro.repaint();
          centro.validate();
      }
  });
    
     botao4.addActionListener(new ActionListener(){ 
      @Override
      public void actionPerformed(ActionEvent e) {
          centro.removeAll();
          centro.add(new lista_LM_Turmas());
          centro.repaint();
          centro.validate();
      }
  });
    
     botao5.addActionListener(new ActionListener(){ 
      @Override
      public void actionPerformed(ActionEvent e) {
          centro.removeAll();
          centro.add(new lista_LM_Series());
          centro.repaint();
          centro.validate();
      }
  });
    
    }

   


    
    
}
