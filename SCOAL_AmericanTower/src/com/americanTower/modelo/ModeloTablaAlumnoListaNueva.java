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
 * @author Eduardo Sanchez_2
 */
public class ModeloTablaAlumnoListaNueva implements TableModel {

    private ArrayList<Alumno> datos;

    public ModeloTablaAlumnoListaNueva() {
    }

    public ModeloTablaAlumnoListaNueva(ArrayList<Alumno> datos) {
        super();
        this.datos = datos;
    }

    public ArrayList<Alumno> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Alumno> datos) {
        this.datos = datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String colName = "";
        switch (columnIndex) {
            case 0:
                colName = "Nombre";
                break;
            case 1:
                colName = "Apellido Paterno";
                break;
            case 2:
                colName = "Apellido Materno";
                break;
            default:
            case 3:
                colName = "ND";
                break;
        }
        return colName;

    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            default:
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //Todas las celdas NO son editables
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno temp = datos.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return temp.getNombre();
            case 1:
                return temp.getApellidoPat();
            case 2:
                return temp.getApellidoMat();
            default:
                break;

        }
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
