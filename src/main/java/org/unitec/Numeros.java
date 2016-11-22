/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

/**
 *
 * @author campitos
 */
public class Numeros {
    private int primero;
    private int segundo;

    public Numeros(int primero, int segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    public Numeros() {
    }

    public int getPrimero() {
        return primero;
    }

    public void setPrimero(int primero) {
        this.primero = primero;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
}
