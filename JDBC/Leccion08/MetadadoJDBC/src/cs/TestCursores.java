package cs;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.*;

/**
 *
 * @author Mauri
 */
public class TestCursores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Utilizamos una clase de oracle para poder procesar el
        //cursor que ewgrea la funcion de Oracle
        OracleCallableStatement oraCallStmt = null;
        OracleResultSet depResultSet = null;
        try {
            Connection con = Conexion.getConnection();
            //Tiene dos parametros que posteriormente se definiran 
            oraCallStmt = (OracleCallableStatement) con.prepareCall("{? = call ref_cursor_package.get_dept_ref_cursor(?)}");
            //Indicamos el tipok de regreso, el cual es un cursor
            oraCallStmt.registerOutParameter(1, OracleTypes.CURSOR);//parametro 2
            oraCallStmt.setInt(2, 100);//establecemos departamento_id
            oraCallStmt.execute();

            //Recuperamos el resultset y lo convertimos a un tipo oracle 
            depResultSet = (OracleResultSet) oraCallStmt.getCursor(1);
            while (depResultSet.next()) {

                System.out.print(" Id:departamento:  " + depResultSet.getInt(1));
                System.out.print(",  Nombre_departemento: " + depResultSet.getString(2));
                System.out.print(",  Ubicacion_id:  " + depResultSet.getString(3));
                System.out.println();

            }
            oraCallStmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
