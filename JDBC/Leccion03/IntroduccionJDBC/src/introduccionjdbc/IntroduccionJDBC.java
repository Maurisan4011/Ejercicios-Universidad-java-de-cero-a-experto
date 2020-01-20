package introduccionjdbc;

import java.sql.*;

/**
 *
 * @author Mauri
 */
public class IntroduccionJDBC {

    public static void main(String[] args) {
        // Cadena de conexion de MySql, el parametro use SSL es opcional
        String url = "jdbc:mysql://localhost:3306/sga?useSSL=false";
        //Cargamos el driver  de mysql
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Creamos el objeto conexion 
            Connection conexion = (Connection) DriverManager.getConnection(url, "root", "admin");
            //Cramos un objeto Statement
            Statement instruccion = conexion.createStatement();
            //Creamos el querry
            String sql = ("select id_persona, nombre, apellido from persona");
               ResultSet result = instruccion.executeQuery(sql);
            while (result.next()) {
                System.out.println("ID: " + result.getInt(1));
                System.out.println("Nombre: " + result.getString(2));
                System.out.println("Apellido:  " + result.getString(3));

            }
            //Cerramos cada uno de los objetos utilizados 
            result.close();
            instruccion.close();
            conexion.close();
            

        } catch (ClassNotFoundException| SQLException e) {
            e.printStackTrace();
        }

    }

}
