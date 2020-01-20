import java.util.List;


public class Usuario {
	
	private final int idUsuario;
	
	private int cuit;
	
    private String nombre;

    private String  calle;
    
    private int numero;
    
    private List<Permiso> listaPermisos;
    
    private int contadorUsuarios;

    public Usuario() {
    	this.idUsuario = contadorUsuarios++;
	} 
     
   Usuario( int cuit, String nombre, String calle, int numero ) {
    	
    	this();
        this.cuit = cuit;
    	this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
    }

	public int getIdUsuario() {
		return idUsuario;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Permiso> getListaPermisos() {
		return listaPermisos;
	}

	public void setListaPermisos(List<Permiso> listaPermisos) {
		this.listaPermisos = listaPermisos;
	}

	   @Override
	   public String toString() {
	   return "Usuario {" +"\nIdUsuario = "+ idUsuario +"\ncuit = "+ cuit + "\nnombre= " + nombre 
	   		+ "\ncalle = " + calle + "\nnumero ="+ numero + '}';
	    
	    }

}
