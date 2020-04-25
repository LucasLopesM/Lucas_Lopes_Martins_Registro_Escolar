/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LM_Views;

import LM_bean.LM_Alunos;
import LM_DAO.LM_AlunosDAO;
import LM_Layout.Centro;
import java.awt.BorderLayout;
import java.awt.Font;
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
public class LM_Form_Alunos extends JPanel implements ActionListener{
 
    private JTextField LM_nome;
    private JLabel label_nome;
    private JTextField LM_serie;
    private JLabel label_serie;
    private JTextField LM_nota1;
    private JLabel label_nota1;
    private JTextField LM_nota2;
    private JLabel label_nota2;
    private JTextField LM_nota3;
    private JLabel label_nota3;
    private JTextField LM_matricula;
    private JLabel label_matricula;
    private JTextField LM_senha;
    private JLabel label_senha;
    private JButton btn_salvar;
    
   public  LM_Form_Alunos(){
       setLayout(new GridLayout(9,1));
   
        label_nome=new JLabel("Nome: ");
        LM_nome=new JTextField(10);
        add(label_nome);
        add(LM_nome);
        
        label_serie=new JLabel("Serie: ");
        LM_serie=new JTextField(10);
        add(label_serie);
        add(LM_serie);
        
        label_nota1=new JLabel("Nota 1: ");
        LM_nota1=new JTextField(10);
        add(label_nota1);
        add(LM_nota1);
        
         label_nota2=new JLabel("Nota 2: ");
        LM_nota2=new JTextField(10);       
        add(label_nota2);
        add(LM_nota2);
        
        label_nota3=new JLabel("Nota 3: ");
        LM_nota3=new JTextField(10);       
        add(label_nota3);
        add(LM_nota3);
 
        label_matricula=new JLabel("Matricula: ");
        LM_matricula=new JTextField(10);
        add(label_matricula);
        add(LM_matricula);
        
        label_senha=new JLabel("Senha: ");
        LM_senha=new JTextField(10); 
        add(label_senha);
        add(LM_senha);
        
        
       
       btn_salvar=new JButton("Salvar");
       btn_salvar.addActionListener(this);
       add(btn_salvar);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        String valor_LM_nome= LM_nome.getText();
        String valor_LM_serie= LM_serie.getText();
        double valor_LM_nota1= Double.parseDouble(LM_nota1.getText());
        double valor_LM_nota2= Double.parseDouble(LM_nota2.getText());
        double valor_LM_nota3= Double.parseDouble(LM_nota3.getText());
        int valor_LM_matricula=Integer.parseInt(LM_matricula.getText());
         String valor_LM_senha= LM_senha.getText();
         
         
       LM_Alunos alunos = new LM_Alunos();
       alunos.setLM_Nome(valor_LM_nome);
       alunos.setLM_Serie(valor_LM_serie);
       alunos.setLM_LM_Nota1(valor_LM_nota1);
       alunos.setLM_Nota2(valor_LM_nota2);
       alunos.setLM_Nota3(valor_LM_nota3);
       alunos.setLM_Matricula(valor_LM_matricula);
       alunos.setLM_Senha(valor_LM_senha);
       
       LM_AlunosDAO.adicionar(alunos);
       
     
        
        
     }
    
    
    
}
