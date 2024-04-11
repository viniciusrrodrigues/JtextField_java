/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jtextfield;
import javax.swing.*; 
import java.awt.*;
/**
 *
 * @author dti
 */

public class JtextField extends JFrame{
    //criando variaveis de instancia
JLabel rotulo1, rotulo2,rotulo3, rotulo4;
JTextField texto1,texto2,texto3,texto4;

//metodo construtor sem parametros
public JtextField () {
  super ("Exemplo com JTextField");
Container tela = getContentPane(); 
// seta para receber objetos
setLayout(null); 
// intancia dos objetos do tipo Jlabel
    rotulo1 = new JLabel ("Nome");
    rotulo2 = new JLabel ("Idade");
    rotulo3 = new JLabel ("Telefone");
    rotulo4 = new JLabel ("Celular");
    
 // intancia dos objetos do tipo JTextField  
        texto1 = new JTextField(50);
        texto2 = new JTextField(3);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
 // posicionando objetos na tela        
            rotulo1.setBounds(50,20,80,20);
            rotulo2.setBounds(50,60,80,20);
            rotulo3.setBounds(50,100,80,20);
            rotulo4.setBounds(50,140,80,20); 
  //adicionando cor (azul)a fonte do rotulo          
            rotulo1.setForeground(Color.blue);
            rotulo2.setForeground(Color.blue);
            rotulo3.setForeground(Color.blue);
            rotulo4.setForeground(Color.blue);
            
                texto1.setBounds(110,20,200,20);
                texto2.setBounds(110,60,20,20);
                texto3.setBounds(110,100,80,20);
                texto4.setBounds(110,140,30,20);
// adicionando os objetos na tela                
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
       
            setSize(400, 250);
            setVisible(true);
            setLocationRelativeTo(null);
            tela.setBackground(Color.lightGray);
            }
}    
