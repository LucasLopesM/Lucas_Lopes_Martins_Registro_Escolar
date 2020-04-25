/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Principal;

import LM_Layout.Centro;
import LM_Layout.Direita;
import LM_Layout.Esquerda;
import LM_Layout.Rodape;
import LM_Layout.Topo;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author LLM
 */
public class IniciarAplicacao {
    
    public static Centro centro = new Centro();
    
    public static void main(String[] args){
    
    BorderLayout layout_janela = new BorderLayout();
    
    JFrame janela = new JFrame();
    
    janela.setLayout(layout_janela);
    janela.add(new Topo(),BorderLayout.NORTH);
    janela.add(centro, BorderLayout.CENTER);
    janela.add(new Rodape(),BorderLayout.SOUTH );
    janela.add(new Esquerda(),BorderLayout.EAST );        
    janela.add(new Direita(), BorderLayout.WEST);
    janela.pack();
    janela.show();
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
    }
    
    
    
}
