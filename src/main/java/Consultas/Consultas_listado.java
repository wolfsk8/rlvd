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
    
    public static List<obj_cargo> listarCargos() {
        List<obj_cargo> cargos = new ArrayList<>();
        try (Connection conn = DatabaseConexion.getConnection();
             CallableStatement stmt = conn.prepareCall("{ CALL F_LISTA_CARGO(0, null, null, null, null) }")) {

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                obj_cargo cargo = new obj_cargo();
                cargo.setId_cargo(rs.getInt("id_cargo"));
                cargo.setCargo(rs.getString("cargo"));
                cargo.setDescripcion(rs.getString("descripcion"));
                cargos.add(cargo);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cargos;
    }
}
