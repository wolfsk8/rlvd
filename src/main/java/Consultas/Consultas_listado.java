/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consultas;

import database.DatabaseConexion;
import Objetos.obj_cargo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Consultas_listado {
    
    public static List<obj_cargo> listarCargos(int condicion,int id_cargo, String cargo, String descripcion, long fecha_aud) {
        List<obj_cargo> list_cargo = new ArrayList<>();
        try (Connection conn = DatabaseConexion.getConnection();
             CallableStatement stmt = conn.prepareCall("{ CALL F_LISTA_CARGO(?, ?, ?, ?, ?) }")) {
            // Establece los valores de los parámetros de entrada
                stmt.setInt(1, condicion);
                stmt.setInt(2, id_cargo);
                stmt.setString(3, cargo);
                stmt.setString(4, descripcion);
                stmt.setLong(5, fecha_aud);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                obj_cargo obj_consulta = new obj_cargo();
                obj_consulta.setId_cargo(rs.getInt("ID_CARGO"));
                obj_consulta.setCargo(rs.getString("CARGO"));
                obj_consulta.setDescripcion(rs.getString("DESCRIPCION"));
                list_cargo.add(obj_consulta);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list_cargo;
    }
}
