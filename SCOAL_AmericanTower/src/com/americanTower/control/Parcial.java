package com.americanTower.control;

import java.io.Serializable;

/**
 *
 * @author Eduardo Sanchez
 */
public class Parcial implements Serializable{

    private Integer parcial;
    private Double calificacion;

    public Parcial() {
    }

    public Parcial(Integer parcial, Double calificacion) {
        this.parcial = parcial;
        this.calificacion = calificacion;
    }

    public Integer getParcial() {
        return parcial;
    }

    public void setParcial(Integer parcial) {
        this.parcial = parcial;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) {
        this.calificacion = calificacion;
    }

    public String printToCSV() {
        return "P"+this.parcial + ", " + String.format("%.2f", this.calificacion) + ",";
    }

}
