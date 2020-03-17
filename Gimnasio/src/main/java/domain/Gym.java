package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gym {
    public List<Regla> reglas;
    public List<Actuador> actuadores;
    public List<Sensor> sensores;
    public String localidad;
    public Integer id;

    public Gym(String localidad, Integer id) {
        this.reglas = new ArrayList<>();
        this.actuadores = new ArrayList<>();
        this.sensores = new ArrayList<>();
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
    public List<Regla> getReglas() {
        return reglas;
    }
    public void setReglas(List<Regla> reglas) {
        this.reglas = reglas;
    }
    public List<Actuador> getActuadores() {
        return actuadores;
    }
    public void setActuadores(List<Actuador> actuadores) {
        this.actuadores = actuadores;
    }
    public List<Sensor> getSensores() {
        return sensores;
    }
    public void setSensores(List<Sensor> sensores) {
        this.sensores = sensores;
    }


    public void addRegla(Regla unaRegla){
        reglas.add(unaRegla);
    }
    public void removeRegla(Regla unaRegla){
        reglas.remove(unaRegla);
    }
    public void addActuador(Actuador unActuador){
        actuadores.add(unActuador);
    }
    public void removeActuador(Actuador unActuador){
        actuadores.remove(unActuador);
    }
    public void addSensor(Sensor unSensor){
        sensores.add(unSensor);
    }
    public void removeSensor(Sensor unSensor){
        sensores.remove(unSensor);
    }
}
