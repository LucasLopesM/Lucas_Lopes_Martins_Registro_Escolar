/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_DAO.LM_TurmasDAO;
import static LM_Principal.IniciarAplicacao.centro;
import LM_bean.LM_Turmas;
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
public class lista_LM_Turmas extends JPanel{
    
     private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id","LM_totalDeTurmas","LM_totalDeAlunos","LM_series","LM_professores","LM_Disciplinas"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
       public lista_LM_Turmas(){
       
           botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<LM_Turmas> turmas = LM_TurmasDAO.listar();
          
          for(LM_Turmas turma: turmas){
              String id = Integer.toString(turma.getId());
              String LM_totalDeTurmas = Integer.toString(turma.getLM_totalDeAlunos());
              String LM_totalDeAlunos = Integer.toString(turma.getLM_totalDeTurmas());
              String LM_series = turma.getLM_series();
              String LM_professores = turma.getLM_professores();
              String LM_Disciplinas = turma.getLM_Disciplinas();
            
              
              String[] linha = new String[]{id,LM_totalDeTurmas,LM_totalDeAlunos,LM_series,LM_professores,LM_Disciplinas};
              
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
            centro.add(new LM_Form_Turmas());   
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
