package poolconexiones;

import capadatos.pool.PoolConexionesMySql;
import capadatos.pool.PoolConexionesOracle;
import java.sql.*;

/**
 *
 * @author Mauri
 */
public class TestPoolConexiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            //Probamos el pool MySql 
            //ejecutamos una consulta 

            conn = PoolConexionesMySql.getConexion();

            System.out.println("Utilizamos el pool de conexiones de Mysql");
            stmt = conn.prepareStatement("SELECT * FROM   persona ");
            rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.print("   " + rs.getInt(1));//id_persona
                System.out.print("  " + rs.getString(2));//nombre
                System.out.println(" " + rs.getString(3));//apellido

            }
            conn.close();

            // Probamos pool Oracle
            //y ejecutamos la consulta 
            conn = PoolConexionesOracle.getConexion();
            System.out.println("Utilizamos el pool de conexiones de Orracle");
            stmt = conn.prepareStatement("SELECT * FROM employees WHERE  employee_id in(100,101,102, 110,111,112)");

            rs = stmt.executeQuery();
            while (rs.next()) {

                System.out.print("   " + rs.getInt(1));//empleado_id
                System.out.print("  " + rs.getString(2));//nombre
                System.out.println(" " + rs.getString(3));//apellido

            }

            //Cerramos la conexion para registrar en el pool de conexion 
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
