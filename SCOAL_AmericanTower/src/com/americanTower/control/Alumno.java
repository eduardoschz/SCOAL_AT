/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.control;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Sanchez
 */
public class Alumno implements Serializable{

    private String nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String matricula;
    private Double promGral;
    private ArrayList<Materia> materias;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidoPat, String apellidoMat, String matricula) {
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.matricula = matricula;
        this.promGral = 0.0;
        this.materias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getPromGral() {
        return promGral;
    }

    public void setPromGral(Double promGral) {
        this.promGral = promGral;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;

    }

    public void calculaPromedio(){
        double temp1 = 0;
        for (int i = 0; i < materias.size(); i++) {
            temp1 = materias.get(i).calificacion();
        }
        promGral = temp1;
        temp1 =0;
    }
    
    public String printToCSV() {
        StringBuilder temp = new StringBuilder();
        temp.append(this.apellidoPat).append(", ").append(this.apellidoMat).append(", ").append(this.nombre).append(", ");
        
        for (int i = 0; i < materias.size(); i++) {
            temp.append(materias.get(i).printToCSV());
        }
        temp.setCharAt(temp.length()-1, '\u0000');
        return temp.toString();
    }

}
