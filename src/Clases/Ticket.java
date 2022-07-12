/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author JC
 */
public class Ticket {
    int id_ticket;
    String ds_nroTicket;
    int id_solicitante;
    String dt_fecRegistro;
    int id_tipoSolicitud;
    String ds_asunto;
    String ds_descripcion;
    int id_operador;
    String dt_fecAsignacion;
    int id_prioridad;
    int id_tecnico;
    String dt_fecAtencion;
    String ds_observacion;
    int id_estadoSolicitud;
    int flg_activo;

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public String getDs_nroTicket() {
        return ds_nroTicket;
    }

    public void setDs_nroTicket(String ds_nroTicket) {
        this.ds_nroTicket = ds_nroTicket;
    }

    public int getId_solicitante() {
        return id_solicitante;
    }

    public void setId_solicitante(int id_solicitante) {
        this.id_solicitante = id_solicitante;
    }

    public String getDt_fecRegistro() {
        return dt_fecRegistro;
    }

    public void setDt_fecRegistro(String dt_fecRegistro) {
        this.dt_fecRegistro = dt_fecRegistro;
    }

    public int getId_tipoSolicitud() {
        return id_tipoSolicitud;
    }

    public void setId_tipoSolicitud(int id_tipoSolicitud) {
        this.id_tipoSolicitud = id_tipoSolicitud;
    }

    public String getDs_asunto() {
        return ds_asunto;
    }

    public void setDs_asunto(String ds_asunto) {
        this.ds_asunto = ds_asunto;
    }

    public String getDs_descripcion() {
        return ds_descripcion;
    }

    public void setDs_descripcion(String ds_descripcion) {
        this.ds_descripcion = ds_descripcion;
    }

    public int getId_operador() {
        return id_operador;
    }

    public void setId_operador(int id_operador) {
        this.id_operador = id_operador;
    }

    public String getDt_fecAsignacion() {
        return dt_fecAsignacion;
    }

    public void setDt_fecAsignacion(String dt_fecAsignacion) {
        this.dt_fecAsignacion = dt_fecAsignacion;
    }

    public int getId_prioridad() {
        return id_prioridad;
    }

    public void setId_prioridad(int id_prioridad) {
        this.id_prioridad = id_prioridad;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getDt_fecAtencion() {
        return dt_fecAtencion;
    }

    public void setDt_fecAtencion(String dt_fecAtencion) {
        this.dt_fecAtencion = dt_fecAtencion;
    }

    public String getDs_observacion() {
        return ds_observacion;
    }

    public void setDs_observacion(String ds_observacion) {
        this.ds_observacion = ds_observacion;
    }

    public int getId_estadoSolicitud() {
        return id_estadoSolicitud;
    }

    public void setId_estadoSolicitud(int id_estadoSolicitud) {
        this.id_estadoSolicitud = id_estadoSolicitud;
    }

    public int getFlg_activo() {
        return flg_activo;
    }

    public void setFlg_activo(int flg_activo) {
        this.flg_activo = flg_activo;
    }
    
}
