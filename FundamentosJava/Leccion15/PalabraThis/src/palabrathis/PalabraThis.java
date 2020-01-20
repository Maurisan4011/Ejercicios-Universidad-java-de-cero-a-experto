package palabrathis;

public class PalabraThis {

    public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }

}

class Persona{
        String nombre; //Atributo de la clase
        
        Persona (String nombre  ){
        this.nombre = nombre; //this es el objeto Persona (actial) 
            
        //Imprimir el objeto persona
            Imprimir i = new Imprimir();
            i.imprimir(this); //this es el objeto Persona (actual)
        
        

}

}

class Imprimir {

    public void imprimir(Object o) {
        System.out.println("Imprimir parametro :  " + o); // el paramtreo es el objeto¨Persona
        System.out.println("Imprimir objeto actual (this):   " + this); // this es el objeto imprimir (actual)

    }

}
