/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.control;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author m01
 */
public class FiltroListaAlumnos extends FileFilter {

    private String ext;
    private String descripcion;

    public FiltroListaAlumnos() {
        this.ext = ".lst";
        this.descripcion = "*.lst - Lista de Alumnos";
    }

    @Override
    public boolean accept(File f) {
        return f.getName().toLowerCase().endsWith(this.ext) || f.isDirectory();
    }

    @Override
    public String getDescription() {
        return this.descripcion;
    }

}
