/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Conexion;
import java.sql.*;
//import Clases.Login;
import Clases.Oficina;
import Clases.Persona;
import Clases.Ticket;
import Clases.TipoSolicitud;
import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JC
 */
public final class frmUsuario extends javax.swing.JFrame {
    public int uu;
    //DefaultTableModel tblmodelo;
    public String prid;

    /**
     * Creates new form RegistraIncidencia
     */
    public frmUsuario() {
        initComponents();
        
       //CapturarEmpleado();
        
        
        
        
        mostrarCantidad();
        LlenarComboBox();
        setLocationRelativeTo(null);

        Panel02.setVisible(false);
        lblBandejaTicket.setOpaque(true);
        Color color = new Color(52, 58, 65);
        lblBandejaTicket.setBackground(color);
        
        
         
    }

    public void LlenarComboBox() {

        cboTipoSolicitud.setModel(Llenar());

    }

    frmUsuario(String usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public DefaultComboBoxModel Llenar() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");

        Conexion objConexion = new Conexion();

        try {

            ResultSet rs = objConexion.consultarRegistros("select ds_tipoTicket from TB_TIPOTICKET order by id_tipoTicket");

            while (rs.next()) {
                modelo.addElement(rs.getString(1));
            }

        } catch (SQLException ex) {
        }
        return modelo;
    }

    public void mostrarDatosTabla(int a) {
        Conexion objConexion = new Conexion();
        Ticket objTicket = recuperarTicket();

        DefaultTableModel tabla = new DefaultTableModel();

        try {
            tabla.addColumn("Nro Ticket");
            tabla.addColumn("Fecha Registro");
            tabla.addColumn("Tipo Ticket");
            tabla.addColumn("Asunto");
            tabla.addColumn("Estado");
            tabla.addColumn("Fecha Asignación");
            tabla.addColumn("Prioridad");
            tabla.addColumn("Técnico");
            tabla.addColumn("Fecha Atención");
            //agregar al final nuevas

            ResultSet rs = objConexion.consultarRegistros("exec usp_bandeja_solicitante " + objTicket.getId_solicitante() + "," + a);
            //
            while (rs.next()) {
                Object dato[] = new Object[9];
                for (int i = 0; i < 9; i++) {
                    dato[i] = rs.getString(i + 1);
                }
                tabla.addRow(dato);
            }
            tblTickets.setModel(tabla);
        } catch (Exception e) {
        }

    }

    public void mostrarCantidad() {
        int r = 0;
        
        Conexion objConexion = new Conexion();
        
     
        try {
                            
                  
            
            ResultSet rs = objConexion.consultarRegistros("SELECT COUNT(*) "
                    + "AS TOTAL, SUM(CASE WHEN id_estadoTicket=1 THEN 1  ELSE 0 END) "
                    + "AS PENDIENTES_ASIGNACION, SUM(CASE WHEN id_estadoTicket=2 THEN 1 ELSE 0 END) "
                    + "AS PENDIENTES_ATENCION, SUM(CASE WHEN id_estadoTicket IN (3,4) THEN 1 ELSE 0 END) "
                    + "AS ATENDIDOS_OBSERVADOS FROM TB_TICKET WHERE flg_activo=1 and id_solicitante='"+ prid +"'");
                   
            while (rs.next()) {
                //System.out.println(rs.getString("TOTAL"));
                
                //lblIdPersona.getText();
                //objTicket.getId_solicitante()
                
                lblTotalTickets.setText(rs.getString("TOTAL"));
                lblPendientesAsig.setText(rs.getString("PENDIENTES_ASIGNACION"));
                lblPendientesAten.setText(rs.getString("PENDIENTES_ATENCION"));
                lblAtendidos.setText(rs.getString("ATENDIDOS_OBSERVADOS"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
    
//    public void CapturarEmpleado() {
//        
//        Conexion objConexion=new Conexion();
//        Ticket objTicket = recuperarTicket();
//               
//        try {
////            ResultSet rs = objConexion.consultarRegistros("SELECT TB_TICKET.id_ticket, TB_TICKET.ds_nroTicket, TB_TICKET.id_solicitante,"
////                    + " TB_TICKET.id_tipoTicket, TB_TICKET.ds_asunto  from TB_TICKET where TB_TICKET.flg_activo=1");   
//          // ResultSet rs = objConexion.consultarRegistros("SELECT id_solicitante FROM TB_TICKET");  
//        ResultSet rs = objConexion.consultarRegistros("select * from TB_PERSONA");
//            while (rs.next()) {
//                           prid = rs.getString("ds_nombre");
//              texto.setText(prid);
//               
//            }
//            
//        } catch (Exception e) {
//        }
//        
//    }
//    
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblIdPersona = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblOficina = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        jlabel8 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblBandejaTicket = new javax.swing.JLabel();
        lblUsuarioUser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlabel10 = new javax.swing.JLabel();
        jlabel11 = new javax.swing.JLabel();
        jlabel12 = new javax.swing.JLabel();
        lblDNI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Btnxport = new javax.swing.JLabel();
        lblRegistrarTicket = new javax.swing.JLabel();
        lblSalirOperador1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lblNombreOperador = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        texto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Panel01 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Panel02 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cboTipoSolicitud = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnEnviar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnTotalTickets = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblTotalTickets = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnPendienteAsig = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPendientesAsig = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        btnPendienteAten = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lblPendientesAten = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnAtendidos = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        lblAtendidos = new javax.swing.JLabel();

        lblNombre1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 232, 232));
        setMinimumSize(new java.awt.Dimension(965, 600));
        setPreferredSize(new java.awt.Dimension(965, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(60, 141, 187));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 150, 320, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 40));

        jPanel4.setBackground(new java.awt.Color(52, 58, 65));
        jPanel4.setMinimumSize(new java.awt.Dimension(140, 470));
        jPanel4.setPreferredSize(new java.awt.Dimension(140, 470));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIdPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIdPersona.setForeground(new java.awt.Color(255, 255, 255));
        lblIdPersona.setText("id");
        jPanel4.add(lblIdPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 306, 190, 60));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("Nombre");
        jPanel4.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 140, 20));

        lblOficina.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblOficina.setForeground(new java.awt.Color(255, 255, 255));
        lblOficina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOficina.setText("Oficina");
        jPanel4.add(lblOficina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, -1));

        lblCargo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(255, 255, 255));
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("Cargo");
        jPanel4.add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, -1));

        lblApellidos.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellidos.setText("Apellidos");
        jPanel4.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, -1));

        jlabel8.setBackground(new java.awt.Color(255, 255, 255));
        jlabel8.setForeground(new java.awt.Color(153, 153, 153));
        jlabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel8.setText("Cargo");
        jPanel4.add(jlabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, -1));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreo.setText("Teléfono");
        jPanel4.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 140, 20));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTelefono.setText("Correo");
        jPanel4.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 140, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adm.png"))); // NOI18N
        jLabel11.setAlignmentY(0.0F);
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        lblBandejaTicket.setBackground(new java.awt.Color(52, 58, 65));
        lblBandejaTicket.setForeground(new java.awt.Color(255, 255, 255));
        lblBandejaTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tk01.png"))); // NOI18N
        lblBandejaTicket.setText("Bandeja de Tickets");
        lblBandejaTicket.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblBandejaTicketMouseMoved(evt);
            }
        });
        lblBandejaTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBandejaTicketMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblBandejaTicketMouseExited(evt);
            }
        });
        jPanel4.add(lblBandejaTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 140, 30));

        lblUsuarioUser.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblUsuarioUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuarioUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuarioUser.setText("User");
        jPanel4.add(lblUsuarioUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 140, -1));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 10));

        jlabel10.setBackground(new java.awt.Color(255, 255, 255));
        jlabel10.setForeground(new java.awt.Color(153, 153, 153));
        jlabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel10.setText("Correo electrónico");
        jPanel4.add(jlabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, -1));

        jlabel11.setBackground(new java.awt.Color(255, 255, 255));
        jlabel11.setForeground(new java.awt.Color(153, 153, 153));
        jlabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel11.setText("Teléfono");
        jPanel4.add(jlabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 140, -1));

        jlabel12.setBackground(new java.awt.Color(255, 255, 255));
        jlabel12.setForeground(new java.awt.Color(153, 153, 153));
        jlabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel12.setText("Oficina");
        jPanel4.add(jlabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, -1));

        lblDNI.setBackground(new java.awt.Color(255, 255, 255));
        lblDNI.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblDNI.setForeground(new java.awt.Color(255, 255, 255));
        lblDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDNI.setText("DNI");
        jPanel4.add(lblDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DNI");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 140, -1));

        Btnxport.setBackground(new java.awt.Color(52, 58, 65));
        Btnxport.setForeground(new java.awt.Color(255, 255, 255));
        Btnxport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tk01.png"))); // NOI18N
        Btnxport.setText("Exportar");
        Btnxport.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BtnxportMouseMoved(evt);
            }
        });
        Btnxport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnxportMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnxportMouseExited(evt);
            }
        });
        jPanel4.add(Btnxport, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 140, 30));

        lblRegistrarTicket.setBackground(new java.awt.Color(52, 58, 65));
        lblRegistrarTicket.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tk01.png"))); // NOI18N
        lblRegistrarTicket.setText("Registrar Ticket");
        lblRegistrarTicket.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblRegistrarTicketMouseMoved(evt);
            }
        });
        lblRegistrarTicket.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarTicketMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarTicketMouseExited(evt);
            }
        });
        jPanel4.add(lblRegistrarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 140, 30));

        lblSalirOperador1.setBackground(new java.awt.Color(52, 58, 65));
        lblSalirOperador1.setForeground(new java.awt.Color(255, 255, 255));
        lblSalirOperador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tk01.png"))); // NOI18N
        lblSalirOperador1.setText("Salir");
        lblSalirOperador1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblSalirOperador1MouseMoved(evt);
            }
        });
        lblSalirOperador1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirOperador1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirOperador1MouseExited(evt);
            }
        });
        jPanel4.add(lblSalirOperador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 140, 30));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 140, 520));

        jPanel7.setBackground(new java.awt.Color(60, 141, 187));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Panel de Usuario");

        lblNombreOperador.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblNombreOperador.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreOperador.setText("Nombre");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/adm_ic.png"))); // NOI18N

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(110, 110, 110)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblNombreOperador, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lblNombreOperador)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 810, 40));

        Panel01.setBackground(new java.awt.Color(232, 232, 232));
        Panel01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTickets.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTickets);

        Panel01.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 47, 790, 340));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("BANDEJA DE TICKETS");
        Panel01.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 810, -1));

        getContentPane().add(Panel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 810, 400));

        Panel02.setBackground(new java.awt.Color(232, 232, 232));
        Panel02.setMinimumSize(new java.awt.Dimension(810, 360));
        Panel02.setPreferredSize(new java.awt.Dimension(810, 360));
        Panel02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRAR INCIDENCIA");
        Panel02.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 810, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Tipo Solicitud :");
        Panel02.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cboTipoSolicitud.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cboTipoSolicitud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Panel02.add(cboTipoSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 310, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Asunto :");
        Panel02.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtAsunto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Panel02.add(txtAsunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Descripción :");
        Panel02.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        Panel02.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 130));

        btnEnviar.setBackground(new java.awt.Color(190, 67, 21));
        btnEnviar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        Panel02.add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 300, 130, 51));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img_registrar_incidencia.png"))); // NOI18N
        Panel02.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 350, 120));

        btnCancelar.setBackground(new java.awt.Color(190, 67, 21));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        Panel02.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 130, 51));

        btnLimpiar.setBackground(new java.awt.Color(190, 67, 21));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        Panel02.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 130, 51));

        getContentPane().add(Panel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 810, 400));

        jPanel1.setBackground(new java.awt.Color(232, 232, 232));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTotalTickets.setBackground(new java.awt.Color(1, 109, 246));
        btnTotalTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnTotalTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalTicketsActionPerformed(evt);
            }
        });
        jPanel5.add(btnTotalTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 74, 51));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Total tickets");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, -1));

        lblTotalTickets.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotalTickets.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalTickets.setText("00");
        jPanel5.add(lblTotalTickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 60));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPendienteAsig.setBackground(new java.awt.Color(221, 77, 55));
        btnPendienteAsig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnPendienteAsig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteAsigActionPerformed(evt);
            }
        });
        jPanel8.add(btnPendienteAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 74, 51));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Pendiente de");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asignación");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, -1));

        lblPendientesAsig.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPendientesAsig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPendientesAsig.setText("00");
        jPanel8.add(lblPendientesAsig, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 190, 60));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPendienteAten.setBackground(new java.awt.Color(243, 157, 15));
        btnPendienteAten.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnPendienteAten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPendienteAtenActionPerformed(evt);
            }
        });
        jPanel9.add(btnPendienteAten, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 74, 51));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Pendientes de");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 110, -1));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Atención");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, -1));

        lblPendientesAten.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPendientesAten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPendientesAten.setText("00");
        jPanel9.add(lblPendientesAten, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 190, 60));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtendidos.setBackground(new java.awt.Color(0, 192, 241));
        btnAtendidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bj.png"))); // NOI18N
        btnAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtendidosActionPerformed(evt);
            }
        });
        jPanel10.add(btnAtendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 74, 51));

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Atendidos");
        jPanel10.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 110, -1));

        lblAtendidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAtendidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtendidos.setText("00");
        jPanel10.add(lblAtendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 110, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 810, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBandejaTicketMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBandejaTicketMouseMoved
        // TODO add your handling code here:

        lblBandejaTicket.setOpaque(true);
        Color color = new Color(60, 141, 187);
        lblBandejaTicket.setBackground(color);

    }//GEN-LAST:event_lblBandejaTicketMouseMoved

    private void lblBandejaTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBandejaTicketMouseClicked
//        // TODO add your handling code here:

        btnTotalTickets.setEnabled(true);
        btnPendienteAsig.setEnabled(true);
        btnPendienteAten.setEnabled(true);;
        btnAtendidos.setEnabled(true);

        lblBandejaTicket.setOpaque(true);
        Color color = new Color(52, 58, 65);
        lblBandejaTicket.setBackground(color);

        Panel02.setVisible(false);
        Panel01.setVisible(true);


    }//GEN-LAST:event_lblBandejaTicketMouseClicked

    private void lblBandejaTicketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBandejaTicketMouseExited
        // TODO add your handling code here:

        //  jLabel2.setBackground(Color.red);

    }//GEN-LAST:event_lblBandejaTicketMouseExited

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        // TODO add your handling code here:

        lblBandejaTicket.setOpaque(true);
        Color color = new Color(52, 58, 65);
        lblBandejaTicket.setBackground(color);

        lblRegistrarTicket.setBackground(color);
        Btnxport.setBackground(color);


    }//GEN-LAST:event_jPanel4MouseMoved

    private void BtnxportMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnxportMouseMoved
        // TODO add your handling code here:

        Btnxport.setOpaque(true);
        Color color = new Color(60, 141, 187);
        Btnxport.setBackground(color);

    }//GEN-LAST:event_BtnxportMouseMoved

    private void BtnxportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnxportMouseClicked
        // TODO add your handling code here:

        Btnxport.setOpaque(true);
        Color color = new Color(52, 58, 65);
        Btnxport.setBackground(color);

        System.exit(0);

    }//GEN-LAST:event_BtnxportMouseClicked

    private void BtnxportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnxportMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnxportMouseExited

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:

        Conexion objConexion = new Conexion();

        Ticket objTicket = recuperarTicket();

        String strSentenciaInsert = String.format("exec usp_registrar_ticket '%s', '%s', '%s', '%s'", objTicket.getId_solicitante(), objTicket.getId_tipoSolicitud(), objTicket.getDs_asunto(), objTicket.getDs_descripcion());

        objConexion.SentenciaSQL(strSentenciaInsert);

        JOptionPane.showMessageDialog(null, "Incidencia enviada correctamente");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void lblRegistrarTicketMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarTicketMouseMoved
        // TODO add your handling code here:

        lblRegistrarTicket.setOpaque(true);
        Color color = new Color(60, 141, 187);
        lblRegistrarTicket.setBackground(color);

    }//GEN-LAST:event_lblRegistrarTicketMouseMoved

    private void lblRegistrarTicketMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarTicketMouseClicked
        // TODO add your handling code here:

        lblRegistrarTicket.setOpaque(true);
        Color color = new Color(52, 58, 65);
        lblRegistrarTicket.setBackground(color);

        Panel01.setVisible(false);
        Panel02.setVisible(true);

        btnTotalTickets.setEnabled(false);
        btnPendienteAsig.setEnabled(false);
        btnPendienteAten.setEnabled(false);;
        btnAtendidos.setEnabled(false);


    }//GEN-LAST:event_lblRegistrarTicketMouseClicked

    private void lblRegistrarTicketMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarTicketMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblRegistrarTicketMouseExited

    private void btnTotalTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalTicketsActionPerformed
        // TODO add your handling code here:

        lblIdPersona.getText();

        mostrarDatosTabla(0);

    }//GEN-LAST:event_btnTotalTicketsActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:

        Panel01.setVisible(true);
        btnTotalTickets.setEnabled(true);
        btnPendienteAsig.setEnabled(true);
        btnPendienteAten.setEnabled(true);;
        btnAtendidos.setEnabled(true);


    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtAsunto.setText("");
        txtDescripcion.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnPendienteAsigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteAsigActionPerformed
        // TODO add your handling code here:
        mostrarDatosTabla(1);
    }//GEN-LAST:event_btnPendienteAsigActionPerformed

    private void btnPendienteAtenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPendienteAtenActionPerformed
        // TODO add your handling code here:
        mostrarDatosTabla(2);
    }//GEN-LAST:event_btnPendienteAtenActionPerformed

    private void btnAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtendidosActionPerformed
        // TODO add your handling code here:
        mostrarDatosTabla(3);
    }//GEN-LAST:event_btnAtendidosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
     //   CapturarEmpleado();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblSalirOperador1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirOperador1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirOperador1MouseMoved

    private void lblSalirOperador1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirOperador1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirOperador1MouseClicked

    private void lblSalirOperador1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirOperador1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSalirOperador1MouseExited

    public Ticket recuperarTicket() {

        Ticket objTicket = new Ticket();

        int IdSolicitante = (lblIdPersona.getText().isEmpty()) ? 0 : Integer.parseInt(lblIdPersona.getText());
  
        int tipoSol = cboTipoSolicitud.getSelectedIndex();

        objTicket.setId_solicitante(IdSolicitante);
        objTicket.setId_tipoSolicitud(tipoSol);
        objTicket.setDs_asunto(txtAsunto.getText());
        objTicket.setDs_descripcion(txtDescripcion.getText());

        return objTicket;
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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btnxport;
    private javax.swing.JPanel Panel01;
    private javax.swing.JPanel Panel02;
    private javax.swing.JButton btnAtendidos;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPendienteAsig;
    private javax.swing.JButton btnPendienteAten;
    private javax.swing.JButton btnTotalTickets;
    private javax.swing.JComboBox<String> cboTipoSolicitud;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlabel10;
    private javax.swing.JLabel jlabel11;
    private javax.swing.JLabel jlabel12;
    private javax.swing.JLabel jlabel8;
    public javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblAtendidos;
    private javax.swing.JLabel lblBandejaTicket;
    public javax.swing.JLabel lblCargo;
    public javax.swing.JLabel lblCorreo;
    public javax.swing.JLabel lblDNI;
    public javax.swing.JLabel lblIdPersona;
    public javax.swing.JLabel lblNombre;
    public javax.swing.JLabel lblNombre1;
    public javax.swing.JLabel lblNombreOperador;
    public javax.swing.JLabel lblOficina;
    private javax.swing.JLabel lblPendientesAsig;
    private javax.swing.JLabel lblPendientesAten;
    private javax.swing.JLabel lblRegistrarTicket;
    private javax.swing.JLabel lblSalirOperador1;
    public javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTotalTickets;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lblUsuarioUser;
    private javax.swing.JTable tblTickets;
    public javax.swing.JTextField texto;
    private javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
