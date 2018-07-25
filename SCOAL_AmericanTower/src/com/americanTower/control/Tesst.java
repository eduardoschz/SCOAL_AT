/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.control;

import com.americanTower.archivo.Archivo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Eduardo Sanchez
 */
public class Tesst {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<Materia> materias = new ArrayList<>();
        ArrayList<Parcial> parciales = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            parciales.add(new Parcial(i + 1, new Random().nextInt(5) + 5.0));
        }

        for (int i = 0; i < 5; i++) {
            materias.add(new Materia("M" + i));
        }

        for (int i = 0; i < materias.size(); i++) {
            materias.get(i).setParciales(parciales);
        }

        for (int i = 0; i < 10; i++) {
            alumnos.add(new Alumno("N" + i, "AP" + i, "AM" + i, "MAT" + i));
        }

        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).setMaterias(materias);
        }

        new Archivo().generaCSV(alumnos);

    }

}
