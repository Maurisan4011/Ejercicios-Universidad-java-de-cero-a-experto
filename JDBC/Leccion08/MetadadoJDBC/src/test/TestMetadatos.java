package test;

import datos.Conexion;
import java.sql.*;
import oracle.jdbc.OracleResultSetMetaData;

/**
 *
 * @author Mauri
 */
public class TestMetadatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
            con = Conexion.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employees");

            //Obtenemos un objeto de metadatos de Oracle 
            OracleResultSetMetaData rsOracle
                    = (OracleResultSetMetaData) rs.getMetaData();
            
            if (rsOracle == null) {
                System.out.println("Metadatos no disponibles ");
                
            } else {
                //Preguntamos cuantas columnas tiene la tabla de empleados 
                int columnCount = rsOracle.getColumnCount();

                //DEsplegamos el no. de columnas 
                System.out.println("No. columnas:  " + columnCount);
                
                for (int i = 1; i < columnCount; i++) {
                    //DEsplegamos el nombre de la columna 
                    System.out.print("Nombre Columna: " + rsOracle.getColumnName(i));

                    //Desplegamos el tipo de la columna 
                    System.out.print(",  Tipo de columna:   " + rsOracle.getColumnTypeName(i));

                    //Desplegamos si la columna puede almacenar valores nuelo 
                    switch (rsOracle.isNullable(i)) {
                        case OracleResultSetMetaData.columnNoNulls:
                            System.out.print(",  No acpta nulos ");
                            break;
                        case OracleResultSetMetaData.columnNullable:
                            System.out.print(",  Si acepta nulos ");
                            break;
                        case OracleResultSetMetaData.columnNullableUnknown:
                            System.out.print(", Valor nulo desconocido");
                    }
                    System.out.println("");
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conexion.close(rs);
            Conexion.close(con);
        }
    }
    
}
