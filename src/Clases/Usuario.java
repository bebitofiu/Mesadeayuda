/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JC
 */
public class Usuario {
    
    private int id_usuario, id_persona, id_perfil, flg_activo;
    private String ds_login;
    private String ds_clave;
    
//    public Usuario(int id_usuario, String ds_login, String ds_clave, int id_persona, int id_perfil, int flg_activo){
//        
//        this.id_usuario = id_usuario;
//        this.ds_login = ds_login;
//        this.ds_clave = ds_clave;
//        this.id_persona = id_persona;
//        this.id_perfil = id_perfil;
//        this.flg_activo = flg_activo;
//        
//    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(int id_perfil) {
        this.id_perfil = id_perfil;
    }

    public int getFlg_activo() {
        return flg_activo;
    }

    public void setFlg_activo(int flg_activo) {
        this.flg_activo = flg_activo;
    }

    public String getDs_login() {
        return ds_login;
    }

    public void setDs_login(String ds_login) {
        this.ds_login = ds_login;
    }

    public String getDs_clave() {
        return ds_clave;
    }

    public void setDs_clave(String ds_clave) {
        this.ds_clave = ds_clave;
    }
    
    
    
}
