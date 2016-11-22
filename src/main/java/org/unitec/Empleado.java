/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author campitos
 */

@Entity
public class Empleado {
    @Id
    @GeneratedValue
    private Long id;
    
    @JoinColumn(name="id_depto")
    @ManyToOne
    private Departamento depa;
    
    private String nombre;
    private float sueldo;

    public Empleado(Long id, Departamento depa, String nombre, float sueldo) {
        this.id = id;
        this.depa = depa;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(Departamento depa, String nombre, float sueldo) {
        this.depa = depa;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Empleado(Long id) {
        this.id = id;
    }

    public Empleado() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Departamento getDepa() {
        return depa;
    }

    public void setDepa(Departamento depa) {
        this.depa = depa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
}
