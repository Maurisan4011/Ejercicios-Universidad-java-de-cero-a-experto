package domain;

public class Usuario {

    private int id_usuario;
    private String usuario;
    private String password;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override

    public String toString() {
        return "Usuario { " + "id_usuario: " + id_usuario + "Usuario: " + usuario + "Password: " + password + '}';

    }

}
