/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;
import java.util.List;
/**importar lombok**/
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author juancazana
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class obj_producto {
    int id_producto;
    String descripcion_producto;
    int stock;
    float precio;
    long aud_estado;
      
    public List<obj_producto> listarProductos(int id_producto) {
        // Lógica para obtener la lista de productos desde tu fuente de datos
        List<obj_producto> listaProductos = new ArrayList<>();
        return listaProductos;
    }
}

