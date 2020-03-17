package domain;

import java.util.List;

public class Usuario {
    public Integer id;
    public Integer idPermiso;
    public String nombre;
    public String contraseña;
    public TipoDeUsuario tipoDeUsuario;
    public List<Gym> gimnasios;


    public Usuario(Integer id, Integer idPermiso, String nombre, String contraseña, TipoDeUsuario tipoDeUsuario, List<Gym> gimnasios) {
        this.id = id;
        this.idPermiso = idPermiso;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tipoDeUsuario = tipoDeUsuario;
        this.gimnasios = gimnasios;
    }

    public List<Gym> getGimnasios() {
        return gimnasios;
    }
    public void setGimnasios(List<Gym> gimnasios) {
        this.gimnasios = gimnasios;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getIdPermiso() {
        return idPermiso;
    }
    public void setIdPermiso(Integer id) {
        this.id = idPermiso;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }
    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }


    public void VerSensores(){
        tipoDeUsuario.VerificarPermiso(idPermiso);
    }
    public void ABMConfiguraciones(){
        tipoDeUsuario.VerificarPermiso(idPermiso);
    }
    public void ABMUsuarios(){
        tipoDeUsuario.VerificarPermiso(idPermiso);
    }
    public void ABMGimnasios(){
        tipoDeUsuario.VerificarPermiso(idPermiso);
    }
}
