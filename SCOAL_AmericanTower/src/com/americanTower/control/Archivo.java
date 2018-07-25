/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Sanchez
 */
public class Archivo {

    private String nombre, peso, ubicacion;

    public Archivo() {
        this.nombre = "";
        this.peso = "";
        this.ubicacion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void generaCSV(ArrayList<Alumno> datos) {
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

    public void guardarArchivoAlumnos_S(ArrayList datos) {
        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay registros para guardar", "SCOAL - Lista Alumnos", JOptionPane.INFORMATION_MESSAGE);
        } else {
            FileOutputStream fos = null;
            JFileChooser jfc = new JFileChooser();

            try {
                jfc.setCurrentDirectory(new File(System.getProperty("user.dir") + File.pathSeparator + "Documents"));
                int a = jfc.showSaveDialog(null);
                if (a == JFileChooser.APPROVE_OPTION) {
                    File archivo = new File(jfc.getSelectedFile() + ".lst");

                    fos = new FileOutputStream(archivo);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (int i = 0; i < datos.size(); i++) {
                        oos.writeObject(datos.get(i));
                    }

                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    public ArrayList leerArchivoAlumnos_S() {
        FileInputStream fis = null;
        JFileChooser jfc = new JFileChooser();
        jfc.addChoosableFileFilter(new FiltroListaAlumnos());

        ArrayList<Object> datos = new ArrayList<>();

        try {
            jfc.setCurrentDirectory(new File(System.getProperty("user.dir") + File.pathSeparator + "Documents"));

            int a = jfc.showOpenDialog(null);

            if (a == JFileChooser.APPROVE_OPTION) {
                File archivo = new File(jfc.getSelectedFile() + "");
                this.nombre = archivo.getName();
                this.peso = archivo.length() > 1024 ? String.valueOf(archivo.length() / 1024) + "Kb" : String.valueOf(archivo.length()) + "b";
                this.ubicacion = archivo.getCanonicalPath();
                fis = new FileInputStream(archivo);
                
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (fis.available() != 0) {
                    Alumno p = (Alumno) ois.readObject();
                    datos.add(p);
                }

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (NullPointerException ex){
                //ex.printStackTrace();
            }
        }
        return datos;
    }

    public void guardarArchivoMaterias_S(ArrayList datos) {
        if (datos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay materias para guardar", "SCOAL - Materias", JOptionPane.INFORMATION_MESSAGE);
        } else {
            FileOutputStream fos = null;
            JFileChooser jfc = new JFileChooser();

            try {
                jfc.setCurrentDirectory(new File(System.getProperty("user.dir") + File.pathSeparator + "Documents"));
                int a = jfc.showSaveDialog(null);
                if (a == JFileChooser.APPROVE_OPTION) {
                    File archivo = new File(jfc.getSelectedFile() + ".lmt");

                    fos = new FileOutputStream(archivo);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    for (int i = 0; i < datos.size(); i++) {
                        oos.writeObject(datos.get(i));
                    }

                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    fos.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }
    
    public ArrayList leerArchivoMaterias_S() {
        FileInputStream fis = null;
        JFileChooser jfc = new JFileChooser();
        jfc.addChoosableFileFilter(new FiltroListaAlumnos());

        ArrayList<Object> datos = new ArrayList<>();

        try {
            jfc.setCurrentDirectory(new File(System.getProperty("user.dir") + File.pathSeparator + "Documents"));

            int a = jfc.showOpenDialog(null);

            if (a == JFileChooser.APPROVE_OPTION) {
                File archivo = new File(jfc.getSelectedFile() + "");
                
                fis = new FileInputStream(archivo);
                
                ObjectInputStream ois = new ObjectInputStream(fis);

                while (fis.available() != 0) {
                    Materia m = (Materia) ois.readObject();
                    datos.add(m);
                }

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (NullPointerException ex){
                //ex.printStackTrace();
            }
        }
        return datos;
    }
}
