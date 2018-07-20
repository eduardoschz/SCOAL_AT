/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Eduardo Sanchez
 */
public class Archivo {

    public static void generarArchivoCSV(ArrayList<Alumno> datos) {
        try {
            File archivo = new File("archivo2.csv");
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < datos.size(); i++) {
                bw.write(datos.get(i).printToCSV());
                bw.newLine();
            }
            bw.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void leeArchivoCSV(){
        
    }
}
