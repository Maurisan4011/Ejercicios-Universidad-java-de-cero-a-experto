
package ejemploherencia;

public class EjemploHerencia {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Lucas", 15000);
        System.out.println("Imprimimos el objeto Empleado 1 y agregamos "
                + "datos/importamos clase padre ");
        System.out.println(emp1);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        Empleado emp2 = new Empleado("Santino", 5698);
        emp2.setEdad(4);
        emp2.setGenero('M');
        emp2.setDireccion("Buenos Aires, Argentina");
         System.out.println("Imprimimos el objeto Empleado 2 y agregamos "
                + "datos/importamos clase padre ");
        System.out.println(emp2);
          emp2.setEdad(8);
        emp2.setGenero('F');
        emp2.setDireccion("Corrientes, Argentina");
        System.out.println("Modificamos dato  sin  modificar el id ");
        System.out.println(emp2);
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        
        
        //Cramos otro objeto con la clase hija Cliente
        //Al crear un nuevo objeto java.utlil.date nos regresa la fecha actual!!
        Cliente clien1 = new Cliente (new java.util.Date(),false);
        System.out.println("\n Imprimimos el objeto Cliente1 ");
        System.out.println(clien1);
        
         System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
         clien1.setNombre("Francesca");
         clien1.setGenero('F');
         clien1.setEdad(2);
         clien1.setDireccion("Wilde, Buenos Aires");
         
         System.out.println("Imprimimos el objeto Cliente 1 y agregamos "
                + "datos/importamos clase padre ");
        System.out.println(clien1);
        
         Cliente clien2 = new Cliente (new java.util.Date(),false);
        System.out.println("\n Imprimimos el objeto Cliente2 ");
        System.out.println(clien2);
        
        
    }
    
}
