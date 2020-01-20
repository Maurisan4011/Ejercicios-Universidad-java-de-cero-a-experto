package usuarios.test;

import java.sql.SQLException;
import java.util.List;
import usuarios.jdbc.UsuarioDaoJDBC;
import usuarios.dto.UsuarioDTO;
import usuarios.jdbc.UsuarioDAO;

/**
 *
 * @author Mauri
 */
public class TestUsuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Utilizamos el tipo interface como referencia 
        //a una clase concreta
        UsuarioDAO usuarioDAO = new UsuarioDaoJDBC();

         //Creamos un nuevo registro
        //Hacemos uso de la clase persona DTO la cual se usa
        //para transferiri la informacion entre las capas
        //no es necesario especificar la llave primaria
        //ya que en este caso es de tipo autonumerico y la BD se encarga
        //de asignarle un nuevo valor
        UsuarioDTO usuario_1 = new UsuarioDTO();
         usuario_1.setUsuario("Carlitos");
         usuario_1.setPassword("calitoscarlitos");
    
        //Utilizamos la capa DAO para persistir el objeto DTO
        try {
            //personaDao.insert(persona);
            usuarioDAO.insert(usuario_1);

            //eliminamos un registro, el id 3
            //personaDao.delete( new UsuarioDTO(3));
            
            //actualizamos un registro
             UsuarioDTO personaTmp= new UsuarioDTO();
//             personaTmp.setId_persona(2);//actualizamos el registro 2
//             personaTmp.setNombre("Mario");
//             personaTmp.setApellido("lopez02");
//             personaDao.update(personaTmp);
            
            //Seleccionamos todos los registros
            List<UsuarioDTO> usuarios = usuarioDAO.select();
            for (UsuarioDTO usuarioDTO : usuarios) {
                System.out.print( usuarioDTO );
                System.out.println();
            }

        } catch (SQLException e) {
            System.out.println("Excepcion en la capa de prueba");
            e.printStackTrace();
        }
    }

}