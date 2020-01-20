package manejopersonas;

import datos.PersonasJDBC;
import datos.Conexion;
import java.sql.*;

public class ManejoPersonas {

    public static void main(String[] args) {
        PersonasJDBC personasJDBC = new PersonasJDBC();

        //Creamos un objeto conexion, se va a compartir para todos los queries que ejecutemos 
        Connection conn = null;

        try {
            conn = Conexion.getConnection();
            //Revisamos la conexion  enta en modo autocommit
            //por default es autocommit == true
            if (conn.getAutoCommit()) {
                conn.setAutoCommit(false);

            }
            //Cramos el objeto PersonasJDBC, proporcionamos la conexion creada

            PersonasJDBC personas = new PersonasJDBC(conn);

            // empezamos a ejecutar sentencias ,recordar que una transaccion agrupa varias sentencis SQL
            //si algo falla  no se realizan los cambios en la BD
            //cammbio correcto
            personas.update(12, "Regreso 15", "Regrerereso");

            // Provocamos un error spuerando los 45 caracteres del campo apellido 
            personas.insert("Miguelito", 
                    
//                    "jsñhiodhgdihstpvnhsrmtgtc16"
//                    + "4g84g92gx98r49849r8x4h98496hc42958h4964h9b84d9849r8d4984958");

            "Ashhhhala25");
            
            
            personas.delete(5);
            personas.toString();
            //guardamos los cambios
            conn.commit();

        } catch (SQLException e) {
            
            //HAcemos rollback en caso de error
            try {
                System.out.println("Entramos al rollback");
                
                //imprimimos excepcion en consola
                e.printStackTrace(System.out);
                //Hacemos rollback
                conn.rollback();
                
            } catch (SQLException e1) {
                e1.printStackTrace(System.out);
            }
        }

    }

}
