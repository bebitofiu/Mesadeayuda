/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.sql.Statement;
import Clases.ConexionBD;
import Clases.Personal;
//import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import java.beans.Statement;

/**
 *
 * @author JC
 */
public class Principal extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);

        String[] titulos = {"Código", "Nombre", "Apellido", "Edad"};
        modelo = new DefaultTableModel(null, titulos);
        tblPersonal.setModel(modelo);

        ConexionBD objConexion = new ConexionBD();

        ResultSet rs = objConexion.consultarRegistros("SELECT * FROM datos");

        //ResultSet resultado= objConexion.consultarRegistros("SELECT * FROM datos");
        //        Object[] ObjUsuario={resultado.getString("codigo"),resultado.getString("nombre"),resultado.getString("apellido"),resultado.getString("edad") };
        // Personal objPersonal= recuperarDatosPersonal();
        mostrarDatos();
        mostrarCantidad();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jButton2 = new javax.swing.JButton();
        lblDato1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 27, -1, -1));

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel3.setText("Apellido");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 80, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 80, -1));
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 80, -1));
        getContentPane().add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 80, -1));

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPersonal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 480, 200));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("ADMINISTRACION DE INCIDENCIAS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 180, -1));

        jScrollPane2.setViewportView(jTree1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 140, 120));

        jButton2.setBackground(new java.awt.Color(255, 51, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 350, 80, 60));

        lblDato1.setText("jLabel6");
        getContentPane().add(lblDato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:

        ConexionBD objConexion = new ConexionBD();

//        String bases ="";
//        try {
//            Statement sql = ConexionBD.getConexion().createStatement();
//            
//            String consulta = "select name from master.dbo.sysdatabases";
//            
//            ResultSet resultado = sql.executeQuery(consulta);
//            
//            while(resultado.next()){
//                bases +=resultado.getString(1)+ "\n";
//            }
//            JOptionPane.showMessageDialog(null, bases);
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.toString());
//        }
    }//GEN-LAST:event_btnConectarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        ConexionBD objConexion = new ConexionBD();

        Personal objPersonal = recuperarDatosPersonal();

        String strSentenciaInsert = String.format("INSERT INTO datos(codigo, nombre, apellido, edad)"
                + " VALUES ('%s', '%s', '%s', '%s')", objPersonal.getCodigo(), objPersonal.getNombre(), objPersonal.getApellido(), objPersonal.getEdad());

        objConexion.SentenciaSQL(strSentenciaInsert);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        ConexionBD objConexion = new ConexionBD();

        Personal objPersonal = recuperarDatosPersonal();

        String strSentenciaInsert = String.format("{call usp_registrar_ticket(?,?,?,?)}", objPersonal.getCodigo(), objPersonal.getNombre(), objPersonal.getApellido(), objPersonal.getEdad());

        objConexion.SentenciaSQL(strSentenciaInsert);

        // ("{call ObtenerDatosAlumno (?,?,?,?)}")
    }//GEN-LAST:event_jButton1ActionPerformed

    public Personal recuperarDatosPersonal() {
        Personal objPersonal = new Personal();

        int codigo = (txtCodigo.getText().isEmpty()) ? 0 : Integer.parseInt(txtCodigo.getText());
        int edad = (txtEdad.getText().isEmpty()) ? 0 : Integer.parseInt(txtEdad.getText());

        objPersonal.setCodigo(codigo);
        objPersonal.setNombre(txtNombre.getText());
        objPersonal.setApellido(txtApellido.getText());
        objPersonal.setEdad(edad);

        return objPersonal;
    }

    public void mostrarCantidad() {
        int r = 0;

        ConexionBD ObjConexion = new ConexionBD();
        try {
            ResultSet rs = ObjConexion.consultarRegistros("select count(*) nombre_count from datos");
            while (rs.next()) {
                System.out.println(rs.getString("nombre_count"));
                jTextField1.setText(rs.getString("nombre_count"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void mostrarDatos() {
        ConexionBD ObjConexion = new ConexionBD();
        try {
            ResultSet resultado = ObjConexion.consultarRegistros("SELECT * FROM datos");
            while (resultado.next()) {
                System.out.println(resultado.getString("codigo"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("edad"));

                Object[] ObjUsuario = {resultado.getString("codigo"), resultado.getString("nombre"), resultado.getString("apellido"), resultado.getString("edad")};

                modelo.addRow(ObjUsuario);

            }
        } catch (Exception e) {
            System.out.println(e);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblDato1;
    private javax.swing.JTable tblPersonal;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
