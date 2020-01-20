package usuarios.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import usuarios.dto.UsuarioDTO;

/**
 * Esta clase implementa la interfasePersonaDAO con la tecnologiaJDBC podria
 * haber otra implementacion como Hibernate, iBatis, Spring, etc
 *
 *
 *
 * @author Mauri
 */
public class UsuarioDaoJDBC implements UsuarioDAO {

    private Connection userConn;

    private final String SQL_INSERT = "INSERT INTO usuario  (usuario, password) VALUES(?,?)";

    private final String SQL_UPDATE = "UPDATE usuario  SET usuario=?, password=? WHERE id_usuario=?";

    private final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario=?";

    private final String SQL_SELECT = "SELECT id_usuario, usuario, password FROM usuario";

    /**
     * constructor vacio
     *
     */
    public UsuarioDaoJDBC() {

    }

    /**
     * COnstructor que recibe una conexion
     *
     * @param persona
     * @return
     * @throws SQLException
     */
    public UsuarioDaoJDBC(Connection conn) {
        this.userConn = conn;

    }

    /**
     * El metoso insert recibe como argumento un objeto DTO el cual ciene de
     * otra capa, se extraen sus valores para crear un nuevo registro
     *
     * @param persona
     * @return
     * @throws SQLException
     */
    @Override
    public int insert(UsuarioDTO usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, usuario.getUsuario());
            stmt.setString(index, usuario.getPassword());
            System.out.println("Ejecutamdo Query : " + SQL_INSERT);
            rows = stmt.executeUpdate();
            System.out.println("Registros afectados: " + rows);

        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);

            }
            return rows;
        }

    }

    /**
     * El metodo update recibe un objeto personaDTO el cual encapsula la
     * informacion en un solo objetos y evitamos pasar lops 3 parametros de
     * manera aislada Despues extraemos la informacion del objeto y actualizamos
     * el registro seleccionado
     *
     * @param persona
     * @return
     * @throws SQLException
     */
    @Override
    public int update(UsuarioDTO usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {

            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            System.out.println("Ejecutando el query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, usuario.getUsuario());
            stmt.setString(index++, usuario.getPassword());
            stmt.setInt(index, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registors actualizados :" + rows);
        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);

            }
        }

        return rows;
    }

    /**
     * Recibimos un objeto personaDTO no necesariamente debe venir lleno, sino
     * solo nos importa el id_persona
     *
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(UsuarioDTO usuario) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {

            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            System.out.println("Ejecutando el query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, usuario.getId_usuario());
            rows = stmt.executeUpdate();
            System.out.println("Registros eliminados: " + rows);

        } finally {
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);

            }
        }

        return rows;

    }

    /**
     * En este metodo utilizaremos el objeto personaDTO para llenar una lista y
     * regresarla
     *
     * @return
     * @throws SQLException
     */
    @Override
    public List<UsuarioDTO> select() throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        UsuarioDTO usuarioDTO = null;

        List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                //Por cada registro se recuperan los valores 
                //de las columnas y se crea un objetoDTO
                int idUsuarioTemp = rs.getInt(1);
                String usuarioTemp = rs.getString(2);
                String passwordTemp = rs.getString(3);

                usuarioDTO = new UsuarioDTO();
                usuarioDTO.setId_usuario(idUsuarioTemp);
               usuarioDTO.setUsuario(usuarioTemp);
                usuarioDTO.setPassword(passwordTemp);
                usuarios.add(usuarioDTO);
            }

        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            if (this.userConn == null) {
                Conexion.close(conn);

            }
        }

        return usuarios;

    }

}
