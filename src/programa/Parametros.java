/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;
import javax.swing.*; //importamos todo de Swing
import java.awt.*;
/**
 *
 * @author LAB01
 */
public class Parametros extends JFrame
{
    JPanel panel;
    JLabel label;
    JTextField text;
    JButton boton;  
    JCheckBox cuadrado;
    JRadioButton radio;
    
    public Parametros()
    {
        panel = new JPanel();//CREAMOS UN BOJETO DE TIPO JPanel
        label = new JLabel();
        text = new JTextField(20);//CANTIDAD DE CARACTERES
        boton = new JButton(); 
        cuadrado = new JCheckBox();
        radio = new JRadioButton();
        
        this.add(panel);// Agregamos el JPanel al JFrame
        panel.add(label);//Agregamos los elementos al JPanel
        panel.add(text);
        panel.add(boton);
        panel.add(cuadrado);
        panel.add(radio);
        
        label.setText("Nombre");
        boton.setText("Enviar");
        panel.setBackground(Color.blue);// Color DE FONDO DEL JPanel
        
        
        
        
        
    }
            
    
}
