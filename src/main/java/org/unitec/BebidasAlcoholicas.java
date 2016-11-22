/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.util.ArrayList;

/**
 *
 * @author campitos
 */
public class BebidasAlcoholicas implements TipoBebida{
    String nombre;
    
 public String  obtenerRecomendacion(){
     String bebidas="Brandy, Tequila, Whisky, Ron, Vodka, Mezcal, Pulque";
     return bebidas;
  }
    
}
