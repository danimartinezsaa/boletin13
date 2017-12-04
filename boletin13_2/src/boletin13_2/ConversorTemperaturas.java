/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_2;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class ConversorTemperaturas{
    final int constante=80;
    
    public ConversorTemperaturas(){
    }
    
    public float centigradosAFharenheit(float grados) throws TemperaturaErradaExcepcion{
        if (grados<constante){
            throw new TemperaturaErradaExcepcion("recuerda que la temperatura no puede ser < 80 ºC ");
        } else return 9f/5f*grados+32.4f;
    }
    
    public void centigradosAReamur(){
        try{
            float grados=Float.parseFloat(JOptionPane.showInputDialog("Inserte grados para pasar a Reamur:"));
            JOptionPane.showMessageDialog(null,4f/5f*grados);
        }catch(Exception ex2){
            JOptionPane.showMessageDialog(null,"Número no válido.");
        }
    }
}
