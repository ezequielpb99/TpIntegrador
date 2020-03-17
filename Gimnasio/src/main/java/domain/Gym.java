package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gym {
    public List<Usuario> usuarios;
    public List<Regla> reglas;
    public List<Actuador> actuadores;
    public String localidad;
    public Integer id;

    public Gym(List<Usuario> usuarios, List<Regla> reglas, List<Actuador> actuadores, String localidad, Integer id) {
        this.usuarios = usuarios;
        this.reglas = reglas;
        this.actuadores = actuadores;
        this.localidad = localidad;
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        localidad = localidad;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        id = id;
    }
    public List<Usuario> getUsuarios() {
        return usuarios;
    }
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    public List<Regla> getReglas() {
        return reglas;
    }
    public void setReglas(List<Regla> reglas) {
        this.reglas = reglas;
    }
    public List<Actuador> getActuadores() {
        return actuadores;
    }
    public void setActuadores(List<Actuador> sensores) {
        this.actuadores = sensores;
    }


}
