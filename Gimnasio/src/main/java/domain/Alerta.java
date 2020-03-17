package domain;

public class Alerta {
    public Integer id;
    public String descripccion;
    public Usuario unUsuario;


    public Alerta(Integer id, String descripccion, Usuario unUsuario) {
        this.id = id;
        this.descripccion = descripccion;
        this.unUsuario = unUsuario;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getDescripccion() {
        return descripccion;
    }
    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }
    public Usuario getUnUsuario() {
        return unUsuario;
    }
    public void setUnUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

    public void NotificaUsuario(){
        System.out.println("Se notifico al usuario");
    }
}
