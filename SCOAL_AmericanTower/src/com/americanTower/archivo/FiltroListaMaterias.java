/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.archivo;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Eduardo Sanchez
 */
public class FiltroListaMaterias extends FileFilter{

    private String ext;
    private String descripcion;

    public FiltroListaMaterias() {
    this.ext = ".lmt";
    this.descripcion = ".lmt - Lista de Materias";
    }
    
    @Override
    public boolean accept(File f) {
        return f.getName().toLowerCase().endsWith(this.ext) || f.isDirectory();    }

    @Override
    public String getDescription() {
        return this.descripcion;
    }
    
}
