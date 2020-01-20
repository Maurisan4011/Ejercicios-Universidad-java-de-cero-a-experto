package personas.jdbc;

import java.sql.SQLException;
import java.util.List;
import personas.dto.PersonaDTO;

/**
 * Esta interface contiene los metodos abstractos con las operaciones basicas
 * sobre la tabla de Personas CRUD(Create, Read, Update y Delete) Sedebe crar
 * una clase concreta para implementar el codigo asociado a cada metodo
 *
 * @author Mauri
 */
public interface PersonaDAO {

    public int insert(PersonaDTO persona) throws SQLException;

    public int update(PersonaDTO persona) throws SQLException;

    public int delete(PersonaDTO persona) throws SQLException;

    public List<PersonaDTO> select() throws SQLException;

}
