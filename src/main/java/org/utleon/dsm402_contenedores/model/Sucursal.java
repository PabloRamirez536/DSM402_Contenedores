package org.utleon.dsm402_contenedores.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Sucursal {

    private int idSucursal;
    private String nombreSucursal;
    private String calle;
    private String numero;
    private String colonia;
    private String codigoPostal;
    private String fotoSucursal;
    private String latitud;
    private String longitud;
    private String horarios;

    public Sucursal(int idSucursal, String nombreSucursal, String calle, String numero, String colonia, String codigoPostal, String fotoSucursal, String latitud, String longitud, String horarios) {
        this.idSucursal = idSucursal;
        this.nombreSucursal = nombreSucursal;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.codigoPostal = codigoPostal;
        this.fotoSucursal = fotoSucursal;
        this.latitud = latitud;
        this.longitud = longitud;
        this.horarios = horarios;
    }

    public Sucursal() {

    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getFotoSucursal() {
        return fotoSucursal;
    }

    public void setFotoSucursal(String fotoSucursal) {
        this.fotoSucursal = fotoSucursal;
    }

    public String getDireccionCompleta() {
        return calle + " " + numero + ", " + colonia + ", C.P. " + codigoPostal;
    }

}
