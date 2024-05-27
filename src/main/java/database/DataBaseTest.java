/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseTest {
    public static void main(String[] args) {
        try (Connection connection = DatabaseConexion.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM CARGO")) {

            while (resultSet.next()) {
                // Obtener los valores de las columnas de la fila actual
                System.out.println("Valor de la columna 1: " + resultSet.getString(1));
                System.out.println("Valor de la columna 2: " + resultSet.getString(2));
                // Agrega más líneas para obtener los valores de otras columnas según tu necesidad
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}