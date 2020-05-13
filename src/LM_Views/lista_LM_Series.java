/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_DAO.LM_SeriesDAO;
import static LM_Principal.IniciarAplicacao.centro;
import LM_bean.LM_Series;
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
public class lista_LM_Series extends JPanel{
    
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id","LM_serieEspecifica","LM_professorResponsavel","LM_TotalDeAlunos","LM_turnoDaAula","LM_SalaDeAula"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
       public lista_LM_Series(){
       
           botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<LM_Series> series = LM_SeriesDAO.listar();
          
          for(LM_Series serie: series){
              String id = Integer.toString(serie.getId());
              String LM_serieEspecifica = serie.getLM_serieEspecifica();
              String LM_professorResponsavel = serie.getLM_professorResponsavel();
              String LM_TotalDeAlunos = Integer.toString(serie.getLM_TotalDeAlunos());
              String LM_turnoDaAula = serie.getLM_turnoDaAula();
              String LM_SalaDeAula = serie.getLM_SalaDeAula();
            
              
              String[] linha = new String[]{id,LM_serieEspecifica,LM_professorResponsavel,LM_TotalDeAlunos,LM_turnoDaAula,LM_SalaDeAula};
              
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
            centro.add(new LM_Form_Series());   
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
