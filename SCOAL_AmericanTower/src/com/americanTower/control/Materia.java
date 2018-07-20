/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.control;

import java.util.ArrayList;

/**
 *
 * @author Eduardo Sanchez
 */
public class Materia {

    private String nombre;
    private ArrayList<Parcial> parciales;

    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.parciales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Parcial> getParciales() {
        return parciales;
    }

    public void setParciales(ArrayList<Parcial> parciales) {
        this.parciales = parciales;
    }

    public void nuevaCalificacion(double calificacion) {
        int parcialTemp = parciales.isEmpty() ? 1 : parciales.get(parciales.size()-1).getParcial() + 1;
        this.parciales.add(new Parcial(parcialTemp, calificacion));
    }

    public double calificacion(){
        double temp=0;
        for (int i = 0; i < parciales.size(); i++) {
            temp += parciales.get(i).getCalificacion();
        }
        return temp/parciales.size();
    }
    
    public String printToCSV() {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < parciales.size(); i++) {
            temp.append(parciales.get(i).printToCSV());
        }
        return this.nombre + ", " + temp.toString();
        
    }
}
