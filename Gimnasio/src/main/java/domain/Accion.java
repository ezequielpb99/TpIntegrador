package domain;

public class Accion {
    public Integer id;
    public String descripccion;
    public Actuador unActuador;

    public Accion(Integer id, String descripccion, Actuador unActuador) {
        this.id = id;
        this.descripccion = descripccion;
        this.unActuador = unActuador;
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
    public Actuador getUnActuador() {
        return unActuador;
    }
    public void setUnActuador(Actuador unActuador) {
        this.unActuador = unActuador;
    }

    public void Accionar(){
        unActuador.Accionar();
    }
}
