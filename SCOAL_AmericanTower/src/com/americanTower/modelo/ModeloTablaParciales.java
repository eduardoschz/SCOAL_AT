/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.modelo;

import com.americanTower.control.Alumno;
import com.americanTower.control.Materia;
import com.americanTower.control.Parcial;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Eduardo Sanchez
 */
public class ModeloTablaParciales implements TableModel {

    private Alumno alumno;
    private ArrayList<Materia> materias;

    public ModeloTablaParciales() {
    }

    public ModeloTablaParciales(Alumno a) {
        super();
        this.alumno = a;
        this.materias = a.getMaterias();
    }

    public Alumno getAlumno() {
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
        return this.alumno.getMaterias().get(0).getParciales().size() + 1;
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
                return String.class;
        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //Todas las celdas NO son editables
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        materias = alumno.getMaterias();
        for (int i = 0; i < materias.size(); i++) {
            System.out.println(materias.get(i).getNombre());
        }
        Materia temp = materias.get(rowIndex);
        System.out.println("ri" + temp.getNombre());

        switch (columnIndex) {
            case 0:
                return temp.getNombre();
            default:
                return String.format("%.2f", temp.getParciales().get(columnIndex - 1).getCalificacion());
        }

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
