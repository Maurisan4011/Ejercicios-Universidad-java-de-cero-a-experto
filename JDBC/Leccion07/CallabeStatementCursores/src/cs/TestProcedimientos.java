package cs;

import datos.Conexion;
import java.sql.*;

public class TestProcedimientos {

    public static void main(String[] args) {
        int empleadoId = 110;
        //la formula que aplica el Stores Procedure es 
        //salario = salario * incemento
        double incrementoSalario = 1.1;//incremento del 10 %
        Connection con;
        try {

            con = Conexion.getConnection();
            Statement stmt = null;
            ResultSet rset = null;
            CallableStatement cstmt = null;

            stmt = con.createStatement();

            //LLamamos al SP para incrementar el salario 
            System.out.println("Aumento del 10% al empleado : " + empleadoId);
            cstmt = con.prepareCall("{ call  set_employee_salary(?,?)}");
            cstmt.setInt(1, empleadoId);
            cstmt.setDouble(2, incrementoSalario);
            cstmt.execute();
            cstmt.close();

            //Obtenemos el nuevo valos del salario para el empleado seleccionado 
           String query = "SELECT first_name, salary FROM employees  " + "WHERE employee_id =  " + empleadoId;
           
           rset = stmt.executeQuery(query);
           rset.next();
            System.out.println("Nombre: " + rset.getString(1));
            System.out.println("Salario nuevo: " + rset.getFloat(2));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
