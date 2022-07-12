/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
    
    
//    private String CadenaConexion;
   private Connection conex;

    public Connection getConex() {
        return conex;
    }

    public void setConex(Connection conex) {
        this.conex = conex;
    }
   
   
//    private Statement stmt;
//    
//    public Conexion() throws SQLException {
//        this.CadenaConexion = "jdbc:sqlserver://172.16.27.11:1433;databaseName=prueba;user=sa;password=1n1a*BD";
//        AbrirConexion();
//        
//        
//    }
//    
//    private void AbrirConexion()throws SQLException{
//        
//        this.conex=DriverManager.getConnection(CadenaConexion);
//        this.stmt= this.conex.createStatement();
//    }    
//    public ResultSet Select(String query) throws SQLException{
//        return this.stmt.executeQuery(query);
//        
//    }
//        
    
    
    public String usuario="sa";
    public String pass="1n1a*BD";
    public String url="jdbc:sqlserver://172.16.27.11:1433;databaseName=BD_HELP_DESK;";
//    public Connection cn = null;
    
//      Connection conn=null;
//    
//    //Connection conn=null;
//    public Statement st = null;
    
    Connection conn=null;
    
    private Statement stmt;
    
//    public Statement Conectar(){
//        
//        try {
//            Connection cn = DriverManager.getConnection(url, usuario, pass);
//            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//            
//        }
//        return st;
//        
//    }
    
    
public  Conexion(){

        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection("jdbc:sqlserver://172.16.27.11:1433;databaseName=BD_HELP_DESK","sa","1n1a*BD");
                    
            System.out.println("conexión establecida");        

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n"+e.toString());
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase de Conexion no Encontrada:\n"+ex.toString());
        }
        //return conn;
   
          
}
    
    
     public int SentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
        
    }
     
      public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta=pstm.executeQuery();
            return respuesta;
            
        } catch (Exception e) {
            
            System.out.println(e);
            return null;
        }
    }
     
    
     
    
    
    
        
}
    
            
            
    
 