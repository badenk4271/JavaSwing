/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;
import programa.Parametros;// IMPORTAR PAQUETE.CLASE
import javax.swing.JFrame;


/**
 *
 * @author LAB01
 */
public class JavaSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        

      Parametros ventana = new Parametros();//  CREO UN OBJETO TIPO WINDOWS
      ventana.setVisible(true);
      ventana.setBounds(0, 0, 600, 800);
      //La siguiente instruccion le pone el nombre a la  ventana
      ventana.setTitle("Mi primera interfaz grafica");
      //esta sentencia es para finalizar el proyecto
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// TODO code application logic here
    }
    
}

