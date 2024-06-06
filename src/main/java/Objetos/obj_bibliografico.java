/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author juancazana
 */
public class obj_bibliografico extends obj_producto{
    int id_bibliografico;
    String titulo;
    String editorial;
    String autor;
    long aud_bibliografico;


    public obj_bibliografico(int id_bibliografico, String titulo, String editorial, String autor, long aud_bibliografico, int id_producto, String descripcion_producto, int stock, float precio, long aud_estado) {
        super(id_producto, descripcion_producto, stock, precio, aud_estado);
        this.id_bibliografico = id_bibliografico;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.aud_bibliografico = aud_bibliografico;
    }

    public int getId_bibliografico() {
        return id_bibliografico;
    }

    public void setId_bibliografico(int id_bibliografico) {
        this.id_bibliografico = id_bibliografico;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getAud_bibliografico() {
        return aud_bibliografico;
    }

    public void setAud_bibliografico(long aud_bibliografico) {
        this.aud_bibliografico = aud_bibliografico;
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
