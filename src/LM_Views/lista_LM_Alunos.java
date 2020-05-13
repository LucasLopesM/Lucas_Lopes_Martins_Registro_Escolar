/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_DAO.LM_AlunosDAO;
import static LM_Principal.IniciarAplicacao.centro;
import LM_bean.LM_Alunos;
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
public class lista_LM_Alunos extends JPanel{
    
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id", "LM_nome", "LM_serie", "LM_nota1", "LM_nota2", "LM_nota3","LM_matricula","LM_senha"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
      public lista_LM_Alunos(){
          botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<LM_Alunos> alunos = LM_AlunosDAO.listar();
          
          for(LM_Alunos aluno: alunos){
              String id = Integer.toString(aluno.getId());
              String LM_nome = aluno.getLM_Nome();
              String LM_serie = aluno.getLM_Serie();
              String LM_nota1 = Double.toString(aluno.getLM_Nota1());
              String LM_nota2 = Double.toString(aluno.getLM_Nota2());
              String LM_nota3 = Double.toString(aluno.getLM_Nota3());
              String LM_matricula = Integer.toString(aluno.getLM_Matricula());
              String LM_senha = aluno.getLM_Senha();
              
              String[] linha = new String[]{id, LM_nome, LM_serie, LM_nota1,LM_nota2,LM_nota3,LM_matricula,LM_senha};
              
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
            centro.add(new LM_Form_Alunos());   
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
