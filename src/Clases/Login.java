/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

//import Clases.ConexionBD;
//import Clases.Usuario;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author JC
 */
public class Login {
//    public Boolean Login(String usuario, String password) throws SQLException {
//        
//        ArrayList<Usuario> lista = new ArrayList<Usuario>();
//        
//       Conexion conex=new Conexion(); 
//       ResultSet resultado= conex.Select("SELECT * FROM tb_usuario WHERE ds_login = '" + usuario + "' AND ds_clave = '" + password + "'");
//       
//       
//        while (resultado.next()) {            
//            lista.add(new Usuario(resultado.getInt(1), resultado.getString(2), resultado.getString(3), resultado.getInt(4), resultado.getInt(5), resultado.getInt(6)));
//        }
//       
//        if (lista.size() > 0){
//            return true;
//        }else{
//            return false;
//        }
//            
//        
//       
//    }
//    
    
    
    public DefaultComboBoxModel Llenar(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement("Seleccione");
        
         Conexion objConexion=new Conexion();
      //   Statement st = objConexion.Conectar();
         
         
         
         
         
         
        
        try {
            //ResultSet rs = st.executeQuery("usp_ls_tiposolicitud");
            
           // ResultSet rs = st.executeQuery("select ds_perfil from TB_PERFIL");
            ResultSet rs = objConexion.consultarRegistros("select ds_perfil from TB_PERFIL");
            
            while(rs.next())
                {
                    modelo.addElement(rs.getString(1));
                }
            
        } catch (SQLException ex) {
        }
        return modelo;
    }
    
    
}
