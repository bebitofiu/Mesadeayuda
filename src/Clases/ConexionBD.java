/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author JC
 */
public class ConexionBD {
    
    Connection conn=null;
    
    private Statement stmt;
    
    public ConexionBD(){

        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection("jdbc:sqlserver://172.16.27.11:1433;databaseName=prueba","sa","1n1a*BD");
                    
            System.out.println("conexión establecida");        

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL:\n"+e.toString());
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase de Conexion no Encontrada:\n"+ex.toString());
        }
        //return conn;
   
          
}
    //Ejecutar sentencia insercion a la BD
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
    
    //Consultar registros
        
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
        
       public ResultSet Select(String query) throws SQLException  {
           
           return this.stmt.executeQuery(query);
           
       }
       
  
    
       
        
        
        
//        
//        public Boolean Login (String User, String Pass, String strSentenciaSQL) {
//            
//            
//           //iniciamos la conexión
//           
//           
//           //realizamos una busqueda del usuario ingresado
//           
//           // si encontramos registro devuelve true
//           
//           // de lo contrario devuelve false
//            
//           Integer resultado =0;
//           try {
//            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
//            ResultSet rs=pstm.executeQuery();
//            
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "Bienvenido");
//                resultado=1;
//            }else{
//                JOptionPane.showMessageDialog(null, "Problemas con usuario y password");
//                resultado=0;
//                }
//            
//            } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al conectar" +e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
//         }
//            return resultado;
//        
//    }   

  
        
        
}
      
//        
//        public int Login (String User, String Pass, String strSentenciaSQL) {
//            
//           Integer resultado =0;
//           try {
//            PreparedStatement pstm=conn.prepareStatement(strSentenciaSQL);
//            ResultSet respuesta=pstm.executeQuery();
//            
//            if(rs.next()){
//                JOptionPane.showMessageDialog(null, "Bienvenido");
//                resultado=1;
//            else{
//                JOptionPane.showMessageDialog(null, "Problemas con usuario y password");
//                resultado=0;
//                }
//            
//            } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Error al conectar" +e.getMessage(), e.getMessage(), JOptionPane.ERROR_MESSAGE);
//            return resultado;
//        }
//    }    
//    
////        
//        
////    
////    public static Connection getConexion(){
////        
////        String conexionUrl = "jdbc:sqlserver://172.16.25.11:1433;"
////                + "database=master;"
////                + "user=sa;"
////                + "password=1n1a*BD;"
////                + "loginTimeout=30;"; 
////        
////        try {
////            Connection con = DriverManager.getConnection(conexionUrl);
////            return con;
////        } catch (SQLException ex) {
////            System.out.println(ex.toString());
////            return null;
////        }
////        
////    }
//    
//    

