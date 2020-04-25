/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_bean.LM_Biblioteca;
import LM_DAO.LM_BibliotecaDAO;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lucas
 */
public class LM_Form_Biblioteca extends JPanel implements ActionListener{
       
        private JTextField LM_bibliotecaria;
        private JLabel label_bibliotecaria;
        private JTextField LM_acervo;
        private JLabel label_acervo;
        private JTextField LM_emprestimos;
        private JLabel label_emprestimos;
        private JTextField LM_pedidos;
        private JLabel label_pedidos;
        private JTextField LM_livro;
        private JLabel label_livro;
        private JTextField LM_localizarLivro;
        private JLabel label_localizarLivro;
        private JButton btn_salvar;
    
    
   public LM_Form_Biblioteca(){
        setLayout(new GridLayout(9,1));
        
        label_bibliotecaria=new JLabel("Bibliotecaria: ");
        LM_bibliotecaria=new JTextField(10);
        add(label_bibliotecaria);
        add(LM_bibliotecaria);
        
        label_acervo=new JLabel("Acervo: ");
        LM_acervo=new JTextField(10);
        add(label_acervo);
        add(LM_acervo);
        
        label_emprestimos=new JLabel("Emprestimos: ");
        LM_emprestimos=new JTextField(10);
        add(label_emprestimos);
        add(LM_emprestimos);
        
        label_pedidos=new JLabel("Pedidos: ");
        LM_pedidos=new JTextField(10);
        add(label_pedidos);
        add(LM_pedidos);
        
        label_livro=new JLabel("Livro: ");
        LM_livro=new JTextField(10);
        add(label_livro);
        add(LM_livro);
        
        label_localizarLivro=new JLabel("Localizar Livro: ");
        LM_localizarLivro=new JTextField(10);
        add(label_localizarLivro);
        add(LM_localizarLivro);
        
         btn_salvar=new JButton("Salvar");
       btn_salvar.addActionListener(this);
       add(btn_salvar); 
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String valor_LM_bibliotecaria= LM_bibliotecaria.getText();
        double valor_LM_acervo= Double.parseDouble(LM_acervo.getText());
        String  valor_LM_emprestimos= LM_emprestimos.getText();
        String valor_LM_pedidos= LM_pedidos.getText();
        String valor_LM_livro= LM_livro.getText();
        String valor_LM_localizarLivro= LM_localizarLivro.getText();
        
        LM_Biblioteca biblioteca=new LM_Biblioteca();
        biblioteca.setLM_bibliotecaria(valor_LM_bibliotecaria);
        biblioteca.setLM_acervo(valor_LM_acervo);
        biblioteca.setLM_emprestimos(valor_LM_emprestimos);
        biblioteca.setLM_pedidos(valor_LM_pedidos);
        biblioteca.setLM_livro(valor_LM_livro);
        biblioteca.setLM_localizarLivro(valor_LM_localizarLivro);
        
        LM_BibliotecaDAO.adicionar(biblioteca);
        
        
        
    }
    
}
