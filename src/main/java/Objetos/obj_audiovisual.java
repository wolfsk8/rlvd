/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juancazana
 */
public class obj_audiovisual extends obj_producto {
    int id_audiovisual;
    String formato;
    long aud_audiovisual;

    public obj_audiovisual(int id_audiovisual, String formato, long aud_audiovisual, int id_producto, String descripcion_producto, int stock, float precio, long aud_estado) {
        super(id_producto, descripcion_producto, stock, precio, aud_estado);
        this.id_audiovisual = id_audiovisual;
        this.formato = formato;
        this.aud_audiovisual = aud_audiovisual;
    }

    public int getId_audiovisual() {
        return id_audiovisual;
    }

    public void setId_audiovisual(int id_audiovisual) {
        this.id_audiovisual = id_audiovisual;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public long getAud_audiovisual() {
        return aud_audiovisual;
    }

    public void setAud_audiovisual(long aud_audiovisual) {
        this.aud_audiovisual = aud_audiovisual;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public long getAud_estado() {
        return aud_estado;
    }

    public void setAud_estado(long aud_estado) {
        this.aud_estado = aud_estado;
    }
    
    
}
