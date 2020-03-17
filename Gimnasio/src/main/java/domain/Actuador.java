package domain;

public class Actuador {
    public Integer id;
    public boolean estado;


    public Actuador(Integer id, boolean estado) {
        this.id = id;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public boolean isEstado() {
        return estado;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public void Accionar(){
        if (estado == false){
            Activar();
        }
        else {
            Desactivar();
        }
    }
    public void Activar(){
        System.out.println("Actuador activado");
        setEstado(true);
    }
    public void Desactivar(){
        System.out.println("Actuador desactivado");
        setEstado(false);
    }
}
