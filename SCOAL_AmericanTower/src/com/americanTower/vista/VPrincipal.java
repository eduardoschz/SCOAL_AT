/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.americanTower.vista;

import com.americanTower.control.Alumno;
import com.americanTower.archivo.Archivo;
import com.americanTower.control.Materia;
import com.americanTower.control.Parcial;
import com.americanTower.modelo.ModeloTablaParciales;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Eduardo Sanchez
 */
public class VPrincipal extends javax.swing.JFrame {

    private ArrayList<Alumno> lista = new ArrayList<>();
    private ArrayList<Integer> index = new ArrayList<>();
    private Alumno temp;
    private int indice;
    private Archivo archivo = new Archivo();
    private DefaultListModel modeloLista = new DefaultListModel();
    private ModeloTablaParciales mtp;
    private ArrayList<JTextField> txts = new ArrayList<>();
    private ArrayList<JCheckBox> chk = new ArrayList<>();
    private JButton btnOk;

    public VPrincipal() {
        initComponents();
        listBusqueda.setModel(modeloLista);

        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        lblBusqueda = new javax.swing.JLabel();
        cbxCriterio = new javax.swing.JComboBox<>();
        lblCriterio = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        lblPaterno = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        lblMaterno = new javax.swing.JLabel();
        scrollList = new javax.swing.JScrollPane();
        listBusqueda = new javax.swing.JList<>();
        scrollTabla = new javax.swing.JScrollPane();
        tblCalificaciones = new javax.swing.JTable();
        panCambios = new javax.swing.JPanel();
        btnNuevas = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelParciales = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        lblPath = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLabel2 = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuNuevo = new javax.swing.JMenuItem();
        menuCerrar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuGuardar = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistma de Control de Alumnos");

        txtBuscar.setToolTipText("Busqueda por algun criterio");

        lblBusqueda.setText("Busqueda");

        cbxCriterio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Apellido Materno", "Apellido Paterno", "Matricula" }));
        cbxCriterio.setToolTipText("Seleccione el criterio de busqueda");

        lblCriterio.setText("Criterio");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblMatricula.setText("Matricula");

        lblNombre.setText("Nombre");

        lblPaterno.setText("Apellido Paterno");

        lblMaterno.setText("Apellido Materno");

        listBusqueda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listBusqueda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listBusqueda.setVisibleRowCount(4);
        listBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listBusquedaMouseClicked(evt);
            }
        });
        scrollList.setViewportView(listBusqueda);

        tblCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scrollTabla.setViewportView(tblCalificaciones);

        panCambios.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambios"));

        btnNuevas.setText("Nuevo Parcial");
        btnNuevas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevasActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");

        jButton1.setText("Eliminar Parcial");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panCambiosLayout = new javax.swing.GroupLayout(panCambios);
        panCambios.setLayout(panCambiosLayout);
        panCambiosLayout.setHorizontalGroup(
            panCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCambiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panCambiosLayout.createSequentialGroup()
                        .addComponent(btnNuevas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panCambiosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panCambiosLayout.setVerticalGroup(
            panCambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCambiosLayout.createSequentialGroup()
                .addComponent(btnNuevas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelParciales.setBorder(javax.swing.BorderFactory.createTitledBorder("Cambios"));

        javax.swing.GroupLayout panelParcialesLayout = new javax.swing.GroupLayout(panelParciales);
        panelParciales.setLayout(panelParcialesLayout);
        panelParcialesLayout.setHorizontalGroup(
            panelParcialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelParcialesLayout.setVerticalGroup(
            panelParcialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        jLabel1.setText("Ruta archivo: ");
        jToolBar1.add(jLabel1);

        lblPath.setText("path");
        jToolBar1.add(lblPath);
        jToolBar1.add(jSeparator2);

        jLabel2.setText("Tamaño: ");
        jToolBar1.add(jLabel2);

        lblPeso.setText("0 Kb");
        jToolBar1.add(lblPeso);
        jToolBar1.add(jSeparator3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(lblMatricula)
                            .addComponent(lblBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCriterio)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbxCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scrollList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPaterno)
                            .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMaterno)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panCambios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelParciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBusqueda)
                    .addComponent(lblCriterio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(scrollList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxCriterio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblMatricula)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaterno)
                    .addComponent(lblPaterno)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panCambios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelParciales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Archivo");

        menuAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuAbrir.setText("Abrir lista");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        menuNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuNuevo.setText("Nueva lista de alumnos");
        menuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(menuNuevo);

        menuCerrar.setText("Cerrar");
        menuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCerrar);
        jMenu1.add(jSeparator1);

        menuGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuGuardar.setText("Guardar...");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuGuardarComo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuGuardarComo.setText("Exportar a CSV...");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardarComo);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarActionPerformed
        limparFormulario();
    }//GEN-LAST:event_menuCerrarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        lista = archivo.leerArchivoAlumnos_S();
        this.lblPath.setText(" " + archivo.getUbicacion());
        this.lblPeso.setText(" " + archivo.getPeso());
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        archivo.guardarArchivoAlumnos_S(lista);
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        modeloLista.clear();
        buscar((String) this.cbxCriterio.getSelectedItem(), txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void menuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevoActionPerformed
        new VListaAlumno().setVisible(true);
    }//GEN-LAST:event_menuNuevoActionPerformed

    private void listBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listBusquedaMouseClicked
        if (evt.getClickCount() == 2) {
            this.txtNombre.setText(lista.get(index.get(listBusqueda.getSelectedIndex())).getNombre());
            this.txtPaterno.setText(lista.get(index.get(listBusqueda.getSelectedIndex())).getApellidoPat());
            this.txtMaterno.setText(lista.get(index.get(listBusqueda.getSelectedIndex())).getApellidoMat());
            this.txtMatricula.setText(lista.get(index.get(listBusqueda.getSelectedIndex())).getMatricula());
            int a = listBusqueda.getSelectedIndex();
            int b = index.get(a);
            Alumno t = lista.get(b);
            mtp = new ModeloTablaParciales();
            mtp.setAlumno(t);

            this.tblCalificaciones.setModel(mtp);
            this.tblCalificaciones.revalidate();
        }
    }//GEN-LAST:event_listBusquedaMouseClicked

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        archivo.generaCSV(lista);
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void btnNuevasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevasActionPerformed
        GridLayout gl = new GridLayout(mtp.getAlumno().getMaterias().size() + 1, 2);
        panelParciales.setLayout(gl);
        for (int i = 0; i < mtp.getAlumno().getMaterias().size(); i++) {
            JTextField txtTemp = new JTextField();
            txtTemp.setSize(30, 20);
            txts.add(txtTemp);
        }
        for (int i = 0; i < mtp.getAlumno().getMaterias().size(); i++) {
            JLabel lblTemp = new JLabel(mtp.getAlumno().getMaterias().get(i).getNombre());
            lblTemp.setSize(30, 20);

            panelParciales.add(lblTemp);
            panelParciales.add(txts.get(i));
        }
        btnOkNew();
        btnOk.setSize(30, 20);
        panelParciales.add(btnOk);
        panelParciales.revalidate();

    }//GEN-LAST:event_btnNuevasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GridLayout gl = new GridLayout(1, mtp.getAlumno().getMaterias().size() + 1);
        panelParciales.setLayout(gl);
        for (int i = 0; i < mtp.getAlumno().getMaterias().get(0).getParciales().size(); i++) {
            JCheckBox tempC = new JCheckBox("Parcial " + (i + 1));

            chk.add(tempC);
        }
        for (int i = 0; i < mtp.getAlumno().getMaterias().get(0).getParciales().size(); i++) {
            panelParciales.add(chk.get(i));
        }
        btnOkDel();
        panelParciales.add(btnOk);
        panelParciales.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void btnOkNew() {
        btnOk = new JButton("OK");
        btnOk.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                ArrayList<Materia> temp = mtp.getAlumno().getMaterias();
                for (int i = 0; i < temp.size(); i++) {
                    temp.get(i).nuevaCalificacion(Double.parseDouble(txts.get(i).getText()));
                    txts.get(i).setText("");
                }
                panelParciales.removeAll();
                panelParciales.repaint();
            }

        });

        this.tblCalificaciones.revalidate();
        this.tblCalificaciones.repaint();
    }

    public void btnOkDel() {
        btnOk = new JButton("OK");
        btnOk.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                ArrayList<Parcial> temp = mtp.getAlumno().getMaterias().get(0).getParciales();
                for (int i = 0; i < temp.size(); i++) {
                    if (chk.get(i).isSelected()) {
                        for (int j = 0; j < mtp.getAlumno().getMaterias().size(); j++) {
                            mtp.getAlumno().getMaterias().get(i).getParciales().remove(j-1);
                        }
                    }
                }
                chk.clear();
                panelParciales.removeAll();
                panelParciales.repaint();
            }

        });

        this.tblCalificaciones.revalidate();
        this.tblCalificaciones.repaint();
    }

    private void limparFormulario() {
        this.txtBuscar.setText("");
        this.txtMaterno.setText("");
        this.txtPaterno.setText("");
        this.txtNombre.setText("");
    }

    private void buscar(String criterio, String elemento) {
        if (txtBuscar.getText().equals("") || txtBuscar.getText().equals(" ")) {
            JOptionPane.showMessageDialog(this, "Debe escribir almenos un caracter para realizar la busqueda", "SCOAL", JOptionPane.INFORMATION_MESSAGE);
        } else {
            index.clear();
            switch (criterio) {
                case "Nombre":
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getNombre().startsWith(elemento)) {
                            modeloLista.addElement(lista.get(i).nombreCompleto());
                            index.add(i);
                        }
                        listBusqueda.revalidate();
                    }
                    if (listBusqueda.getModel().getSize() == 0) {
                        JOptionPane.showMessageDialog(this, "No hay registros con la caracteristica buscada", "SCOAL", JOptionPane.INFORMATION_MESSAGE);
                    }
                    limparFormulario();
                    break;
                case "Apellido Paterno":
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getApellidoPat().startsWith(elemento)) {
                            modeloLista.addElement(lista.get(i).nombreCompleto());
                        }
                        listBusqueda.revalidate();
                    }
                    if (listBusqueda.getModel().getSize() == 0) {
                        JOptionPane.showMessageDialog(this, "No hay registros con la caracteristica buscada", "SCOAL", JOptionPane.INFORMATION_MESSAGE);
                    }
                    limparFormulario();
                    break;
                case "Apellido Materno":
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getApellidoMat().startsWith(elemento)) {
                            modeloLista.addElement(lista.get(i).nombreCompleto());
                        }
                        listBusqueda.revalidate();
                    }
                    if (listBusqueda.getModel().getSize() == 0) {
                        JOptionPane.showMessageDialog(this, "No hay registros con la caracteristica buscada", "SCOAL", JOptionPane.INFORMATION_MESSAGE);
                    }
                    limparFormulario();
                    break;
                case "Matricula":
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getMatricula().startsWith(elemento)) {
                            modeloLista.addElement(lista.get(i).nombreCompleto());
                        }
                        listBusqueda.revalidate();
                    }
                    if (listBusqueda.getModel().getSize() == 0) {
                        JOptionPane.showMessageDialog(this, "No hay registros con la caracteristica buscada", "SCOAL", JOptionPane.INFORMATION_MESSAGE);
                    }
                    limparFormulario();
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnNuevas;
    private javax.swing.JComboBox<String> cbxCriterio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCriterio;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblMatricula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JList<String> listBusqueda;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuCerrar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JMenuItem menuNuevo;
    private javax.swing.JPanel panCambios;
    private javax.swing.JPanel panelParciales;
    private javax.swing.JScrollPane scrollList;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tblCalificaciones;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtMaterno;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables
}
