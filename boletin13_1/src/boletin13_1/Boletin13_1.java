/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_1;

import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class Boletin13_1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ConversorTemperaturas temp=new ConversorTemperaturas();
        
        try{
            JOptionPane.showMessageDialog(null,temp.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("Inserte los grados para convertir a Fharenheint:"))));
            JOptionPane.showMessageDialog(null,temp.centigradosAReamur(Float.parseFloat(JOptionPane.showInputDialog("Inserte los grados para convertir a Reamur:"))));
        }catch (TemperaturaErradaExcepcion e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
        
    }
    
}
