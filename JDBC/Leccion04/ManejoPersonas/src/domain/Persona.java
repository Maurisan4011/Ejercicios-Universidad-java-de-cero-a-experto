
package domain;

public class Persona {
     private int  id_persona;
     private String nombre;
     private String apellido;
     
     public int getId_persona(){
         return id_persona;
     }
     
     public void setId_persona(int idPersona){
          id_persona = idPersona;
     }
      public String getNombre(){
          return nombre;
      }
    public void setNombre(String nombre ){
        this.nombre = nombre;
        
    }
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
         
    @Override
    public String toString(){
        return "Persona{ " +"id_persona: " +id_persona+ "Nombre :"
                + " " +nombre+ ", Apellido: " +apellido+'}';
        
    }
}
