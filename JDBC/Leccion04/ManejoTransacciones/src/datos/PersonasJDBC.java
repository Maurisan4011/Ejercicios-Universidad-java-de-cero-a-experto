package datos;

import domain.Persona;
import java.sql.*;
import java.util.*;

/**
 * Clase que contiene los mÃ©todos de SELECT, INSERT, UPDATE y DELETE para la
 * tabla de PERSONAS en MYSQL
 *
 * @author Ubaldo
 *
 */
public class PersonasJDBC {

    //Variable  que almacena una conexion como referencia 
    //esta opcion se recibe en el constructor de esta clase 
    // y permite reutilizar la misma conexion para ejecutar
    //varios querrys de esta clase  opcionalmente se puede
    //utilizar para el uso de una transaccion en SQL    
    private java.sql.Connection userConn;
    //Cadena con el SQL de iserrcion 
    //Nos apoyamos de la llave primaria autoincrementable de MySql
    //por lo que se omite el campo de persona_id
    //Se utiliza un prepareStatement, por lo que podemos
    //utilizar parametros (signos de ?)
    //los cuales posteriormente serÃ¡ sustituidos por el parametro respectivo

    private final String SQL_INSERT
            = "INSERT INTO persona(nombre, apellido) VALUES(?,?)";

    private final String SQL_UPDATE
            = "UPDATE persona SET nombre=?, apellido=? WHERE id_persona=?";

    private final String SQL_DELETE
            = "DELETE FROM persona WHERE id_persona = ?";

    private final String SQL_SELECT
            = "SELECT id_persona, nombre, apellido FROM persona ORDER BY id_persona";

    /*
    *Agregamos el constructor vacio
     */
    public PersonasJDBC() {
    }

    /**
     * Constructor que asigna una conexion existente para ser utilizada en los
     * querries de esta clase
     *
     * @param conn Conexion a la BD previamente creada
     */
    public PersonasJDBC(Connection conn) {
        this.userConn = conn;

    }

    /**
     * Metodo que inserta un registro en la tabla de Persona
     *
     * @param nombre
     * @param apellido
     * @throws SQLException Propagamos el error a la clase de prueba
     */
    public int insert(String nombre, String apellido) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio		
        int rows = 0; //registros afectados
        try {
            //Si la conexion a reutilizar es distinto de nulo se utiliza, sino se 
            //crea una nueva conexion 
            conn = (this.userConn != null) ? this.userConn
                    : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;//contador de columnas
            stmt.setString(index++, nombre);//param 1 => ?
            stmt.setString(index++, apellido);//param 2 => ?
            System.out.println("Ejecutando query:" + SQL_INSERT);
            rows = stmt.executeUpdate();//no. registros afectados
            System.out.println("Registros afectados:" + rows);

        } finally {
            Conexion.close(stmt);
            //Unicamente cerramos la conexion si fue creada en este metodo
            if (this.userConn == null) {
                Conexion.close(conn);
            }

        }
        return rows;
    }

    /**
     * Metodo que actualiza un registro existente
     *
     * @param id_persona Es la llave primaria
     * @param nombre Nuevo Valor
     * @param apellido Nuevo Valor
     * @return int No. de registros modificados
     * @throws SQLException Propagamos la excepcion
     */
    public int update(int id_persona, String nombre, String apellido) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (this.userConn != null) ? this.userConn
                    : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, nombre);
            stmt.setString(index++, apellido);
            stmt.setInt(index, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {

                Conexion.close(conn);
            }
        }
        return rows;
    }

    /**
     * Metodo que elimina un registro existente
     *
     * @param id_persona Es la llave primaria
     * @return int No. registros afectados
     */
    public int delete(int id_persona) throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {

            conn = (this.userConn != null) ? this.userConn
                    : Conexion.getConnection();
            System.out.println("Ejecutando query:" + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_persona);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados:" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {

                Conexion.close(conn);
            }
        }
        return rows;
    }

    /**
     * Metodo que regresa el contenido de la tabla de personas
     *
     * @return Lista de objetos Persona
     * @throws SQLException
     */
    public List<Persona> select() throws SQLException {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Persona persona = null;
        List<Persona> personas = new ArrayList<>();
        try {
            conn = (this.userConn != null) ? this.userConn
                    : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_persona = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellido = rs.getString(3);
                /*System.out.print(" " + id_persona);
                 System.out.print(" " + nombre);
                 System.out.print(" " + apellido);
                 System.out.println();
                 */
                persona = new Persona();
                persona.setId_persona(id_persona);
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                personas.add(persona);
            }

        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);

            if (this.userConn == null) {

                Conexion.close(conn);
            }
        }
        return personas;
    }
}
