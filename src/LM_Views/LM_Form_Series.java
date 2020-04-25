/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_bean.LM_Series;
import LM_DAO.LM_SeriesDAO;
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
public class LM_Form_Series extends JPanel implements ActionListener{
         private JTextField LM_serieEspecifica;
         private JLabel label_serieEspecifica;
        private JTextField LM_professorResponsavel;
        private JLabel label_professorResponsavel;
        private JTextField LM_TotalDeAlunos;
        private JLabel label_TotalDeAlunos;      
        private JTextField LM_turnoDaAula;
        private JLabel label_turnoDaAula;
        private JTextField LM_SalaDeAula;
        private JLabel label_SalaDeAula;
        private JButton btn_salvar;
    
    
   public LM_Form_Series(){
        setLayout(new GridLayout(9,1));
        
        label_serieEspecifica=new JLabel("Serie Especifica: ");
        LM_serieEspecifica=new JTextField(10);
        add(label_serieEspecifica);
        add(LM_serieEspecifica);
        
        label_professorResponsavel=new JLabel("Professor Responsavel: ");
        LM_professorResponsavel=new JTextField(10);
        add(label_professorResponsavel);
        add(LM_professorResponsavel); 
        
        label_TotalDeAlunos=new JLabel("Total De Alunos: ");
        LM_TotalDeAlunos=new JTextField(10);
        add(label_TotalDeAlunos);
        add(LM_TotalDeAlunos);
        
        label_turnoDaAula=new JLabel("Turno Da Aula: ");
        LM_turnoDaAula=new JTextField(10);
        add(label_turnoDaAula);
        add(LM_turnoDaAula);
        
        label_SalaDeAula=new JLabel("Sala De Aula: ");
        LM_SalaDeAula=new JTextField(10);
        add(label_SalaDeAula);
        add(LM_SalaDeAula);
        
        
        btn_salvar=new JButton("Salvar");
        btn_salvar.addActionListener(this);
        add(btn_salvar);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String valor_LM_serieEspecifica= LM_serieEspecifica.getText();
        String valor_LM_professorResponsavel= LM_professorResponsavel.getText();
        int    valor_LM_TotalDeAlunos= Integer.parseInt(LM_TotalDeAlunos.getText());
        String valor_LM_turnoDaAula= LM_turnoDaAula.getText();
        String valor_LM_SalaDeAula= LM_SalaDeAula.getText();
        
        
        LM_Series series=new LM_Series();
        series.setLM_serieEspecifica(valor_LM_serieEspecifica);
        series.setLM_professorResponsavel(valor_LM_professorResponsavel);
        series.setLM_TotalDeAlunos(valor_LM_TotalDeAlunos);
        series.setLM_turnoDaAula(valor_LM_turnoDaAula);
        series.setLM_SalaDeAula(valor_LM_SalaDeAula);
           
        LM_SeriesDAO.adicionar(series);
                
                }
    
}
