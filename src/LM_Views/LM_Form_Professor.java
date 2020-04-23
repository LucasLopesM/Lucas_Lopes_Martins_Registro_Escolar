/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_Classes.LM_Professor;
import LM_DAO.LM_ProfessorDAO;
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
 * @author 201817069
 */
public class LM_Form_Professor extends JPanel implements ActionListener {
    
      private JTextField LM_nome;
      private JLabel label_nome;
      private JTextField LM_cargo;
      private JLabel label_cargo;
      private JTextField LM_cargaHoraria;
      private JLabel label_cargaHoraria;
      private JTextField LM_turnos;
      private JLabel label_turnos;
      private JTextField LM_salario;
      private JLabel label_salario;
      private JTextField LM_usuario;
      private JLabel label_usuario;
      private JTextField LM_senha;
      private JLabel label_senha;
      private JTextField LM_disciplinas;
      private JLabel label_disciplinas;  
      private JTextField LM_turmas;
      private JLabel label_turmas; 
      private JButton btn_salvar;
      
   
    public LM_Form_Professor(){
        setLayout(new GridLayout(12,1));
        
        label_nome=new JLabel("Nome: ");
        LM_nome=new JTextField(10);
        add(label_nome);
        add(LM_nome);
        
        label_cargo=new JLabel("Cargo: ");
        LM_cargo=new JTextField(10);
        add(label_cargo);
        add(LM_cargo);
        
        label_cargaHoraria=new JLabel("Carga Horaria: ");
        LM_cargaHoraria=new JTextField(10);
        add(label_cargaHoraria);
        add(LM_cargaHoraria);
        
        label_turnos=new JLabel("Turnos: ");
        LM_turnos=new JTextField(10);
        add(label_turnos);
        add(LM_turnos);
        
        label_salario=new JLabel("Salario: ");
        LM_salario=new JTextField(10);
        add(label_salario);
        add(LM_salario);
        
        label_usuario=new JLabel("Usuario: ");
        LM_usuario=new JTextField(10);
        add(label_usuario);
        add(LM_usuario);
        
        label_senha=new JLabel("Senha: ");
        LM_senha=new JTextField(10);
        add(label_senha);
        add(LM_senha);
        
        label_turmas=new JLabel("Turmas: ");
        LM_turmas=new JTextField(10);
        add(label_turmas);
        add(LM_turmas);
        
        label_disciplinas=new JLabel("Disciplinas: ");
        LM_disciplinas=new JTextField(10);
        add(label_disciplinas);
        add(LM_disciplinas);
        
       
        
       btn_salvar=new JButton("Salvar");
       btn_salvar.addActionListener(this);
       add(btn_salvar);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        String valor_LM_nome= LM_nome.getText();
        String valor_LM_cargo= LM_cargo.getText();
        double valor_LM_cargaHoraria= Double.parseDouble(LM_cargaHoraria.getText());
        String valor_LM_turnos= LM_turnos.getText();
        double valor_LM_salario= Double.parseDouble(LM_salario.getText());
        String valor_LM_usuario= LM_usuario.getText();
        String valor_LM_senha= LM_senha.getText();
        String valor_LM_turmas= LM_turmas.getText();
        String valor_LM_disciplinas= LM_disciplinas.getText();
        
        
        LM_Professor professor=new LM_Professor();
        professor.setLM_Nome(valor_LM_nome);
        professor.setLM_Cargo(valor_LM_cargo);
        professor.setLM_CargaHoraria(valor_LM_cargaHoraria);
        professor.setTurnos(valor_LM_turnos);
        professor.setSalario(valor_LM_salario);
        professor.setLM_Usuario(valor_LM_usuario);
        professor.setLM_Senha(valor_LM_senha);
        professor.setTurmas(valor_LM_turmas);
        professor.setDisciplina(valor_LM_disciplinas);
        
        LM_ProfessorDAO.adicionar(professor);
                
                
                
         }
    
}
