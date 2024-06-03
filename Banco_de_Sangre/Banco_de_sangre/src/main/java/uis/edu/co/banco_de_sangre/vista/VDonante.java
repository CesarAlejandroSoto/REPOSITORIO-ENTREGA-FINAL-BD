
package uis.edu.co.banco_de_sangre.vista;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import uis.edu.co.banco_de_sangre.controlador.CDonante;
import uis.edu.co.banco_de_sangre.modelo.Donante;


public class VDonante extends javax.swing.JFrame {

    /**
     * Creates new form VDonante
     */
    public VDonante() {
        initComponents();
        
    DefaultTableModel modelo = (DefaultTableModel) tblDonantes.getModel();
    modelo.setColumnIdentifiers(new Object[]{"ID Donante", "Nombre", "Apellido", "Documento", "Grupo Sanguíneo", "Fecha Última Donación", "Fecha de Nacimiento"});
    
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblIdDonante = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDocumento = new javax.swing.JLabel();
        lblIdGrupoSanguineo = new javax.swing.JLabel();
        lblFechaUltimaDonacion = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdDonante = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtFechaUltimaDonacion = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cmbGrupoSanguineo = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        lblFechaDeNacimiento = new javax.swing.JLabel();
        txtFechaDeNacimiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDonantes = new javax.swing.JTable();
        btnBuscarPorGrupoSanguineo = new javax.swing.JButton();
        btnAlarmaDonacionesAntiguas = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        lblIdDonante.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdDonante.setForeground(new java.awt.Color(255, 255, 255));
        lblIdDonante.setText("Donante_Id");

        lblNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblApellido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setText("Apellido");

        lblDocumento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(255, 255, 255));
        lblDocumento.setText("Documento");

        lblIdGrupoSanguineo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblIdGrupoSanguineo.setForeground(new java.awt.Color(255, 255, 255));
        lblIdGrupoSanguineo.setText("IdGrupoSanguineo");

        lblFechaUltimaDonacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaUltimaDonacion.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaUltimaDonacion.setText("FechaUltimaDonacion");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/consultar.png"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/registrar.png"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/eliminar.png"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        cmbGrupoSanguineo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. 'A+'", "2. 'A-'", "3. 'B+'", "4. 'B-'", "5. 'AB+'", "6. 'AB-'", "7. 'O+'", "8. 'O-'" }));
        cmbGrupoSanguineo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGrupoSanguineoActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblFechaDeNacimiento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblFechaDeNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaDeNacimiento.setText("FechaDeNacimiento");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DONANTES");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CONSULTAR");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REGISTRAR");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ELIMINAR");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CERRAR");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/CRUZ ROJA 1.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/CRUZ ROJA 1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNombre)
                                            .addComponent(lblIdDonante)
                                            .addComponent(lblApellido)
                                            .addComponent(lblDocumento)
                                            .addComponent(lblIdGrupoSanguineo)
                                            .addComponent(lblFechaUltimaDonacion)
                                            .addComponent(lblFechaDeNacimiento))
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtIdDonante)
                                            .addComponent(txtNombre)
                                            .addComponent(txtApellido)
                                            .addComponent(txtDocumento)
                                            .addComponent(txtFechaUltimaDonacion)
                                            .addComponent(cmbGrupoSanguineo, 0, 253, Short.MAX_VALUE)
                                            .addComponent(txtFechaDeNacimiento)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3))
                                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel4)))
                                        .addGap(56, 56, 56))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdDonante)
                    .addComponent(txtIdDonante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdGrupoSanguineo)
                    .addComponent(cmbGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaUltimaDonacion)
                    .addComponent(txtFechaUltimaDonacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaDeNacimiento)
                    .addComponent(txtFechaDeNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        tblDonantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDonantes);

        btnBuscarPorGrupoSanguineo.setBackground(new java.awt.Color(102, 153, 255));
        btnBuscarPorGrupoSanguineo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBuscarPorGrupoSanguineo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPorGrupoSanguineo.setText("BUSCAR POR GRUPO SANGUINEO");
        btnBuscarPorGrupoSanguineo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPorGrupoSanguineoActionPerformed(evt);
            }
        });

        btnAlarmaDonacionesAntiguas.setBackground(new java.awt.Color(102, 153, 255));
        btnAlarmaDonacionesAntiguas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAlarmaDonacionesAntiguas.setForeground(new java.awt.Color(255, 255, 255));
        btnAlarmaDonacionesAntiguas.setText("DONACIONES ANTIGUAS");
        btnAlarmaDonacionesAntiguas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlarmaDonacionesAntiguasActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CESAR ALEJANDRO SOTO");

        jLabel12.setFont(new java.awt.Font("Goudy Old Style", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("GABRIEL VERA MORENO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnBuscarPorGrupoSanguineo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlarmaDonacionesAntiguas)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarPorGrupoSanguineo, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(btnAlarmaDonacionesAntiguas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String documento = txtDocumento.getText();
        int indiceSeleccionado = cmbGrupoSanguineo.getSelectedIndex();
        int grupoSanguineoId = indiceSeleccionado + 1;
        String fechaUltimaDonacion = txtFechaUltimaDonacion.getText();
        String fechaDeNacimiento = txtFechaDeNacimiento.getText();
        
        if (nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty() || fechaUltimaDonacion.isEmpty() || fechaDeNacimiento.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
        return;
        }
        
        Donante nuevoDonante = new Donante(0, nombre, apellido, documento, grupoSanguineoId, fechaUltimaDonacion, fechaDeNacimiento);
        
        CDonante controlador = new CDonante();
        controlador.registrarDonantes(nuevoDonante);
    
   
        limpiarCampos();
        actualizarTabla();
        
        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    private void cmbGrupoSanguineoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGrupoSanguineoActionPerformed
        String opcionSeleccionada = cmbGrupoSanguineo.getSelectedItem().toString();
    
    }//GEN-LAST:event_cmbGrupoSanguineoActionPerformed
    public void actualizarTabla(){
    CDonante controlador = new CDonante();
    ResultSet resultadoConsulta = controlador.consultarDonantes();
    if (resultadoConsulta != null) {
        
        DefaultTableModel model = (DefaultTableModel) tblDonantes.getModel();
        
        
        model.setRowCount(0);
        
        
        String[] columnas = {"ID", "Nombre", "Apellido", "Documento", "Grupo Sanguíneo", "Fecha Última Donación","Fecha de Nacimineto"};
        model.setColumnIdentifiers(columnas);
        
        try {
            
            while (resultadoConsulta.next()) {
                Object[] fila = {
                    resultadoConsulta.getInt("id_donante"),
                    resultadoConsulta.getString("nombre"),
                    resultadoConsulta.getString("apellido"),
                    resultadoConsulta.getString("documento"),
                    resultadoConsulta.getInt("grupo_sanguineo_id"),
                    resultadoConsulta.getString("fecha_ultima_donacion"),
                    resultadoConsulta.getString("fecha_de_nacimiento")
                };
                model.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VDonante.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA TABLA: "+ex.getMessage());
        }
    }
    
    }
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
    String idDonanteTexto = txtIdDonante.getText();
    actualizarTabla();
    
    
    if (idDonanteTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del donante a consultar.");
        return;
    }
    
    
    int idDonante = Integer.parseInt(idDonanteTexto);
    
  
    CDonante controlador = new CDonante();
    Donante donante = controlador.consultarDonantePorId(idDonante);
    
  
    controlador.cargarDonanteEnTabla(tblDonantes, donante);


    }//GEN-LAST:event_btnConsultarActionPerformed
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        
    String idDonanteTexto = txtIdDonante.getText();
    
    
    if (idDonanteTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del donante a eliminar.");
        return;
    }
    
    int idDonante = Integer.parseInt(idDonanteTexto);
    
    
    int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este donante?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
    
    if (confirmacion == JOptionPane.YES_OPTION) {
        
        CDonante controlador = new CDonante();
        controlador.eliminarDonante(idDonante);
    
        
        actualizarTabla();
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

public void actualizarTablaPorGrupoSanguineo(String grupoSanguineo) {
    CDonante controlador = new CDonante();
    ResultSet resultadoConsulta = controlador.consultarDonantesPorGrupoSanguineo(grupoSanguineo);
    if (resultadoConsulta != null) {
        
        String[] columnNames = {"ID Donante", "Nombre", "Apellido", "Documento", "Grupo Sanguíneo", "Fecha Última Donación","Fecha de Nacimineto"};
        
        
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
        
        tblDonantes.setModel(model);
        
        try {
            
            while (resultadoConsulta.next()) {
                Object[] fila = {
                    resultadoConsulta.getInt("id_donante"),
                    resultadoConsulta.getString("nombre"),
                    resultadoConsulta.getString("apellido"),
                    resultadoConsulta.getString("documento"),
                    resultadoConsulta.getString("grupo_sanguineo"),
                    resultadoConsulta.getString("fecha_ultima_donacion"),
                    resultadoConsulta.getString("fecha_de_nacimiento")
                };
                model.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VDonante.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR LA TABLA: " + ex.getMessage());
        }
    }
}



    private void btnBuscarPorGrupoSanguineoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPorGrupoSanguineoActionPerformed
        String grupoSanguineo = JOptionPane.showInputDialog("Ingrese el grupo sanguíneo:");
        if (grupoSanguineo != null && !grupoSanguineo.trim().isEmpty()) {
        actualizarTablaPorGrupoSanguineo(grupoSanguineo);
        
    }
        
    }//GEN-LAST:event_btnBuscarPorGrupoSanguineoActionPerformed

    private void btnAlarmaDonacionesAntiguasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlarmaDonacionesAntiguasActionPerformed
        CDonante controlador = new CDonante();
        controlador.generarAlarmaDonacionesAntiguas();
    }//GEN-LAST:event_btnAlarmaDonacionesAntiguasActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar la interfaz?", "Cerrar interfaz", JOptionPane.YES_NO_OPTION);
        if (opcion == JOptionPane.YES_OPTION) {
        // Cerrar la interfaz
        dispose(); 
    }
    }//GEN-LAST:event_btnCerrarActionPerformed
    private void limpiarCampos() {
    txtNombre.setText("");
    txtApellido.setText("");
    txtDocumento.setText("");
    cmbGrupoSanguineo.setSelectedIndex(0);
    txtFechaUltimaDonacion.setText("");
    txtFechaDeNacimiento.setText("");
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VDonante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDonante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDonante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDonante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDonante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlarmaDonacionesAntiguas;
    private javax.swing.JButton btnBuscarPorGrupoSanguineo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbGrupoSanguineo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblFechaDeNacimiento;
    private javax.swing.JLabel lblFechaUltimaDonacion;
    private javax.swing.JLabel lblIdDonante;
    private javax.swing.JLabel lblIdGrupoSanguineo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTable tblDonantes;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtFechaDeNacimiento;
    private javax.swing.JTextField txtFechaUltimaDonacion;
    private javax.swing.JTextField txtIdDonante;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
