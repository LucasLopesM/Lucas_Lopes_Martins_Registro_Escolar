/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Layout;

import LM_Layout.Centro;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author 201817069
 */
public class janela extends JFrame {
 public  janela(){
    
     super("Registro Escolar");
 
 pack();
 show();
 
 setLayout(new BorderLayout());

 
 getContentPane().add(new Topo(),BorderLayout.NORTH);
 getContentPane().add(new Centro(),BorderLayout.CENTER);
 
        

}

  
  
}




