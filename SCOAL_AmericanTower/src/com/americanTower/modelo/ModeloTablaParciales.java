/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.modelo;

import com.americanTower.control.Alumno;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Eduardo Sanchez
 */
public class ModeloTablaParciales implements TableModel {

    private Alumno alumno;

    public ModeloTablaParciales() {
    }

    public ModeloTablaParciales(Alumno datos) {
        super();
        this.alumno = datos;
    }

    public Alumno getDatos() {
        return alumno;
    }

    public void setAlumno(Alumno datos) {
        this.alumno = datos;
    }

    @Override
    public int getRowCount() {
        return alumno.getMaterias().size();
    }

    @Override
    public int getColumnCount() {
        return alumno.getMaterias().get(0).getParciales().size();
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colName = "";
        switch (columnIndex) {
            case 0:
                colName = "Materia";
                break;
            default:
                colName = "Parcial " + columnIndex;
                break;
        }
        return colName;

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            default:
                return Double.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //Todas las celdas NO son editables
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        //
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        //
    }
}
