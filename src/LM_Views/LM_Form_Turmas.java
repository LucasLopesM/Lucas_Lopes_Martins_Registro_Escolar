/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_Classes.LM_Turmas;
import LM_DAO.LM_TurmasDAO;
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
public class LM_Form_Turmas extends JPanel implements ActionListener{
     private JButton botao;
     private JTextField LM_totalDeTurmas;
     private JLabel label_totalDeTurmas;
     private JTextField LM_totalDeAlunos;
     private JLabel label_totalDeAlunos;
     private JTextField LM_Disciplinas;
     private JLabel label_Disciplinas;
     private JTextField LM_professores;
     private JLabel label_professores;
     private JTextField LM_series;
     private JLabel label_series;
     private JButton btn_salvar;
    
    
    public LM_Form_Turmas(){
        setLayout(new GridLayout(9,1));
        label_totalDeTurmas=new JLabel("Total De Turmas na Escola: ");
        LM_totalDeTurmas=new JTextField(10);
        add(label_totalDeTurmas);
        add(LM_totalDeTurmas);
        
        label_totalDeAlunos=new JLabel("Total De Alunos na Escola: ");
        LM_totalDeAlunos=new JTextField(10);
        add(label_totalDeAlunos);
        add(LM_totalDeAlunos);
        
        label_Disciplinas=new JLabel("Disciplinas Lecionadas na Escola: ");
        LM_Disciplinas=new JTextField(10);
        add(label_Disciplinas);
        add(LM_Disciplinas);
        
        label_professores=new JLabel("Nome Dos Professores: ");
        LM_professores=new JTextField(10);
        add(label_professores);
        add(LM_professores);
        
        label_series=new JLabel("Series da Escola: ");
        LM_series=new JTextField(10);
        add(label_series);
        add(LM_series);
        
        btn_salvar=new JButton("Salvar");
        btn_salvar.addActionListener(this);
        add(btn_salvar);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int valor_LM_totalDeTurmas= Integer.parseInt(LM_totalDeTurmas.getText());
        int valor_LM_totalDeAlunos= Integer.parseInt(LM_totalDeAlunos.getText());
        String valor_LM_series= LM_series.getText();
        String valor_LM_professores= LM_professores.getText();
        String  valor_LM_Disciplinas= LM_Disciplinas.getText();
        
        
        LM_Turmas turmas=new LM_Turmas();
        turmas.setLM_totalDeTurmas(valor_LM_totalDeTurmas);
        turmas.setLM_totalDeAlunos(valor_LM_totalDeAlunos);
        turmas.setLM_series(valor_LM_series);
        turmas.setLM_professores(valor_LM_professores);
        turmas.setLM_Disciplinas(valor_LM_Disciplinas);
        
        LM_TurmasDAO.adicionar(turmas);
                
                
    }
    
}
