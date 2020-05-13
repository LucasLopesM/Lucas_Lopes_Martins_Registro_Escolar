/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_DAO.LM_BibliotecaDAO;
import static LM_Principal.IniciarAplicacao.centro;
import LM_bean.LM_Biblioteca;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LLM
 */
public class lista_LM_Biblioteca extends JPanel {
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id","LM_bibliotecaria","LM_acervo","LM_emprestimos","LM_pedidos","LM_livros","LM_localizarLivro"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
       public lista_LM_Biblioteca(){
       
           botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<LM_Biblioteca> bibliotecas = LM_BibliotecaDAO.listar();
          
          for(LM_Biblioteca biblioteca: bibliotecas){
              String id = Integer.toString(biblioteca.getId());
              String LM_bibliotecaria = biblioteca.getLM_bibliotecaria();
              String LM_acervo = Double.toString(biblioteca.getLM_acervo());
              String LM_emprestimos = biblioteca.getLM_emprestimos();
              String LM_pedidos = biblioteca.getLM_pedidos();
              String LM_livros = biblioteca.getLM_livro();
              String LM_localizarLivro = biblioteca.getLM_localizarLivro();
              
               String[] linha = new String[]{id,LM_bibliotecaria,LM_acervo,LM_emprestimos,LM_pedidos,LM_livros,LM_localizarLivro};
              
              modelo.addRow(linha); 
       } 
       add(tabela);
          
          add(botaoAdicionar);
          add(botaoEditar);
          add(botaoExcluir);
       
       
       }
       
        private static class AdicionarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            centro.removeAll();
            centro.add(new LM_Form_Biblioteca());   
            centro.repaint();                 
            centro.validate();
        }

        }
        private static class EditarListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {}
    }

    private static class ExcluirListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {}
    }
      
}
