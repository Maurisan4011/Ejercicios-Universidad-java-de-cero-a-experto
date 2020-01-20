package usuarios.jdbc;

import java.sql.*;

/**
 *
 * @author Mauri
 */
public class Conexion {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    //El puerto es opcional al igual que el parametro useSSL
    private static final String JDBC_URL = "jdbc:mysql://localhost/sga?useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "admin";
    private static Driver driver = null;

    //Para que no haya problemas al obtener la conexion de manera concurrente, 
    //se usa la palabra synchronized
    public static synchronized Connection getConnection()
            throws SQLException {
        if (driver == null) {
            try {
                //Se registra el driver
                Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            } catch (Exception e) {
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

//Cierre del resultSet
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();;

            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
    //Cierre del PreparedStatement 

    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();

            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

    //Cierre de la conexion 
    public static void close(Connection cnn) {
        try {
            if (cnn != null) {
                cnn.close();

            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }

    }

}
