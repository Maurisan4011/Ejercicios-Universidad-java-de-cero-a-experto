package cs;

import datos.Conexion;
import java.sql.*;

public class TestFunciones {

    public static void main(String[] args) {
        int empleadoId = 110; // indentificador a recuperar salario
        try {
            Connection con = Conexion.getConnection();
            // Objeto que permite ejecutar una funcion o store procedure
            CallableStatement cstmt = null;
            double salarioMensual;

            // Llamamos a una funcion de Oracle
            cstmt = con.prepareCall("{ ? = call get_employee_salary(?) }");
			// Una funcion regresa un valor
            // por lo que lo registramos como el parametro 1
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            // registrmos el segundo parametro
            cstmt.setInt(2, empleadoId);
            cstmt.execute();
            salarioMensual = cstmt.getDouble(1);
            cstmt.close();
            System.out.println("Empleado con id:" + empleadoId);
            System.out.println("Salario $" + salarioMensual);

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}