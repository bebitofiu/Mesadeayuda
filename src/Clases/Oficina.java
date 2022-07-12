/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 * 
 * @author JC
 */
public class Oficina {
    
    int id_oficina;
    String ds_oficina;
    String ds_siglas;

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public String getDs_oficina() {
        return ds_oficina;
    }

    public void setDs_oficina(String ds_oficina) {
        this.ds_oficina = ds_oficina;
    }

    public String getDs_siglas() {
        return ds_siglas;
    }

    public void setDs_siglas(String ds_siglas) {
        this.ds_siglas = ds_siglas;
    }

    public int getId_responsable() {
        return id_responsable;
    }

    public void setId_responsable(int id_responsable) {
        this.id_responsable = id_responsable;
    }

    public int getId_ofSuperior() {
        return id_ofSuperior;
    }

    public void setId_ofSuperior(int id_ofSuperior) {
        this.id_ofSuperior = id_ofSuperior;
    }

    public int getId_ofPaterno() {
        return id_ofPaterno;
    }

    public void setId_ofPaterno(int id_ofPaterno) {
        this.id_ofPaterno = id_ofPaterno;
    }

    public int getFlg_activo() {
        return flg_activo;
    }

    public void setFlg_activo(int flg_activo) {
        this.flg_activo = flg_activo;
    }
    int id_responsable;
    int id_ofSuperior;
    int id_ofPaterno;
    int flg_activo;
    
}
