/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin13_2;

/**
 *
 * @author dani
 */
public class TemperaturaErradaExcepcion extends Exception{
    public TemperaturaErradaExcepcion(){
        super("Error, la excepción ha saltado.");
    }
    public TemperaturaErradaExcepcion(String mensaje){
        super(mensaje);
    }
}
