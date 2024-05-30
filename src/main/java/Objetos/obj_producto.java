/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juancazana
 */
public class obj_producto {
    int id_producto;
    String descripcion_producto;
    int stock;
    float precio;
    long aud_estado;

    public obj_producto(int id_producto, String descripcion_producto, int stock, float precio, long aud_estado) {
        this.id_producto = id_producto;
        this.descripcion_producto = descripcion_producto;
        this.stock = stock;
        this.precio = precio;
        this.aud_estado = aud_estado;
    }

    public obj_producto() {
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
