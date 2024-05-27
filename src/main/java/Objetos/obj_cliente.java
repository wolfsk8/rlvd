/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.Date;

/**
 *
 * @author juan
 */
public class obj_cliente extends obj_persona{
    String antiguedad;

    
    public obj_cliente(String antiguedad, int id_persona, String nombres, String apellido_parteno, String apellido_materno, String direccion, String telefono, String correo, Date fecha_nac) {
        super(id_persona, nombres, apellido_parteno, apellido_materno, direccion, telefono, correo, fecha_nac);
        this.antiguedad = antiguedad;
    }
    
    
    
    
    
    
    
}
