package org.example;
import Products.FactoryProduct;
import Products.IProduct;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void closeConnection(Connection connection) {
        try {
            connection.close();
            System.out.println("Se ha cerrado correctamente la conexión ");
        } catch (SQLException e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        FactoryProduct factory = new FactoryProduct();
        IProduct product;
        product = factory.createProduct("Computer",1,"Marca x","fsd",1324);
        System.out.println(product.getBrand());

        DBConnection db = DBConnection.getInstance();
        Connection connection = db.getConnection();


        //query______
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Client");
            while (resultSet.next()) {
                int RUT = resultSet.getInt("RUT");
                String nombre = resultSet.getString("name");
                int edad = resultSet.getInt("address");
                System.out.println("RUT: " + RUT + ", Nombre: " + nombre + ", Dirección: " + edad);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //query______

        closeConnection(connection);
    }
}