/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author rapid
 */
@Entity
public class Estacionamiento implements Serializable{
    
    @Id
    @GeneratedValue
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date tiempo;

    public Estacionamiento(Date tiempo) {
        this.tiempo = tiempo;
    }

    public Estacionamiento(Long id, Date tiempo) {
        this.id = id;
        this.tiempo = tiempo;
    }

    public Estacionamiento(Long id) {
        this.id = id;
    }

    public Estacionamiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }
    
    
}
