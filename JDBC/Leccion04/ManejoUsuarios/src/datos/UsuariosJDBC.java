package datos;

import domain.Usuario;
import java.sql.*;
import java.util.*;

public class UsuariosJDBC {
    //Nos apoyamos  de la llave primaria autoincrementable de MySql
    //por lo que se omite el campo id_usuadio
    //Se utiliza un prepareStartemrent, por lo que podemos 
    //utilizar parametros (signosde??)
    //los cuales posteriormente seran sustituidos por el parametro respectivo

    private final String SQL_INSERT
            = "INSERT INTO usuario(usuario,password) VALUES (?,?)";

    private final String SQL_UPDATE
            = "UPDATE usuario  SET usuario=?, password=? WHERE id_usuario=?";

    private final String SQL_DELETE
            = "DELETE FROM usuario WHERE id_usuario=?";

    private final String SQL_SELECT
            = "SELECT id_usuario, usuario, password FROM usuario ORDER BY id_usuario";

    /**
     * Metodo que inserta un registro en la tabla de Usuario
     *
     * @param usuario
     * @param password
     */
    public int insert(String usuario, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;//no se utiliza en este ejercicio 
        int rows = 0; // registros afestados 
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1; //contador de columnas 
            stmt.setString(index++, usuario);// param 1 =>?
            stmt.setString(index++, password);//param 2=>?
            System.out.println("Ejecutando Querry: " + SQL_INSERT);
            rows = stmt.executeUpdate();// no registrados 
            System.out.println("Registros afectados: " + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
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
     */
    public int update(int id_usuario, String usuario, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando querry : " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, usuario);
            stmt.setString(index++, password);
            stmt.setInt(index, id_usuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros actualizados: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();;

        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    /**
     * Metodo que elimina un registro existente
     *
     * @param id_persona Es la llave primaria
     * @return int No. registros afectados
     */
    public int delete(int id_usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            System.out.println("Ejecutando el Querry:  " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, id_usuario);
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    /**
     * Metodo que regresa el contenido de la tabla de personas
     *
     * @return
     */
    public List<Usuario> select() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;

        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id_usuario = rs.getInt(1);
                String usuario1 = rs.getString(2);
                String password = rs.getString(3);
                /*   System.out.print(" " + id_usuario);
                 System.out.print(" " + usuario );
                 System.out.print(" " +password );
                 System.out.println();
                 */
                usuario = new Usuario();
                usuario.setId_usuario(id_usuario);
                usuario.setUsuario(usuario1);
                usuario.setPassword(password);
                usuarios.add(usuario);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return usuarios;
    }
}
