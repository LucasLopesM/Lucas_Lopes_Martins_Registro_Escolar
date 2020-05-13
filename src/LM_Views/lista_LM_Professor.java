/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_DAO.LM_ProfessorDAO;
import static LM_Principal.IniciarAplicacao.centro;
import LM_bean.LM_Professor;
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
public class lista_LM_Professor extends JPanel{
     
    private JButton botaoAdicionar, botaoEditar, botaoExcluir;
    
      private JTable tabela;
      private String[] colunas = {"id","LM_nome","LM_cargo","LM_cargaHoraria","LM_turnos","LM_salario","LM_usuario","LM_senha","LM_turmas","LM_disciplinas"};
      private Object[][] dados;
      
      DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
      
       public lista_LM_Professor(){
       
           botaoAdicionar = new JButton("Adicionar");
          botaoEditar = new JButton("Editar");
          botaoExcluir = new JButton("Excluir");
          
          
          botaoAdicionar.addActionListener(new AdicionarListener());
          botaoEditar.addActionListener(new EditarListener());
          botaoExcluir.addActionListener(new ExcluirListener());
          
          tabela = new JTable(modelo);
          
          ArrayList<LM_Professor> professores = LM_ProfessorDAO.listar();
          
          for(LM_Professor professor: professores){
              String id = Integer.toString(professor.getId());
              String LM_nome = professor.getLM_Nome();
              String LM_cargo = professor.getLM_Cargo();
              String LM_cargaHoraria = Double.toString(professor.getLM_CargaHoraria());
              String LM_turnos = professor.getTurnos();
              String LM_salario = Double.toString(professor.getSalario());
              String LM_usuario = professor.getLM_Usuario();
              String LM_senha = professor.getLM_Senha();
              String LM_turmas = professor.getTurmas();
              String LM_disciplinas = professor.getDisciplina();
              
              String[] linha = new String[]{id,LM_nome,LM_cargo,LM_cargaHoraria,LM_turnos,LM_salario,LM_usuario,LM_senha,LM_turmas,LM_disciplinas};
              
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
            centro.add(new LM_Form_Professor());   
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
