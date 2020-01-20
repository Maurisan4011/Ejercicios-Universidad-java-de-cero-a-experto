package usuarios.jdbc;

import java.sql.SQLException;
import java.util.List;
import usuarios.dto.UsuarioDTO;

/**
 * Esta interface contiene los metodos abstractos con las operaciones basicas
 * sobre la tabla de Personas CRUD(Create, Read, Update y Delete) Sedebe crar
 * una clase concreta para implementar el codigo asociado a cada metodo
 *
 * @author Mauri
 */
public interface UsuarioDAO {

    public int insert(UsuarioDTO usuario) throws SQLException;

    public int update(UsuarioDTO usuario) throws SQLException;

    public int delete(UsuarioDTO usuario) throws SQLException;

    public List<UsuarioDTO> select() throws SQLException;

}
