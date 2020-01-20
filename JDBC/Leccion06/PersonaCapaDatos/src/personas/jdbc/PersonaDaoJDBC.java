 
package personas.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import personas.dto.PersonaDTO;

/**
 * Esta clase implementa la interfasePersonaDAO con la tecnologiaJDBC podria
 * haber otra implementacion como Hibernate, iBatis, Spring, etc
 *
 *
 *
 * @author Mauri
 */
public class PersonaDaoJDBC implements PersonaDAO {

    private Connection userConn;

    private final String SQL_INSERT = "INSERT INTO persona(nombre, apellido) VALUES(?,?)";

    private final String SQL_UPDATE = "UPDATE persona  SET nombre=?, apellido=? WHERE id_persona=?";

    private final String SQL_DELETE = "DELETE FROM persona WHERE id_persona=?";

    private final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM persona";

    /**
     * constructor vacio
     *
     */
    public PersonaDaoJDBC() {

    }

    /**
     * COnstructor que recibe una conexion
     *
     * @param persona
     * @return
     * @throws SQLException
     */
    public PersonaDaoJDBC(Connection conn) {
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
    public int insert(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int index = 1;
            stmt.setString(index++, persona.getNombre());
            stmt.setString(index, persona.getApellido());
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
    public int update(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {

            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            System.out.println("Ejecutando el query: " + SQL_UPDATE);
            stmt = conn.prepareStatement(SQL_UPDATE);
            int index = 1;
            stmt.setString(index++, persona.getNombre());
            stmt.setString(index++, persona.getApellido());
            stmt.setInt(index, persona.getId_persona());
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
     * @param persona
     * @return
     * @throws SQLException
     */
    @Override
    public int delete(PersonaDTO persona) throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {

            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            System.out.println("Ejecutando el query: " + SQL_DELETE);
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, persona.getId_persona());
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
    public List<PersonaDTO> select() throws SQLException {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PersonaDTO personaDTO = null;
        
        List<PersonaDTO> personas = new ArrayList<PersonaDTO>();
        try {
            conn = (this.userConn != null) ? this.userConn : Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                //Por cada registro se recuperan los valores 
                //de las columnas y se crea un objetoDTO
                int idPersonaTemp = rs.getInt(1);
                String nombreTemp = rs.getString(2);
                String apellidoTemp = rs.getString(3);

                //Llenamos el DTO y lo agregamos a la lista 
                personaDTO = new PersonaDTO();
                personaDTO.setId_persona(idPersonaTemp);
                personaDTO.setNombre(nombreTemp);
                personaDTO.setApellido(apellidoTemp);
                personas.add(personaDTO);
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
