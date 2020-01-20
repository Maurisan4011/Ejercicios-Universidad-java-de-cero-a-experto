
package sobrecargaconstructores;


public class SobrecargaConstructores {

   
    public static void main(String[] args) {
        //El constructor vacio es privado, por lo que nos obliga a 
        //utilizar el unico contructor publico y por lo tanto
        //proporcionar valores en los campor nombre y edad 
        System.out.println("+**+*+*++*+*+*+*+*+*+*+*+*+*+*+**+*");
        Persona per1= new Persona("Lilia", 22);
        System.out.println("Imprimimos el objeto per1 de la clase persona per1 ");
        System.out.println(per1);
        
        //Creamos un objeto de tipo persona 
        System.out.println("+**+*+*++*+*+*+*+*+*+*+*+*+*+*+**+*");
        Persona per2= new Persona("Juan", 33);
        System.out.println("Imprimimos el objeto per1 de la clase persona  pero2");
        System.out.println(per2);
        
        //Creamos un objeto empleado emp1
        System.out.println("+**+*+*++*+*+*+*+*+*+*+*+*+*+*+**+*");
        Empleado emp1 = new Empleado("Pedro", 29, 18000);
        System.out.println("Imprimimos el objeto per1 de la clase persona  emp1");
        System.out.println(emp1);
        
        
    }
    
}
