/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Diego
 */
public class InsertForm extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet st=null;
    PreparedStatement ps=null;
    /**
     * Creates new form InsertForm
     */
    String Estado;
    String Puesto;
    String genero;
    String Turno;
    public InsertForm() {
        initComponents();
        conn = DbConexion.getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    void reset(){  
                        txtDni.setText("");
                        txtNombres.setText("");
                        txtApellMa.setText("");
                        txtApellPa.setText("");
                        txtPais.setText("");
                        genero="";
                        Estado="";
                        txtEstadoCivil.setSelectedIndex(0);
                        txtCelular.setText("");
                        txtCorreo.setText("");
                        txtDirec.setText("");
                        Puesto="";
                        txtPuesto.setSelectedIndex(0);
                        Turno="";
                        txtSueldo.setText("");
                        
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellPa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellMa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        g_Mas = new javax.swing.JRadioButton();
        g_Fem = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtEstadoCivil = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDirec = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtSueldo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar Datos del Empleado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("DNI");

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Nombres");

        txtNombres.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Apellidos Paterno");

        txtApellPa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellPa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtApellPa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellPaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Apellidos Materno");

        txtApellMa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtApellMa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtApellMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellMaKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Pais de nacimiento");

        txtPais.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPais.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaisKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Genero");

        g_Mas.setBackground(new java.awt.Color(255, 255, 255));
        g_Mas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        g_Mas.setText("M");
        g_Mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_MasActionPerformed(evt);
            }
        });

        g_Fem.setBackground(new java.awt.Color(255, 255, 255));
        g_Fem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        g_Fem.setText("F");
        g_Fem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_FemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Estado Civil");

        txtEstadoCivil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Soltero(s)", "Casado(c)", "Viudo(v)" }));
        txtEstadoCivil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoCivilActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Celular");

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCelular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Correo Laboral");

        txtCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Direccion");

        txtDirec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDirec.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtDirec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDirecKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Puesto");

        txtPuesto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Sub-Gerente", "Farmaceutico", "Tecnico en Farmarcia", " ", " " }));
        txtPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPuestoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Turno");

        txtTurno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione:", "Mañana", "Tarde", "Noche", " " }));
        txtTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoActionPerformed(evt);
            }
        });

        btnInsert.setBackground(new java.awt.Color(0, 255, 255));
        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("Ingresar Nuevo Empleado");
        btnInsert.setBorderPainted(false);
        btnInsert.setName("botonIngre"); // NOI18N
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.setActionCommand("Back");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Sueldo");

        txtSueldo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSueldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellPa, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtApellMa, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(229, 229, 229))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11)
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)
                                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtPais)
                                        .addGap(79, 79, 79)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(g_Mas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(g_Fem)))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtEstadoCivil, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(159, 242, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsert)
                        .addGap(187, 187, 187))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellPa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellMa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(g_Mas)
                        .addComponent(g_Fem)
                        .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void g_MasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_MasActionPerformed
        // TODO add your handling code here:
        genero ="M";
        g_Mas.setSelected(true);
        g_Fem.setSelected(false);
    }//GEN-LAST:event_g_MasActionPerformed

    private void txtEstadoCivilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoCivilActionPerformed
      
       if (txtEstadoCivil.getSelectedItem().equals("Soltero(s)")){
           Estado = "s";
       } else if (txtEstadoCivil.getSelectedItem().equals("Casado(c)")){
           Estado = "c";
       } else if (txtEstadoCivil.getSelectedItem().equals("Viudo(v)")){
           Estado = "v";
       }        
//Solero (a)
//Casado (a)
//Viudo (a)
    }//GEN-LAST:event_txtEstadoCivilActionPerformed

    private void txtPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPuestoActionPerformed
       if (txtPuesto.getSelectedItem().equals("Sub-Gerente")){
           Puesto = "Sub-Gerente";
       } else if (txtPuesto.getSelectedItem().equals("Farmaceutico")){
           Puesto = "Farmaceutico";
       } else if (txtPuesto.getSelectedItem().equals("Tecnico en Farmarcia")){
           Puesto = "Tecnico en Farmarcia";
       }   
/*

Sub-Gerente
Farmaceutico
Tecnico en Farmarcia
*/

    }//GEN-LAST:event_txtPuestoActionPerformed

    private void txtTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoActionPerformed
        
        if (txtTurno.getSelectedItem().equals("Mañana")){
           Turno = "Mañana";
       } else if (txtTurno.getSelectedItem().equals("Tarde")){
           Turno = "Tarde";
       } else if (txtTurno.getSelectedItem().equals("Noche")){
           Turno = "Noche";
       }
       /*
Mañana
Tarde
Noche
*/
    }//GEN-LAST:event_txtTurnoActionPerformed

    private void g_FemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_FemActionPerformed
        // TODO add your handling code here:
        genero ="F";
        g_Mas.setSelected(false);
        g_Fem.setSelected(true);
    }//GEN-LAST:event_g_FemActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        panelOpciones i = new panelOpciones();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        int num= Integer.parseInt(txtCelular.getText());
        int cont=0;
        for(int i=1;i<txtCorreo.getText().length();i++)
        {
            char a=txtCorreo.getText().charAt(i);
            if(a=='@'){
                cont++;
            }
            
        }
        if  (   txtPuesto.getSelectedItem().equals("Seleccione") ||
                txtTurno.getSelectedItem().equals("Seleccione") ||
                txtPuesto.getSelectedItem().equals("Seleccione") ||
                genero =="" || 
                txtNombres.getText().isEmpty() ||
                txtApellMa.getText().isEmpty() || 
                txtApellPa.getText().isEmpty() || 
                txtDni.getText().isEmpty() || 
                txtPais.getText().isEmpty()|| 
                txtCelular.getText().isEmpty()|| 
                txtCorreo.getText().isEmpty()|| 
                txtDirec.getText().isEmpty()|| 
                txtSueldo.getText().isEmpty()||
                txtDni.getText().length() <8 ||
                txtCelular.getText().length() <9 ||
                num < 900000000 || 
                num > 999999999 ||
                cont!=1                 
                ){ 
    
            JOptionPane.showMessageDialog(null, "Falta datos por llenar o datos equivocos (DNI o Numero de celular invalido o correo) ");
        
        }   else{ 
                int p;
                p = JOptionPane.showConfirmDialog(null,"Seguro de la informacion ingresada?", "Agregar informacion",JOptionPane.YES_NO_OPTION);
                if (p==0){                    
                    try {
                        String sql = "INSERT INTO `empleado`(`DNI`, `Nombres`, `ApellidoMat`, `ApellidoPat`, `PaisNaciento`, `Genero`, `EstadoCivil`, `Celular`, `CorreoLaboral`, `Direccion`, `Puesto`, `Turno`, `sueldo`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
                        ps = conn.prepareStatement(sql);
                        ps.setString(1,txtDni.getText());
                        ps.setString(2, txtNombres.getText());
                        ps.setString(3, txtApellMa.getText());
                        ps.setString(4, txtApellPa.getText());
                        ps.setString(5, txtPais.getText());
                        ps.setString(6, genero);
                        ps.setString(7, Estado);
                        ps.setString(8, txtCelular.getText());
                        ps.setString(9, txtCorreo.getText());
                        ps.setString(10, txtDirec.getText());
                        ps.setString(11, Puesto);
                        ps.setString(12, Turno);
                        ps.setString(13, txtSueldo.getText());  
                        
                        ps.execute();
                        JOptionPane.showMessageDialog(null, "La carga se realizo con exito");
                        reset();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                    
                }
            }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
            evt.consume();
        if (txtDni.getText().length() == 8){
            evt.consume();
        } 
        
       
        
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if (c<'0' || c>'9') 
            evt.consume();
        if (txtCelular.getText().length() == 9){
            evt.consume();
        }
        
        
    }//GEN-LAST:event_txtCelularKeyTyped

    private void txtSueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if ((c<'0' || c>'9') && ( c<'.' || c>'.')) 
            evt.consume();
    }//GEN-LAST:event_txtSueldoKeyTyped

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if ((c<'A' || c>'Z') && ( c<'a' || c>'z')) 
            evt.consume();
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellPaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellPaKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if ((c<'A' || c>'Z') && ( c<'a' || c>'z')) 
            evt.consume();
    }//GEN-LAST:event_txtApellPaKeyTyped

    private void txtApellMaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellMaKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if ((c<'A' || c>'Z') && ( c<'a' || c>'z')) 
            evt.consume();
    }//GEN-LAST:event_txtApellMaKeyTyped

    private void txtDirecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDirecKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if ((c<'A' || c>'Z') && ( c<'a' || c>'z')&& ( c<'-' || c>'-')&& ( c<' ' || c>' ') && ( c<'.' || c>'.') && (c<'0' || c>'9')  ) 
            evt.consume(); 
        
    }//GEN-LAST:event_txtDirecKeyTyped

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if ((c<'A' || c>'Z') && ( c<'a' || c>'z')&& (c<'0' || c>'9') && ( c<'-' || c>'-')&& ( c<'@' || c>'@') && ( c<'.' || c>'.')&& ( c<'_' || c>'_')) 
            evt.consume(); 
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaisKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if ((c<'A' || c>'Z') && ( c<'a' || c>'z') && ( c<' ' || c>' ')) 
            evt.consume();
    }//GEN-LAST:event_txtPaisKeyTyped

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
            java.util.logging.Logger.getLogger(InsertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JRadioButton g_Fem;
    private javax.swing.JRadioButton g_Mas;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellMa;
    private javax.swing.JTextField txtApellPa;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDirec;
    private javax.swing.JTextField txtDni;
    private javax.swing.JComboBox<String> txtEstadoCivil;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPais;
    private javax.swing.JComboBox<String> txtPuesto;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JComboBox<String> txtTurno;
    // End of variables declaration//GEN-END:variables
}
