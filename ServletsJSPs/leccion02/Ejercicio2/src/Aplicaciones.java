import java.util.List;


public class Aplicaciones {
	private int idApp;
	private String nombre;
	private List<Permiso> listaPermisos;
	private int contadorAplicaciones;
	
	public Aplicaciones() {
		this.idApp = contadorAplicaciones++;
		
	}
	
	public Aplicaciones(  String nombre ){
		this();
	    this.nombre = nombre;	
		
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Permiso> getListaPermisos() {
		return listaPermisos;
	}

	public void setListaPermisos(List<Permiso> listaPermisos) {
		this.listaPermisos = listaPermisos;
	}
	
	
	 @Override
	   public String toString() {
	   return "Apicaciones {" +"\nIdApp = "+ idApp +"\n Nombre App = "+ nombre+ '}';    
	    }
	

}
