package manejousuarios;

import datos.UsuariosJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {

        UsuariosJDBC usuariosJDBC = new UsuariosJDBC();
        //  Prueba del metodo insert
        usuariosJDBC.insert(" APTostado", "recientostado");

        //Prueba de metodo UPdate
////        usuariosJDBC.update(2, "Matias", "lkfdoiudf");
        //Prueba del metodo delete
//    usuariosJDBC.delete(3);
        //Prueba del metodo selct 
        //Usi de un objeto usuario para encapsular la informacion 
        // de un registro de base de dato s
        List<Usuario> usuarios = usuariosJDBC.select();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
            System.out.println("*********Mauri Developer Java****** ");

        }

    }

}
