/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    static Scanner lea = new Scanner(System.in);
    static ArrayList<String> lista2 = new ArrayList();
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();

        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r_edad = new javax.swing.JTextField();
        r_correo = new javax.swing.JTextField();
        r_usuario = new javax.swing.JTextField();
        r_nom = new javax.swing.JTextField();
        r_clasesbb = new javax.swing.JTextField();
        r_contra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jd_logeado = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        shoe = new javax.swing.JTextArea();
        m_perfil = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        user_show = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        mostrar_q = new javax.swing.JTextField();
        m_area = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Save_o = new javax.swing.JButton();
        ta_piz = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        i_user = new javax.swing.JTextField();
        i_contra = new javax.swing.JPasswordField();

        jLabel3.setText("Nombre(Completo) ");

        jLabel4.setText("Edad");

        jLabel5.setText("Correo ");

        jLabel6.setText("Usuario");

        jLabel7.setText("Contrasena");

        jLabel8.setText("Lista de clases con ( , )");

        r_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_edadActionPerformed(evt);
            }
        });

        r_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_correoActionPerformed(evt);
            }
        });

        r_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_usuarioActionPerformed(evt);
            }
        });

        r_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_nomActionPerformed(evt);
            }
        });

        r_clasesbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clasesbbActionPerformed(evt);
            }
        });

        r_contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_contraActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setText("Registro");

        registrar.setText("Registrase");
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_registrarLayout = new javax.swing.GroupLayout(jd_registrar.getContentPane());
        jd_registrar.getContentPane().setLayout(jd_registrarLayout);
        jd_registrarLayout.setHorizontalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_registrarLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(r_clasesbb, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_registrarLayout.createSequentialGroup()
                                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(r_edad)
                                    .addComponent(r_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(r_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(r_contra, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(r_nom, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(registrar)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(r_clasesbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(109, 109, 109)
                .addComponent(registrar)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        shoe.setColumns(20);
        shoe.setRows(5);
        jScrollPane1.setViewportView(shoe);

        m_perfil.setText("Mostrar");
        m_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_perfilMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Usuario : ");

        user_show.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        user_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_showActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(m_perfil)
                        .addGap(0, 348, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_show, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_show, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(m_perfil)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Perfil", jPanel1);

        mostrar_q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrar_qMouseClicked(evt);
            }
        });
        mostrar_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_qActionPerformed(evt);
            }
        });

        m_area.setText("Mostrar");
        m_area.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_areaMouseClicked(evt);
            }
        });

        Limpiar.setText("Limpiar");
        Limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrar_q)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(Limpiar)
                .addGap(184, 184, 184)
                .addComponent(m_area)
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(mostrar_q, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(m_area)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Limpiar))))
        );

        jTabbedPane1.addTab("VIsualizar", jPanel2);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel11.setText("Ingrese los comandos");

        Save_o.setText("Guardar");
        Save_o.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Save_oMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Save_o))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ta_piz, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(345, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ta_piz, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(Save_o)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ejecutar", jPanel3);

        jButton3.setText("Cerrar Sesion");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_logeadoLayout = new javax.swing.GroupLayout(jd_logeado.getContentPane());
        jd_logeado.getContentPane().setLayout(jd_logeadoLayout);
        jd_logeadoLayout.setHorizontalGroup(
            jd_logeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_logeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_logeadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(22, 22, 22))
        );
        jd_logeadoLayout.setVerticalGroup(
            jd_logeadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_logeadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jButton1.setText("Iniciar Sesion");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1)
                            .addComponent(i_contra)
                            .addComponent(i_user, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                        .addGap(0, 67, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(i_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(i_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nom=i_user.getText();
        String contra=i_contra.getText();
        for (Usuario u: lista) {
            if (nom.equals(u.getUser()) && contra.equals(u.getContra())) {
                jd_logeado.setModal(true);
                jd_logeado.pack();
                jd_logeado.setLocationRelativeTo(this);
                jd_logeado.setVisible(true);  
            }else{
                JOptionPane.showMessageDialog(this, "El usuario y/o contrasena no son correctos");
            }
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_registrar.setModal(true);
        jd_registrar.pack();
        jd_registrar.setLocationRelativeTo(this);
        jd_registrar.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_logeado.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void r_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_edadActionPerformed

    private void r_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_correoActionPerformed

    private void r_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_usuarioActionPerformed
        
    }//GEN-LAST:event_r_usuarioActionPerformed

    private void r_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_nomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_nomActionPerformed

    private void r_clasesbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clasesbbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_clasesbbActionPerformed

    private void r_contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_contraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r_contraActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarActionPerformed

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked
        // aki we
        //String nc, int edad, String email, String user, String contra, ArrayList<String> al
        //ArrayList<Usuario> lista = new ArrayList();
        int aux=1;
        for (Usuario u: lista) {
            if (r_usuario.getText().equals(u.getUser())) {
                aux=0;
            }
        }
        if(aux==1){    
        String tokens[] = r_clasesbb.getText().split(",");
        for (int i = 0; i < tokens.length; i++) {
            lista2.add(tokens[i]);
        }
        lista.add(new Usuario(r_nom.getText(), r_edad.getText(), r_correo.getText(), r_usuario.getText(), r_contra.getText(), lista2));   
       // aux=0;
            for (int i = 0; i < lista2.size(); i++) {
                 clas.add(new projectos(lista2.get(i),null,null));
            }
        }else{
            JOptionPane.showMessageDialog(this, "El usuario ya esta registrado");
        }
        
    }//GEN-LAST:event_registrarMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void mostrar_qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_qActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrar_qActionPerformed

    private void mostrar_qMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrar_qMouseClicked
       
    }//GEN-LAST:event_mostrar_qMouseClicked

    private void m_areaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_areaMouseClicked
        //mostar clases
        mostrar_q.setText(clas.toString());
        //System.out.println("");
        
    
    }//GEN-LAST:event_m_areaMouseClicked

    private void m_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_perfilMouseClicked
        //mostar perfil
        //mostrar_q.setText(r_usuario.getText());
         user_show.setText(r_usuario.getText());
         shoe.setText(lista.toString());
         
      
        
    }//GEN-LAST:event_m_perfilMouseClicked

    private void user_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_showActionPerformed
        user_show.setText(r_usuario.getText());
    }//GEN-LAST:event_user_showActionPerformed

    private void Save_oMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Save_oMouseClicked
        /*
        Create class Cat
	Modify class Cat to Perro
	Delete class Perro
        ******************
        Add Atribute to Perro (String Name)
	Modify Atribute from Perro (String Name to int Age)
	Delete Atribute from Perro (int Age)

        */

        String comp=ta_piz.getText();
        if(comp.contains("Create class ")){
            System.out.println("save_o");
            String tokens[] = ta_piz.getText().split(" ");
            clas.add(new projectos(tokens[2],null,null));
            mostrar_q.setText(clas.toString());
        }else if(comp.contains("Modify class" )){
            String tokens2[]=ta_piz.getText().split(" ");        
            for (projectos c : clas) {
                if (tokens2[2].equals(c.getClase())){
                    c.setClase(tokens2[4]);
                }
            }
            //clas.get(pos).setClase(tokens2[4]);  
            mostrar_q.setText(clas.toString());
        }else if(comp.contains("Delete class" )){
            String tokens3[]=ta_piz.getText().split(" ");
           // int pos2=clas.indexOf(tokens3[2]);
           for (projectos c : clas) {
                if (tokens3[2].equals(c.getClase())){
                    clas.remove(c);
                }
            }
            mostrar_q.setText(clas.toString());
        }else if(comp.contains("Add Atribute to")){
            String tokens4[]=ta_piz.getText().split(" ");
            //int pos3=clas.indexOf(tokens4[3]);
            //clas.get(pos3).getAtributos().add(tokens4[5]);
            for (projectos c : clas) {
                if (tokens4[3].equals(c.getClase())){
                    String se=tokens4[4]+" "+tokens4[5];
                    c.setAtributos(se);
                }
            }
            mostrar_q.setText(clas.toString());
      /*  
        Add Atribute to Perro (String Name)
	Modify Atribute from Perro (String Name to int Age)
	Delete Atribute from Perro (int Age)
        */
        }else if(comp.contains("Modify Atribute from")){
             String tokens54[]=ta_piz.getText().split(" ");
             for (projectos c : clas) {
                if (tokens54[3].equals(c.getClase())){
                    String seda="("+tokens54[7]+" "+tokens54[8];
                    c.setAtributos(seda);
                }
            }
             //clas.get(pos4).getAtributos().remove(tokens5[6]);
             //clas.get(pos4).getAtributos().add(tokens5[9]);
             mostrar_q.setText(clas.toString());
        }else if (comp.contains("Delete Atribute from")){
             String tokens6[]=ta_piz.getText().split(" ");
             for (projectos c : clas) {
                if (tokens6[3].equals(c.getClase())){
                    clas.remove(c);
                }
            
            
        
             }
        mostrar_q.setText(clas.toString());
        }
        /*
        Add Method (public void Addition) to Perro
◦	Add Atribute to Method Addition (int x) to class perro
◦	Modify Atribute from Method Addition 5(int x to int y)9 from class perro
◦	Delete Atribute from Method Addition (int y) from class perro
◦	Modify Method (publc void Addition to public void Multiplication) from class perro
◦	Add body to Method Multiplication (Cuerpo del metodo aquí) to class perro
◦	Add constructor to class Perro
◦	Add empty constructor to class Perro
◦	Delete constructor from class Perro
◦	Delete empty constructor from class perro
◦	Delete Method Multiplication from class perro
◦	Add toString to class Perro
◦	Delete toString to class Perro
*/
        else if(comp.contains("Add Method")){
            String tokens8[]=ta_piz.getText().split(" ");
            for (projectos c : clas) {
                if (tokens8[6].equals(c.getClase())){
                    String sedas=tokens8[2]+" "+tokens8[3]+" "+tokens8[4];
                    c.setAtributos(sedas);
                }
            }          
             mostrar_q.setText(clas.toString());
            
        }
   
        else if(comp.contains("Add Atribute to Method Addition")){
            String tokens8[]=ta_piz.getText().split(" ");
            for (projectos c : clas) {
                if (tokens8[8].equals(c.getClase())){
                    String sedas2=tokens8[5]+" "+tokens8[6];
                    c.setAtributos(sedas2);
                }
            }          
             mostrar_q.setText(clas.toString());
            
        }
        else if(comp.contains("Modify Atribute from Method Addition")){
            String tokens8[]=ta_piz.getText().split(" ");
            for (projectos c : clas) {
                if (tokens8[3].equals(c.getClase())){
                    String sedas23=tokens8[5]+" "+tokens8[6]+" "+tokens8[7]+" "+tokens8[8]+" "+tokens8[9];
                    c.setAtributos(sedas23);
                }
            }          
             mostrar_q.setText(clas.toString());
            
        }
        
        
    }//GEN-LAST:event_Save_oMouseClicked

    private void LimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarMouseClicked
        mostrar_q.setText(" ");
    }//GEN-LAST:event_LimpiarMouseClicked

    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Save_o;
    private javax.swing.JPasswordField i_contra;
    private javax.swing.JTextField i_user;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_logeado;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JButton m_area;
    private javax.swing.JButton m_perfil;
    private javax.swing.JTextField mostrar_q;
    private javax.swing.JTextField r_clasesbb;
    private javax.swing.JTextField r_contra;
    private javax.swing.JTextField r_correo;
    private javax.swing.JTextField r_edad;
    private javax.swing.JTextField r_nom;
    private javax.swing.JTextField r_usuario;
    private javax.swing.JButton registrar;
    private javax.swing.JTextArea shoe;
    private javax.swing.JTextField ta_piz;
    private javax.swing.JTextField user_show;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuario> lista = new ArrayList();
ArrayList<projectos> clas = new ArrayList();
}
